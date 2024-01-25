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
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?,?>> PHYSICSIUM_KEY = registerKey("physicsiumore_key");
    public static final RegistryKey<ConfiguredFeature<?,?>> TITANIUM_KEY = registerKey("titaniumore_key");
    public static final RegistryKey<ConfiguredFeature<?,?>> TRIPHITE_GEODE_KEY = registerKey("triphite_geode_key");
    public static final RegistryKey<ConfiguredFeature<?,?>> MYTHRIL_KEY = registerKey("mythrilore_key");
    public static final RegistryKey<ConfiguredFeature<?,?>> ENDIUM_GEODE_KEY = registerKey("endium_geode_key");
    public static final RegistryKey<ConfiguredFeature<?,?>> PHENON_GEODE_KEY = registerKey("phenon_geode_key");
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
        RuleTest voidReplaceables = new BlockMatchRuleTest(Blocks.AIR);

        List<OreFeatureConfig.Target> physicsiumOre =
                List.of(OreFeatureConfig.createTarget(voidReplaceables, ModBlocks.PHYSICSIUM_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> titaniumOre =
                List.of(OreFeatureConfig.createTarget(endStoneReplaceables, ModBlocks.TITANIUM_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> mythrilOre =
                List.of(OreFeatureConfig.createTarget(endStoneReplaceables, ModBlocks.MYTHRIL_ORE.getDefaultState()));
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

        register(context, OPAL_KEY, Feature.ORE, new OreFeatureConfig(opalOre, 5));
        register(context, TOPAZ_KEY, Feature.ORE, new OreFeatureConfig(topazOre, 5));
        register(context, RUBY_KEY, Feature.ORE, new OreFeatureConfig(rubyOre, 4));
        register(context, SAPPHIRE_KEY, Feature.ORE, new OreFeatureConfig(sapphireOre, 4));
        register(context, HYPHITE_KEY, Feature.ORE, new OreFeatureConfig(hyphiteOre, 4));
        register(context, MYTHRIL_KEY, Feature.ORE, new OreFeatureConfig(mythrilOre, 4));
        register(context, TITANIUM_KEY, Feature.ORE, new OreFeatureConfig(titaniumOre, 3));
        register(context, PHYSICSIUM_KEY, Feature.ORE, new OreFeatureConfig(physicsiumOre, 3));

        register(context, PHENON_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(new GeodeLayerConfig(BlockStateProvider.of(Blocks.AIR),
                BlockStateProvider.of(ModBlocks.RUBY_ORE),
                BlockStateProvider.of(ModBlocks.UNREFINED_PHENON_BLOCK),
                BlockStateProvider.of(Blocks.ANCIENT_DEBRIS),
                BlockStateProvider.of(Blocks.NETHER_GOLD_ORE),
                List.of(ModBlocks.RUBY_ORE.getDefaultState(), ModBlocks.UNREFINED_PHENON_BLOCK.getDefaultState()),
                BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(0.75f, 0.35f, 0.5f, 1f),
                new GeodeCrackConfig(0.75D, 0.75D, 1),
                0.5D, 0.375D, true, UniformIntProvider.create(3,6), UniformIntProvider.create(1,4), UniformIntProvider.create(1,2),
                -18, 18, 0.05D, 1));
        register(context, ENDIUM_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(new GeodeLayerConfig(BlockStateProvider.of(Blocks.AIR),
                BlockStateProvider.of(ModBlocks.ANCIENT_ENDIUM),
                BlockStateProvider.of(ModBlocks.HYPHITE_BLOCK),
                BlockStateProvider.of(ModBlocks.SAPPHIRE_ORE),
                BlockStateProvider.of(Blocks.OBSIDIAN),
                List.of(ModBlocks.HYPHITE_BLOCK.getDefaultState(), ModBlocks.SAPPHIRE_ORE.getDefaultState(), ModBlocks.ANCIENT_ENDIUM.getDefaultState()),
                BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(0.5f, 0.2f, 0.3f, 0.75f),
                new GeodeCrackConfig(0.0D, 0.0D, 0),
                1.0D, 1.0D, true, UniformIntProvider.create(1,4), UniformIntProvider.create(1,3), UniformIntProvider.create(1,1),
                -10, 10, 0.025, 0));
        register(context, TRIPHITE_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(new GeodeLayerConfig(BlockStateProvider.of(Blocks.AIR),
                BlockStateProvider.of(ModBlocks.TRIPHITE_ORE),
                BlockStateProvider.of(Blocks.NETHERITE_BLOCK),
                BlockStateProvider.of(ModBlocks.MYTHRIL_ORE),
                BlockStateProvider.of(Blocks.DIAMOND_BLOCK),
                List.of(ModBlocks.TRIPHITE_ORE.getDefaultState(), Blocks.NETHERITE_BLOCK.getDefaultState(), ModBlocks.MYTHRIL_ORE.getDefaultState()),
                BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(0.5f, 0.2f, 0.3f, 0.75f),
                new GeodeCrackConfig(0.0D, 0.0D, 0),
                1.0D, 1.0D, true, UniformIntProvider.create(1,4), UniformIntProvider.create(1,3), UniformIntProvider.create(1,1),
                -10, 10, 0.025, 0));
    }
    public static RegistryKey<ConfiguredFeature<?,?>> registerKey(String name){
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(MoreGear.MOD_ID, name));
    }
    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?,?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?,?>> key, F feature, FC configuration){
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
