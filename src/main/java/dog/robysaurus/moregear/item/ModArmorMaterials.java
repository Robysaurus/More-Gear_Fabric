package dog.robysaurus.moregear.item;

import dog.robysaurus.moregear.MoreGear;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {
    public static final RegistryEntry<ArmorMaterial> COPPER = registerArmorMaterial("copper",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.CHESTPLATE, 5);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.BOOTS, 2);
            }), 7, SoundEvents.ITEM_ARMOR_EQUIP_IRON, () -> Ingredient.ofItems(Items.COPPER_INGOT),
            List.of(new ArmorMaterial.Layer(Identifier.of(MoreGear.MOD_ID, "copper"))), 0f ,0f));
    public static final RegistryEntry<ArmorMaterial> AMETHYST = registerArmorMaterial("amethyst",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.LEGGINGS, 5);
                map.put(ArmorItem.Type.BOOTS, 2);
            }), 12, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, () -> Ingredient.ofItems(Items.AMETHYST_SHARD),
            List.of(new ArmorMaterial.Layer(Identifier.of(MoreGear.MOD_ID, "amethyst"))), 0f ,0f));
    public static final RegistryEntry<ArmorMaterial> EMERALD = registerArmorMaterial("emerald",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.CHESTPLATE, 7);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.BOOTS, 2);
            }), 17, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(Items.EMERALD),
            List.of(new ArmorMaterial.Layer(Identifier.of(MoreGear.MOD_ID, "emerald"))), 1.7f ,0f));
    public static final RegistryEntry<ArmorMaterial> ECHO = registerArmorMaterial("echo",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.CHESTPLATE, 7);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.BOOTS, 3);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(Items.ECHO_SHARD),
            List.of(new ArmorMaterial.Layer(Identifier.of(MoreGear.MOD_ID, "echo"))), 2.5f ,0.05f));
    public static final RegistryEntry<ArmorMaterial> OPAL = registerArmorMaterial("opal",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.BOOTS, 3);
            }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.OPAL),
            List.of(new ArmorMaterial.Layer(Identifier.of(MoreGear.MOD_ID, "opal"))), 3.0f, 0.1f));
    public static final RegistryEntry<ArmorMaterial> RUBY = registerArmorMaterial("ruby",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.BOOTS, 3);
            }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.RUBY),
            List.of(new ArmorMaterial.Layer(Identifier.of(MoreGear.MOD_ID, "ruby"))), 3.0f, 0.1f));
    public static final RegistryEntry<ArmorMaterial> SAPPHIRE = registerArmorMaterial("sapphire",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.BOOTS, 3);
            }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.SAPPHIRE),
            List.of(new ArmorMaterial.Layer(Identifier.of(MoreGear.MOD_ID, "sapphire"))), 3.0f, 0.1f));
    public static final RegistryEntry<ArmorMaterial> TOPAZ = registerArmorMaterial("topaz",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.BOOTS, 3);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.TOPAZ),
            List.of(new ArmorMaterial.Layer(Identifier.of(MoreGear.MOD_ID, "topaz"))), 3.0f, 0.1f));
    public static final RegistryEntry<ArmorMaterial> HYPHITE = registerArmorMaterial("hyphite",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 9);
                map.put(ArmorItem.Type.LEGGINGS, 8);
                map.put(ArmorItem.Type.BOOTS, 4);
            }), 18, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.HYPHITE),
            List.of(new ArmorMaterial.Layer(Identifier.of(MoreGear.MOD_ID, "hyphite"))), 3.15f, 0.15f));
    public static final RegistryEntry<ArmorMaterial> PHENON = registerArmorMaterial("phenon",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 11);
                map.put(ArmorItem.Type.LEGGINGS, 9);
                map.put(ArmorItem.Type.BOOTS, 6);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.PHENON),
            List.of(new ArmorMaterial.Layer(Identifier.of(MoreGear.MOD_ID, "phenon"))), 3.25f, 0.165f));
    public static final RegistryEntry<ArmorMaterial> ENDIUM = registerArmorMaterial("endium",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 8);
                map.put(ArmorItem.Type.CHESTPLATE, 13);
                map.put(ArmorItem.Type.LEGGINGS, 11);
                map.put(ArmorItem.Type.BOOTS, 8);
            }), 27, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.ENDIUM),
            List.of(new ArmorMaterial.Layer(Identifier.of(MoreGear.MOD_ID, "endium"))), 3.5f, 0.18f));
    public static final RegistryEntry<ArmorMaterial> MYTHRIL = registerArmorMaterial("mythril",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 12);
                map.put(ArmorItem.Type.CHESTPLATE, 16);
                map.put(ArmorItem.Type.LEGGINGS, 15);
                map.put(ArmorItem.Type.BOOTS, 12);
            }), 31, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.MYTHRIL),
            List.of(new ArmorMaterial.Layer(Identifier.of(MoreGear.MOD_ID, "mythril"))), 3.75f, 0.195f));
    public static final RegistryEntry<ArmorMaterial> REINFORCED_TRIPHITE = registerArmorMaterial("reinforcedtriphite",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 16);
                map.put(ArmorItem.Type.CHESTPLATE, 20);
                map.put(ArmorItem.Type.LEGGINGS, 18);
                map.put(ArmorItem.Type.BOOTS, 16);
            }), 35, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.REINFORCED_TRIPHITE),
            List.of(new ArmorMaterial.Layer(Identifier.of(MoreGear.MOD_ID, "reinforcedtriphite"))), 4.15f, 0.21f));
    public static final RegistryEntry<ArmorMaterial> TITANIUM = registerArmorMaterial("titanium",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 20);
                map.put(ArmorItem.Type.CHESTPLATE, 26);
                map.put(ArmorItem.Type.LEGGINGS, 22);
                map.put(ArmorItem.Type.BOOTS, 20);
            }), 40, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.TITANIUM),
            List.of(new ArmorMaterial.Layer(Identifier.of(MoreGear.MOD_ID, "titanium"))), 5.0f, 0.23f));
    public static final RegistryEntry<ArmorMaterial> PHYSICSIUM = registerArmorMaterial("physicsium",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 100);
                map.put(ArmorItem.Type.CHESTPLATE, 100);
                map.put(ArmorItem.Type.LEGGINGS, 100);
                map.put(ArmorItem.Type.BOOTS, 100);
            }), 50, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.PHYSICSIUM),
            List.of(new ArmorMaterial.Layer(Identifier.of(MoreGear.MOD_ID, "physicsium"))), 10.0f, 0.25f));

    public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material) {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(MoreGear.MOD_ID, name), material.get());
    }
}