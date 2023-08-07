package dog.robysaurus.moregear.item;

import dog.robysaurus.moregear.MoreGear;
import dog.robysaurus.moregear.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup GEARGROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MoreGear.MOD_ID),
            FabricItemGroup.builder().displayName(Text.literal("More Gear"))
                    .icon(() -> new ItemStack(ModItems.TITANIUM_HELMET)).entries((displayContext, entries) -> {
                        entries.add(ModItems.TITANIUM_HELMET);
                        entries.add(ModItems.TITANIUM_CHESTPLATE);
                        entries.add(ModItems.TITANIUM_LEGGINGS);
                        entries.add(ModItems.TITANIUM_BOOTS);
                        entries.add(ModItems.TITANIUM_SWORD);
                        entries.add(ModItems.TITANIUM_AXE);
                        entries.add(ModItems.TITANIUM_PICKAXE);
                        entries.add(ModItems.TITANIUM_SHOVEL);
                        entries.add(ModItems.TITANIUM_HOE);
                        entries.add(ModItems.ECHO_HELMET);
                        entries.add(ModItems.ECHO_CHESTPLATE);
                        entries.add(ModItems.ECHO_LEGGINGS);
                        entries.add(ModItems.ECHO_BOOTS);
                        entries.add(ModItems.ECHO_SWORD);
                        entries.add(ModItems.ECHO_AXE);
                        entries.add(ModItems.ECHO_PICKAXE);
                        entries.add(ModItems.ECHO_SHOVEL);
                        entries.add(ModItems.ECHO_HOE);
                        entries.add(ModItems.EMERALD_HELMET);
                        entries.add(ModItems.EMERALD_CHESTPLATE);
                        entries.add(ModItems.EMERALD_LEGGINGS);
                        entries.add(ModItems.EMERALD_BOOTS);
                        entries.add(ModItems.EMERALD_SWORD);
                        entries.add(ModItems.EMERALD_AXE);
                        entries.add(ModItems.EMERALD_PICKAXE);
                        entries.add(ModItems.EMERALD_SHOVEL);
                        entries.add(ModItems.EMERALD_HOE);
                        entries.add(ModItems.AMETHYST_HELMET);
                        entries.add(ModItems.AMETHYST_CHESTPLATE);
                        entries.add(ModItems.AMETHYST_LEGGINGS);
                        entries.add(ModItems.AMETHYST_BOOTS);
                        entries.add(ModItems.AMETHYST_SWORD);
                        entries.add(ModItems.AMETHYST_AXE);
                        entries.add(ModItems.AMETHYST_PICKAXE);
                        entries.add(ModItems.AMETHYST_SHOVEL);
                        entries.add(ModItems.AMETHYST_HOE);
                        entries.add(ModItems.COPPER_HELMET);
                        entries.add(ModItems.COPPER_CHESTPLATE);
                        entries.add(ModItems.COPPER_LEGGINGS);
                        entries.add(ModItems.COPPER_BOOTS);
                        entries.add(ModItems.COPPER_SWORD);
                        entries.add(ModItems.COPPER_AXE);
                        entries.add(ModItems.COPPER_PICKAXE);
                        entries.add(ModItems.COPPER_SHOVEL);
                        entries.add(ModItems.COPPER_HOE);
                        entries.add(ModItems.RAW_TITANIUM);
                        entries.add(ModItems.TITANIUM);
                        entries.add(ModBlocks.TITANIUM_ORE);
                        entries.add(ModBlocks.TITANIUM_BLOCK);
                    }).build());
    public static void registerItemGroups(){
        MoreGear.LOGGER.info("Registering Mod Item Groups for "+MoreGear.MOD_ID);
    }
}
