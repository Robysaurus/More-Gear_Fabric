package dog.robysaurus.moregear.item;

import dog.robysaurus.moregear.MoreGear;
import dog.robysaurus.moregear.item.custom.EffectSwordItem;
import dog.robysaurus.moregear.item.custom.ModArmorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    public static final Item RAW_TITANIUM = registerItem("rawtitanium",
            new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).fireproof()));
    public static final Item TITANIUM = registerItem("titanium",
            new Item(new FabricItemSettings().rarity(Rarity.RARE).fireproof()));
    public static final Item TITANIUM_HELMET = registerItem("titaniumhelmet",
            new ModArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.HELMET, new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
    public static final Item TITANIUM_CHESTPLATE = registerItem("titaniumchestplate",
            new ArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
    public static final Item TITANIUM_LEGGINGS = registerItem("titaniumleggings",
            new ArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
    public static final Item TITANIUM_BOOTS = registerItem("titaniumboots",
            new ArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.BOOTS, new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
    public static final Item TITANIUM_SWORD = registerItem("titaniumsword",
            new EffectSwordItem(ModToolMaterials.TITANIUM, ModArmorMaterials.TITANIUM, 11, 4f, new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));
    public static final Item TITANIUM_AXE = registerItem("titaniumaxe",
            new AxeItem(ModToolMaterials.TITANIUM, 14f, 2f, new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));
    public static final Item TITANIUM_PICKAXE = registerItem("titaniumpickaxe",
            new PickaxeItem(ModToolMaterials.TITANIUM, 4, 2f, new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));
    public static final Item TITANIUM_SHOVEL = registerItem("titaniumshovel",
            new ShovelItem(ModToolMaterials.TITANIUM, 1.5f, 2.5f, new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));
    public static final Item TITANIUM_HOE = registerItem("titaniumhoe",
            new HoeItem(ModToolMaterials.TITANIUM, 1, 2.5f, new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));
    public static final Item ECHO_HELMET = registerItem("echohelmet",
            new ModArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.HELMET, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item ECHO_CHESTPLATE = registerItem("echochestplate",
            new ArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item ECHO_LEGGINGS = registerItem("echoleggings",
            new ArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.LEGGINGS, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item ECHO_BOOTS = registerItem("echoboots",
            new ArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.BOOTS, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item ECHO_SWORD = registerItem("echosword",
            new EffectSwordItem(ModToolMaterials.ECHO, ModArmorMaterials.ECHO,3, -2.4f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item ECHO_AXE = registerItem("echoaxe",
            new AxeItem(ModToolMaterials.ECHO, 5f, -3f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item ECHO_PICKAXE = registerItem("echopickaxe",
            new PickaxeItem(ModToolMaterials.ECHO, 1, -2.8f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item ECHO_SHOVEL = registerItem("echoshovel",
            new ShovelItem(ModToolMaterials.ECHO, 1.25f, -2.75f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item ECHO_HOE = registerItem("echohoe",
            new HoeItem(ModToolMaterials.ECHO, -2, -1f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item EMERALD_HELMET = registerItem("emeraldhelmet",
            new ModArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.HELMET, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item EMERALD_CHESTPLATE = registerItem("emeraldchestplate",
            new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item EMERALD_LEGGINGS = registerItem("emeraldleggings",
            new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.LEGGINGS, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item EMERALD_BOOTS = registerItem("emeraldboots",
            new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.BOOTS, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item EMERALD_SWORD = registerItem("emeraldsword",
            new SwordItem(ModToolMaterials.EMERALD,3, -2.4f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item EMERALD_AXE = registerItem("emeraldaxe",
            new AxeItem(ModToolMaterials.EMERALD, 6f, -3f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item EMERALD_PICKAXE = registerItem("emeraldpickaxe",
            new PickaxeItem(ModToolMaterials.EMERALD, 1, -2.8f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item EMERALD_SHOVEL = registerItem("emeraldshovel",
            new ShovelItem(ModToolMaterials.EMERALD, 1.25f, -2.75f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item EMERALD_HOE = registerItem("emeraldhoe",
            new HoeItem(ModToolMaterials.EMERALD, -2, -1f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item AMETHYST_HELMET = registerItem("amethysthelmet",
            new ModArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item AMETHYST_CHESTPLATE = registerItem("amethystchestplate",
            new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item AMETHYST_LEGGINGS = registerItem("amethystleggings",
            new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item AMETHYST_BOOTS = registerItem("amethystboots",
            new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item AMETHYST_SWORD = registerItem("amethystsword",
            new SwordItem(ModToolMaterials.AMETHYST,3, -2.4f, new FabricItemSettings()));
    public static final Item AMETHYST_AXE = registerItem("amethystaxe",
            new AxeItem(ModToolMaterials.AMETHYST, 6f, -3f, new FabricItemSettings()));
    public static final Item AMETHYST_PICKAXE = registerItem("amethystpickaxe",
            new PickaxeItem(ModToolMaterials.AMETHYST, 1, -2.8f, new FabricItemSettings()));
    public static final Item AMETHYST_SHOVEL = registerItem("amethystshovel",
            new ShovelItem(ModToolMaterials.AMETHYST, 1.5f, -2.75f, new FabricItemSettings()));
    public static final Item AMETHYST_HOE = registerItem("amethysthoe",
            new HoeItem(ModToolMaterials.AMETHYST, -2, -1f, new FabricItemSettings()));
    public static final Item COPPER_HELMET = registerItem("copperhelmet",
            new ModArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item COPPER_CHESTPLATE = registerItem("copperchestplate",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item COPPER_LEGGINGS = registerItem("copperleggings",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item COPPER_BOOTS = registerItem("copperboots",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item COPPER_SWORD = registerItem("coppersword",
            new SwordItem(ModToolMaterials.COPPER,3, -2.5f, new FabricItemSettings()));
    public static final Item COPPER_AXE = registerItem("copperaxe",
            new AxeItem(ModToolMaterials.COPPER, 5f, -3.25f, new FabricItemSettings()));
    public static final Item COPPER_PICKAXE = registerItem("copperpickaxe",
            new PickaxeItem(ModToolMaterials.COPPER, 1, -2.8f, new FabricItemSettings()));
    public static final Item COPPER_SHOVEL = registerItem("coppershovel",
            new ShovelItem(ModToolMaterials.COPPER, 1.25f, -2.5f, new FabricItemSettings()));
    public static final Item COPPER_HOE = registerItem("copperhoe",
            new HoeItem(ModToolMaterials.COPPER, -2, -1f, new FabricItemSettings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(MoreGear.MOD_ID, name), item);
    }
    public static void registerModItems(){
        MoreGear.LOGGER.info("Registering Mod Items for "+MoreGear.MOD_ID);
    }
}
