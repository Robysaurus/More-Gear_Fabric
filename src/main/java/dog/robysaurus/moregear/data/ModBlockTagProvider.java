package dog.robysaurus.moregear.data;

import dog.robysaurus.moregear.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.PHYSICSIUM_BLOCK)
                .add(ModBlocks.PHYSICSIUM_ORE)
                .add(ModBlocks.TITANIUM_BLOCK)
                .add(ModBlocks.TITANIUM_ORE)
                .add(ModBlocks.REINFORCED_TRIPHITE_BLOCK)
                .add(ModBlocks.TRIPHITE_ORE)
                .add(ModBlocks.MYTHRIL_BLOCK)
                .add(ModBlocks.MYTHRIL_ORE)
                .add(ModBlocks.ENDIUM_BLOCK)
                .add(ModBlocks.ANCIENT_ENDIUM)
                .add(ModBlocks.PHENON_BLOCK)
                .add(ModBlocks.UNREFINED_PHENON_BLOCK)
                .add(ModBlocks.SAPPHIRE_BLOCK)
                .add(ModBlocks.SAPPHIRE_ORE)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.TOPAZ_BLOCK)
                .add(ModBlocks.TOPAZ_ORE)
                .add(ModBlocks.OPAL_BLOCK)
                .add(ModBlocks.OPAL_ORE)
                .add(ModBlocks.HYPHITE_BLOCK)
                .add(ModBlocks.HYPHITE_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.SAPPHIRE_BLOCK)
                .add(ModBlocks.SAPPHIRE_ORE)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.TOPAZ_BLOCK)
                .add(ModBlocks.TOPAZ_ORE)
                .add(ModBlocks.OPAL_BLOCK)
                .add(ModBlocks.OPAL_ORE);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")))
                .add(ModBlocks.PHENON_BLOCK)
                .add(ModBlocks.UNREFINED_PHENON_BLOCK)
                .add(ModBlocks.HYPHITE_BLOCK)
                .add(ModBlocks.HYPHITE_ORE);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_5")))
                .add(ModBlocks.ENDIUM_BLOCK)
                .add(ModBlocks.ANCIENT_ENDIUM);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_6")))
                .add(ModBlocks.MYTHRIL_BLOCK)
                .add(ModBlocks.MYTHRIL_ORE);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_7")))
                .add(ModBlocks.REINFORCED_TRIPHITE_BLOCK)
                .add(ModBlocks.TRIPHITE_ORE);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_8")))
                .add(ModBlocks.TITANIUM_BLOCK)
                .add(ModBlocks.TITANIUM_ORE);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_9")))
                .add(ModBlocks.PHYSICSIUM_BLOCK)
                .add(ModBlocks.PHYSICSIUM_ORE);
    }
}
