package dog.robysaurus.moregear.data;

import dog.robysaurus.moregear.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

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
    }
}
