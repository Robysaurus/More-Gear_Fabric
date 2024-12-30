package dog.robysaurus.moregear.util;

import dog.robysaurus.moregear.item.ModItems;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {
    private static final Identifier RUINED_PORTAL_ID = Identifier.of("minecraft", "chests/ruined_portal");//HYPHITE
    private static final Identifier BURIED_TREASURE_ID = Identifier.of("minecraft", "chests/buried_treasure");//OPAL
    private static final Identifier DUNGEON_ID = Identifier.of("minecraft", "chests/simple_dungeon");//TOPAZ
    private static final Identifier NETHER_FORTRESS_ID = Identifier.of("minecraft", "chests/nether_bridge");//RUBY
    private static final Identifier BASTION_TREASURE_ID = Identifier.of("minecraft", "chests/bastion_treasure");//SAPPHIRE
    private static final Identifier BASTION_BRIDGE_ID = Identifier.of("minecraft", "chests/bastion_bridge");//PHENON
    private static final Identifier STRONGHOLD_CROSSING_ID = Identifier.of("minecraft", "chests/stronghold_crossing");//ENDIUM
    private static final Identifier ANCIENT_CITY_ID = Identifier.of("minecraft", "chests/ancient_city");//MYTHRIL
    private static final Identifier END_CITY_ID = Identifier.of("minecraft", "chests/end_city_treasure");//TRIPHITE
    private static final Identifier MANSION_ID = Identifier.of("minecraft", "chests/woodland_mansion");//TITANIUM
    private static final Identifier DRAGON_ID = Identifier.of("minecraft", "entities/ender_dragon");//ELYTRA-CHESTPLATE

    public static void modifyLootTables(){
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            if(RUINED_PORTAL_ID.equals(key.getValue())){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f))
                        .with(ItemEntry.builder(ModItems.HYPHITE_UPGRADE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f,1f)));
                tableBuilder.pool(poolBuilder);
            }
            if(BURIED_TREASURE_ID.equals(key.getValue())){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f))
                        .with(ItemEntry.builder(ModItems.OPAL_UPGRADE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f,1f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(DUNGEON_ID.equals(key.getValue())){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f))
                        .with(ItemEntry.builder(ModItems.TOPAZ_UPGRADE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f,1f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(NETHER_FORTRESS_ID.equals(key.getValue())){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f))
                        .with(ItemEntry.builder(ModItems.RUBY_UPGRADE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f,1f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(BASTION_TREASURE_ID.equals(key.getValue())){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.2f))
                        .with(ItemEntry.builder(ModItems.SAPPHIRE_UPGRADE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f,1f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(BASTION_BRIDGE_ID.equals(key.getValue())){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.175f))
                        .with(ItemEntry.builder(ModItems.PHENON_UPGRADE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f,1f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(STRONGHOLD_CROSSING_ID.equals(key.getValue())){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.15f))
                        .with(ItemEntry.builder(ModItems.ENDIUM_UPGRADE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f,1f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(ANCIENT_CITY_ID.equals(key.getValue())){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f))
                        .with(ItemEntry.builder(ModItems.MYTHRIL_UPGRADE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f,1f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(END_CITY_ID.equals(key.getValue())){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f))
                        .with(ItemEntry.builder(ModItems.REINFORCED_TRIPHITE_UPGRADE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f,1f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(MANSION_ID.equals(key.getValue())){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.125f))
                        .with(ItemEntry.builder(ModItems.TITANIUM_UPGRADE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f,1f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(DRAGON_ID.equals(key.getValue())){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(ModItems.ELYTRA_CHESTPLATE_UPGRADE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f,1f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
        });
    }
}
