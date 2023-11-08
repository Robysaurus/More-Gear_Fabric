package dog.robysaurus.moregear.world.gen;

import dog.robysaurus.moregear.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModOreGeneration {
    public static void generateOres(){
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
            GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.OPALORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
            GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.TOPAZORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),
            GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.RUBYORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
            GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.SAPPHIREORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.NETHER_WASTES),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.HYPHITEORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_HIGHLANDS, BiomeKeys.END_BARRENS),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.TITANIUMORE_PLACED_KEY);
    }
}