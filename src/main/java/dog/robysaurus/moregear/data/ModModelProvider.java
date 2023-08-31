package dog.robysaurus.moregear.data;

import dog.robysaurus.moregear.block.ModBlocks;
import dog.robysaurus.moregear.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TITANIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TITANIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TOPAZ_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TOPAZ_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SAPPHIRE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SAPPHIRE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OPAL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OPAL_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_TITANIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.TITANIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_TOPAZ, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOPAZ, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_OPAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.OPAL, Models.GENERATED);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.TITANIUM_HELMET);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.TITANIUM_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.TITANIUM_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.TITANIUM_BOOTS);
        itemModelGenerator.register(ModItems.TITANIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.TOPAZ_HELMET);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.TOPAZ_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.TOPAZ_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.TOPAZ_BOOTS);
        itemModelGenerator.register(ModItems.TOPAZ_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TOPAZ_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TOPAZ_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TOPAZ_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TOPAZ_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.SAPPHIRE_HELMET);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.SAPPHIRE_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.SAPPHIRE_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.SAPPHIRE_BOOTS);
        itemModelGenerator.register(ModItems.SAPPHIRE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.RUBY_HELMET);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.RUBY_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.RUBY_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.RUBY_BOOTS);
        itemModelGenerator.register(ModItems.RUBY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.OPAL_HELMET);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.OPAL_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.OPAL_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.OPAL_BOOTS);
        itemModelGenerator.register(ModItems.OPAL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OPAL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OPAL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OPAL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OPAL_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.ECHO_HELMET);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.ECHO_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.ECHO_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.ECHO_BOOTS);
        itemModelGenerator.register(ModItems.ECHO_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ECHO_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ECHO_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ECHO_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ECHO_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.EMERALD_HELMET);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.EMERALD_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.EMERALD_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.EMERALD_BOOTS);
        itemModelGenerator.register(ModItems.EMERALD_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EMERALD_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EMERALD_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EMERALD_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EMERALD_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.AMETHYST_HELMET);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.AMETHYST_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.AMETHYST_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.AMETHYST_BOOTS);
        itemModelGenerator.register(ModItems.AMETHYST_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETHYST_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETHYST_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETHYST_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETHYST_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.COPPER_HELMET);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.COPPER_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.COPPER_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem)ModItems.COPPER_BOOTS);
        itemModelGenerator.register(ModItems.COPPER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_HOE, Models.HANDHELD);
    }
}
