package com.github.toripan0310.toripans.datagen.server;

import com.github.toripan0310.toripans.block.ToripansBlocks;
import com.github.toripan0310.toripans.item.ToripansItems;
import com.github.toripan0310.toripans.tag.ToripansTags;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.function.Consumer;

public class ToripansRecipeProvider extends RecipeProvider {

    public ToripansRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC,
                ToripansItems.TORIPAN_JWEL.get(),
                RecipeCategory.BUILDING_BLOCKS,
                ToripansBlocks.TORIPAN_JWEL_BLOCK.get());

        SimpleCookingRecipeBuilder.blasting(
                Ingredient.of(ToripansItems.TORIPAN_MEAT.get()),
                        RecipeCategory.MISC,
                        ToripansItems.COOKED_TORIPAN_MEAT.get(),
                        0.8f,
                        100
        )
                        .unlockedBy("has_toripan_meat", has(ToripansItems.TORIPAN_MEAT.get()))
                .save(pWriter, "toripans:cooked_toripan_meat_from_blasting");

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ToripansItems.YAKITORI.get())
                .pattern(" M ")
                .pattern(" M ")
                .pattern("BM ")
                .define('B', Items.BONE)
                .define('M', ToripansItems.COOKED_TORIPAN_MEAT.get())
                .unlockedBy("has_cooked_toriapn_meat", has(ToripansItems.COOKED_TORIPAN_MEAT.get()))
                .save(pWriter);

        woodFromLogs(pWriter, ToripansBlocks.TORIPAN_WOOD.get(),
                ToripansBlocks.TORIPAN_LOG.get());
        woodFromLogs(pWriter, ToripansBlocks.STRIPPED_TORIPAN_WOOD.get(),
                ToripansBlocks.STRIPPED_TORIPAN_LOG.get());

        planksFromLog(pWriter,
                ToripansBlocks.TORIPAN_PLANKS.get(),
                ToripansTags.Items.TORIPAN_LOG, 4);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS,
                ToripansBlocks.TORIPAN_SLAB.get(),
                ToripansBlocks.TORIPAN_PLANKS.get());
        stairs(pWriter,
                ToripansBlocks.TORIPAN_STAIRS.get(),
                ToripansBlocks.TORIPAN_PLANKS.get());
        fence(pWriter,
                ToripansBlocks.TORIPAN_FENCE.get(),
                ToripansBlocks.TORIPAN_PLANKS.get());
        fenceGate(pWriter,
                ToripansBlocks.TORIPAN_FENCE_GATE.get(),
                ToripansBlocks.TORIPAN_PLANKS.get());
        door(pWriter,
                ToripansBlocks.TORIPAN_DOOR.get(),
                ToripansBlocks.TORIPAN_PLANKS.get());
        trapdoor(pWriter,
                ToripansBlocks.TORIPAN_TRAPDOOR.get(),
                ToripansBlocks.TORIPAN_PLANKS.get());
        button(pWriter,
                ToripansBlocks.TORIPAN_BUTTON.get(),
                ToripansBlocks.TORIPAN_PLANKS.get());
        pressurePlate(pWriter,
                ToripansBlocks.TORIPAN_PRESSURE_PLATE.get(),
                ToripansBlocks.TORIPAN_PLANKS.get());


    }

    protected static void nineBlockStorageRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer,
                                                  RecipeCategory pUnpackedCategory,
                                                  ItemLike pUnpacked,
                                                  RecipeCategory pPackedCategory,
                                                  ItemLike pPacked) {
        ShapelessRecipeBuilder.shapeless(pUnpackedCategory, pUnpacked, 9)
                .requires(pPacked).unlockedBy(getHasName(pPacked), has(pPacked)).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(pPackedCategory, pPacked).define('#', pUnpacked)
                .pattern("###").pattern("###").pattern("###")
                .unlockedBy(getHasName(pUnpacked), has(pUnpacked)).save(pFinishedRecipeConsumer);
    }
    private static void stairs(Consumer<FinishedRecipe> pWriter, ItemLike pResult, ItemLike pIngredient) {
        stairBuilder(pResult, Ingredient.of(pIngredient))
                .unlockedBy(getHasName(pIngredient), has(pIngredient))
                .save(pWriter);
    }
    private static void fence(Consumer<FinishedRecipe> pWriter, ItemLike pResult, ItemLike pIngredient) {
        fenceBuilder(pResult, Ingredient.of(pIngredient))
                .unlockedBy(getHasName(pIngredient), has(pIngredient))
                .save(pWriter);
    }
    private static void fenceGate(Consumer<FinishedRecipe> pWriter, ItemLike pResult,
                                  ItemLike pIngredient) {
        fenceGateBuilder(pResult, Ingredient.of(pIngredient))
                .unlockedBy(getHasName(pIngredient), has(pIngredient))
                .save(pWriter);
    }
    private static void door(Consumer<FinishedRecipe> pWriter, ItemLike pResult, ItemLike pIngredient) {
        doorBuilder(pResult, Ingredient.of(pIngredient))
                .unlockedBy(getHasName(pIngredient), has(pIngredient))
                .save(pWriter);
    }
    private static void trapdoor(Consumer<FinishedRecipe> pWriter, ItemLike pResult,
                                 ItemLike pIngredient) {
        trapdoorBuilder(pResult, Ingredient.of(pIngredient))
                .unlockedBy(getHasName(pIngredient), has(pIngredient))
                .save(pWriter);
    }
    private static void button(Consumer<FinishedRecipe> pWriter, ItemLike pResult, ItemLike pIngredient) {
        buttonBuilder(pResult, Ingredient.of(pIngredient))
                .unlockedBy(getHasName(pIngredient), has(pIngredient))
                .save(pWriter);
    }
}
