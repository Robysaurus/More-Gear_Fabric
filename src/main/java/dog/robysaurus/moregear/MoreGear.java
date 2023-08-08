package dog.robysaurus.moregear;

import dog.robysaurus.moregear.block.ModBlocks;
import dog.robysaurus.moregear.item.ModItemGroups;
import dog.robysaurus.moregear.item.ModItems;
import dog.robysaurus.moregear.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

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

		ModWorldGeneration.generateModWorldGen();
	}
}