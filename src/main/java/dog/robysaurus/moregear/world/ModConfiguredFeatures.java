package dog.robysaurus.moregear.world;

import dog.robysaurus.moregear.MoreGear;
import dog.robysaurus.moregear.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?,?>> TITANIUM_KEY = registerKey("titaniumore_key");
    public static void bootstrap(Registerable<ConfiguredFeature<?,?>> context){
        RuleTest endStoneReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);
        List<OreFeatureConfig.Target> titaniumOre =
                List.of(OreFeatureConfig.createTarget(endStoneReplaceables, ModBlocks.TITANIUM_ORE.getDefaultState()));
        register(context, TITANIUM_KEY, Feature.ORE, new OreFeatureConfig(titaniumOre, 3));
    }
    public static RegistryKey<ConfiguredFeature<?,?>> registerKey(String name){
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(MoreGear.MOD_ID, name));
    }
    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?,?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?,?>> key, F feature, FC configuration){
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
