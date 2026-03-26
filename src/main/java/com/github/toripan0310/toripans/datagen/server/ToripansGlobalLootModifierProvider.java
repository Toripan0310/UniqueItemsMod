package com.github.toripan0310.toripans.datagen.server;

import com.github.toripan0310.toripans.ToripansMod;
import com.github.toripan0310.toripans.item.ToripansItems;
import com.github.toripan0310.toripans.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ToripansGlobalLootModifierProvider extends GlobalLootModifierProvider {
    public ToripansGlobalLootModifierProvider(PackOutput output) {
        super(output, ToripansMod.MOD_ID);
    }

    @Override
    @SuppressWarnings({ "unchecked", "removal" })
    protected void start() {

        add("toripans_jwel_from_ruined_portal", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/ruined_portal")).build()
        }, ToripansItems.TORIPAN_JWEL.get()));

        add("toripans_jwel_from_abandoned_mineshaft", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/abandoned_mineshaft")).build()
        }, ToripansItems.TORIPAN_JWEL.get()));

        add("toripans_jwel_from_ancient_city", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/ancient_city")).build()
        }, ToripansItems.TORIPAN_JWEL.get()));

        add("toripans_jwel_from_ancient_city_ice_box", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/ancient_city_ice_box")).build()
        }, ToripansItems.TORIPAN_JWEL.get()));

        add("toripans_jwel_from_bastion_bridge", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_bridge")).build()
        }, ToripansItems.TORIPAN_JWEL.get()));

        add("toripans_jwel_from_bastion_hoglin_stable", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_hoglin_stable")).build()
        }, ToripansItems.TORIPAN_JWEL.get()));

        add("toripans_jwel_from_bastion_other", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_other")).build()
        }, ToripansItems.TORIPAN_JWEL.get()));

        add("toripans_jwel_from_bastion_treasure", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_treasure")).build()
        }, ToripansItems.TORIPAN_JWEL.get()));

        add("toripans_jwel_from_buried_terasure", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/buried_treasure")).build()
        }, ToripansItems.TORIPAN_JWEL.get()));

        add("toripans_jwel_from_desert_pyramid", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/desert_pyramid")).build()
        }, ToripansItems.TORIPAN_JWEL.get()));

        add("toripans_jwel_from_end_city_treasure", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/end_city_treasure")).build()
        }, ToripansItems.TORIPAN_JWEL.get()));

        add("toripans_jwel_from_igloo_chest", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/igloo_chest")).build()
        }, ToripansItems.TORIPAN_JWEL.get()));

        add("toripans_jwel_from_jungle_temple", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/jungle_temple")).build()
        }, ToripansItems.TORIPAN_JWEL.get()));

        add("toripans_jwel_from_nether_bridge", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/nether_bridge")).build()
        }, ToripansItems.TORIPAN_JWEL.get()));

        add("toripans_jwel_from_pillager_outpost", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/pillager_outpost")).build()
        }, ToripansItems.TORIPAN_JWEL.get()));

        add("toripans_jwel_from_shipwreck_treasure", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_treasure")).build()
        }, ToripansItems.TORIPAN_JWEL.get()));

        add("toripans_jwel_from_spawn_bonus_chest", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/spawn_bonus_chest")).build()
        }, ToripansItems.TORIPAN_JWEL.get()));

    }
}
