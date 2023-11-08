package dog.robysaurus.moregear.world;

import dog.robysaurus.moregear.MoreGear;
import dog.robysaurus.moregear.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?,?>> TITANIUM_KEY = registerKey("titaniumore_key");
    public static final RegistryKey<ConfiguredFeature<?,?>> HYPHITE_KEY = registerKey("hyphiteore_key");
    public static final RegistryKey<ConfiguredFeature<?,?>> OPAL_KEY = registerKey("opalore_key");
    public static final RegistryKey<ConfiguredFeature<?,?>> RUBY_KEY = registerKey("rubyore_key");
    public static final RegistryKey<ConfiguredFeature<?,?>> SAPPHIRE_KEY = registerKey("sapphireore_key");
    public static final RegistryKey<ConfiguredFeature<?,?>> TOPAZ_KEY = registerKey("topazore_key");
    public static void bootstrap(Registerable<ConfiguredFeature<?,?>> context){
        RuleTest stoneReplacables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplacables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest endStoneReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);
        RuleTest netherReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);

        List<OreFeatureConfig.Target> titaniumOre =
                List.of(OreFeatureConfig.createTarget(endStoneReplaceables, ModBlocks.TITANIUM_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> hyphiteOre =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.HYPHITE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> opalOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.OPAL_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> rubyOre =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.RUBY_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> sapphireOre =
                List.of(OreFeatureConfig.createTarget(endStoneReplaceables, ModBlocks.SAPPHIRE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> topazOre =
                List.of(OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.TOPAZ_ORE.getDefaultState()));

        register(context, RUBY_KEY, Feature.ORE, new OreFeatureConfig(rubyOre, 4));
        register(context, OPAL_KEY, Feature.ORE, new OreFeatureConfig(opalOre, 4));
        register(context, SAPPHIRE_KEY, Feature.ORE, new OreFeatureConfig(sapphireOre, 4));
        register(context, TOPAZ_KEY, Feature.ORE, new OreFeatureConfig(topazOre, 4));
        register(context, TITANIUM_KEY, Feature.ORE, new OreFeatureConfig(titaniumOre, 3));
        register(context, HYPHITE_KEY, Feature.ORE, new OreFeatureConfig(hyphiteOre, 4));
    }
    public static RegistryKey<ConfiguredFeature<?,?>> registerKey(String name){
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(MoreGear.MOD_ID, name));
    }
    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?,?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?,?>> key, F feature, FC configuration){
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
