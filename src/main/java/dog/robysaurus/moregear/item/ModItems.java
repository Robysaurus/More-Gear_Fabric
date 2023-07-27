package dog.robysaurus.moregear.item;

import dog.robysaurus.moregear.MoreGear;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
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
    public static final Item ECHO_HELMET = registerItem("echohelmet",
            new ModArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.HELMET, new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item ECHO_CHESTPLATE = registerItem("echochestplate",
            new ArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item ECHO_LEGGINGS = registerItem("echoleggings",
            new ArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.LEGGINGS, new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item ECHO_BOOTS = registerItem("echoboots",
            new ArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.BOOTS, new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item EMERALD_HELMET = registerItem("emeraldhelmet",
            new ModArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.HELMET, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item EMERALD_CHESTPLATE = registerItem("emeraldchestplate",
            new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item EMERALD_LEGGINGS = registerItem("emeraldleggings",
            new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.LEGGINGS, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item EMERALD_BOOTS = registerItem("emeraldboots",
            new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.BOOTS, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item AMETHYST_HELMET = registerItem("amethysthelmet",
            new ModArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.HELMET, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item AMETHYST_CHESTPLATE = registerItem("amethystchestplate",
            new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item AMETHYST_LEGGINGS = registerItem("amethystleggings",
            new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.LEGGINGS, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item AMETHYST_BOOTS = registerItem("amethystboots",
            new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.BOOTS, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item COPPER_HELMET = registerItem("copperhelmet",
            new ModArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item COPPER_CHESTPLATE = registerItem("copperchestplate",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item COPPER_LEGGINGS = registerItem("copperleggings",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item COPPER_BOOTS = registerItem("copperboots",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(MoreGear.MOD_ID, name), item);
    }
    public static void registerModItems(){
        MoreGear.LOGGER.info("Registering Mod Items for "+MoreGear.MOD_ID);
    }
}
