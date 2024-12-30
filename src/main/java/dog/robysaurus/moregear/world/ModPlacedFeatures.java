package dog.robysaurus.moregear.world;

import dog.robysaurus.moregear.MoreGear;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> PHYSICSIUMORE_PLACED_KEY = registerKey("physicsiumore_placed_key");
    public static final RegistryKey<PlacedFeature> TITANIUMORE_PLACED_KEY = registerKey("titaniumore_placed_key");
    public static final RegistryKey<PlacedFeature> TRIPHITE_GEODE_PLACED_KEY = registerKey("triphite_geode_placed_key");
    public static final RegistryKey<PlacedFeature> MYTHRILORE_PLACED_KEY = registerKey("mythrilore_placed_key");
    public static final RegistryKey<PlacedFeature> ENDIUM_GEODE_PLACED_KEY = registerKey("endium_geode_placed_key");
    public static final RegistryKey<PlacedFeature> PHENON_GEODE_PLACED_KEY = registerKey("phenon_geode_placed_key");
    public static final RegistryKey<PlacedFeature> HYPHITEORE_PLACED_KEY = registerKey("hyphiteore_placed_key");
    public static final RegistryKey<PlacedFeature> OPALORE_PLACED_KEY = registerKey("opalore_placed_key");
    public static final RegistryKey<PlacedFeature> RUBYORE_PLACED_KEY = registerKey("rubyore_placed_key");
    public static final RegistryKey<PlacedFeature> SAPPHIREORE_PLACED_KEY = registerKey("sapphireore_placed_key");
    public static final RegistryKey<PlacedFeature> TOPAZORE_PLACED_KEY = registerKey("topazore_placed_key");
    public static void bootstrap(Registerable<PlacedFeature> context){
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, PHYSICSIUMORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PHYSICSIUM_KEY),
                modifiersWithCount(2, HeightRangePlacementModifier.uniform(YOffset.fixed(5), YOffset.fixed(10))));
        register(context, TITANIUMORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TITANIUM_KEY),
                modifiersWithCount(2, HeightRangePlacementModifier.uniform(YOffset.fixed(50), YOffset.fixed(70))));
        register(context, MYTHRILORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MYTHRIL_KEY),
                modifiersWithCount(3, HeightRangePlacementModifier.uniform(YOffset.fixed(50), YOffset.fixed(70))));
        register(context, HYPHITEORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.HYPHITE_KEY),
                modifiersWithCount(2, HeightRangePlacementModifier.uniform(YOffset.fixed(5), YOffset.fixed(35))));
        register(context, OPALORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.OPAL_KEY),
                modifiersWithCount(5, HeightRangePlacementModifier.uniform(YOffset.fixed(20), YOffset.fixed(60))));
        register(context, RUBYORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.RUBY_KEY),
                modifiersWithCount(2, HeightRangePlacementModifier.trapezoid(YOffset.fixed(30), YOffset.fixed(50))));
        register(context, SAPPHIREORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SAPPHIRE_KEY),
                modifiersWithCount(3, HeightRangePlacementModifier.uniform(YOffset.fixed(55), YOffset.fixed(70))));
        register(context, TOPAZORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TOPAZ_KEY),
                modifiersWithCount(3, HeightRangePlacementModifier.trapezoid(YOffset.fixed(-60), YOffset.fixed(-15))));

        register(context, PHENON_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PHENON_GEODE_KEY),
                RarityFilterPlacementModifier.of(5), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.fixed(5), YOffset.fixed(35)), BiomePlacementModifier.of());
        register(context, ENDIUM_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ENDIUM_GEODE_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.fixed(45), YOffset.fixed(60)), BiomePlacementModifier.of());
        register(context, TRIPHITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TRIPHITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(10), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.fixed(40), YOffset.fixed(50)), BiomePlacementModifier.of());
    }
    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(MoreGear.MOD_ID, name));
    }
    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?,?>> configuration,
                                 List<PlacementModifier> modifiers){
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
    public static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }

    public static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }

    public static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}
