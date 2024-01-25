package dog.robysaurus.moregear.data;

import dog.robysaurus.moregear.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.PHYSICSIUM_HELMET, ModItems.PHYSICSIUM_CHESTPLATE, ModItems.PHYSICSIUM_ELYTRA_CHESTPLATE, ModItems.PHYSICSIUM_LEGGINGS, ModItems.PHYSICSIUM_BOOTS)
                .add(ModItems.TITANIUM_HELMET, ModItems.TITANIUM_CHESTPLATE, ModItems.TITANIUM_LEGGINGS, ModItems.TITANIUM_BOOTS)
                .add(ModItems.REINFORCED_TRIPHITE_HELMET, ModItems.REINFORCED_TRIPHITE_CHESTPLATE, ModItems.REINFORCED_TRIPHITE_LEGGINGS, ModItems.REINFORCED_TRIPHITE_BOOTS)
                .add(ModItems.MYTHRIL_HELMET, ModItems.MYTHRIL_CHESTPLATE, ModItems.MYTHRIL_LEGGINGS, ModItems.MYTHRIL_BOOTS)
                .add(ModItems.ENDIUM_HELMET, ModItems.ENDIUM_CHESTPLATE, ModItems.ENDIUM_LEGGINGS, ModItems.ENDIUM_BOOTS)
                .add(ModItems.PHENON_HELMET, ModItems.PHENON_CHESTPLATE, ModItems.PHENON_LEGGINGS, ModItems.PHENON_BOOTS)
                .add(ModItems.SAPPHIRE_HELMET, ModItems.SAPPHIRE_CHESTPLATE, ModItems.SAPPHIRE_LEGGINGS, ModItems.SAPPHIRE_BOOTS)
                .add(ModItems.RUBY_HELMET, ModItems.RUBY_CHESTPLATE, ModItems.RUBY_LEGGINGS, ModItems.RUBY_BOOTS)
                .add(ModItems.TOPAZ_HELMET, ModItems.TOPAZ_CHESTPLATE, ModItems.TOPAZ_LEGGINGS, ModItems.TOPAZ_BOOTS)
                .add(ModItems.OPAL_HELMET, ModItems.OPAL_CHESTPLATE, ModItems.OPAL_LEGGINGS, ModItems.OPAL_BOOTS)
                .add(ModItems.HYPHITE_HELMET, ModItems.HYPHITE_CHESTPLATE, ModItems.HYPHITE_LEGGINGS, ModItems.HYPHITE_BOOTS)
                .add(ModItems.ECHO_HELMET, ModItems.ECHO_CHESTPLATE, ModItems.ECHO_LEGGINGS, ModItems.ECHO_BOOTS)
                .add(ModItems.EMERALD_HELMET, ModItems.EMERALD_CHESTPLATE, ModItems.EMERALD_LEGGINGS, ModItems.EMERALD_BOOTS)
                .add(ModItems.AMETHYST_HELMET, ModItems.AMETHYST_CHESTPLATE, ModItems.AMETHYST_LEGGINGS, ModItems.AMETHYST_BOOTS)
                .add(ModItems.COPPER_HELMET, ModItems.COPPER_CHESTPLATE, ModItems.COPPER_LEGGINGS, ModItems.COPPER_BOOTS);
    }
}
