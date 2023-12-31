package dog.robysaurus.moregear.world.gen;

import dog.robysaurus.moregear.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModGeodeGeneration {
    public static void generateGeodes(){
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),
                GenerationStep.Feature.LOCAL_MODIFICATIONS, ModPlacedFeatures.PHENON_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_HIGHLANDS, BiomeKeys.END_BARRENS),
                GenerationStep.Feature.LOCAL_MODIFICATIONS, ModPlacedFeatures.ENDIUM_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_HIGHLANDS, BiomeKeys.END_BARRENS),
                GenerationStep.Feature.LOCAL_MODIFICATIONS, ModPlacedFeatures.TRIPHITE_GEODE_PLACED_KEY);
    }
}
