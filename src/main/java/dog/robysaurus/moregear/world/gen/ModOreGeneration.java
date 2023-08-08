package dog.robysaurus.moregear.world.gen;

import dog.robysaurus.moregear.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class ModOreGeneration {
    public static void generateOres(){
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
            GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.TITANIUMORE_PLACED_KEY);
    }
}
