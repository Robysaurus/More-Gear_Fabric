package dog.robysaurus.moregear;

import dog.robysaurus.moregear.block.ModBlocks;
import dog.robysaurus.moregear.entity.ModEntities;
import dog.robysaurus.moregear.entity.custom.ShrikeEntity;
import dog.robysaurus.moregear.item.ModItemGroups;
import dog.robysaurus.moregear.item.ModItems;
import dog.robysaurus.moregear.networking.ModPackets;
import dog.robysaurus.moregear.util.ModLootTableModifiers;
import dog.robysaurus.moregear.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreGear implements ModInitializer {
	public static final String MOD_ID = "moregear";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModLootTableModifiers.modifyLootTables();
		ModWorldGeneration.generateModWorldGen();
		ModPackets.registerC2SPackets();
		ModEntities.registerModEntities();
		FabricDefaultAttributeRegistry.register(ModEntities.SHRIKE, ShrikeEntity.createShrikeAttributes());
	}
}