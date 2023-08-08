package dog.robysaurus.moregear.item;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    COPPER("copper", 12, Util.make(new EnumMap<ArmorItem.Type, Integer>(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 2);
        map.put(ArmorItem.Type.LEGGINGS, 4);
        map.put(ArmorItem.Type.CHESTPLATE, 5);
        map.put(ArmorItem.Type.HELMET, 2);
    }), 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f, 0.0f, () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    AMETHYST("amethyst", 17, Util.make(new EnumMap<ArmorItem.Type, Integer>(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 2);
        map.put(ArmorItem.Type.LEGGINGS, 6);
        map.put(ArmorItem.Type.CHESTPLATE, 6);
        map.put(ArmorItem.Type.HELMET, 2);
    }), 12, SoundEvents.ITEM_ARMOR_EQUIP_GOLD   , 0.0f, 0.0f, () -> Ingredient.ofItems(Items.AMETHYST_SHARD)),
    EMERALD("emerald", 28, Util.make(new EnumMap<ArmorItem.Type, Integer>(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 3);
        map.put(ArmorItem.Type.LEGGINGS, 6);
        map.put(ArmorItem.Type.CHESTPLATE, 7);
        map.put(ArmorItem.Type.HELMET, 3);
    }), 17, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.7f, 0.0f, () -> Ingredient.ofItems(Items.EMERALD)),
    ECHO("echo", 36, Util.make(new EnumMap<ArmorItem.Type, Integer>(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 3);
        map.put(ArmorItem.Type.LEGGINGS, 7);
        map.put(ArmorItem.Type.CHESTPLATE, 8);
        map.put(ArmorItem.Type.HELMET, 4);
    }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5f, 0.05f, () -> Ingredient.ofItems(Items.ECHO_SHARD)),
    TITANIUM("titanium", 200, Util.make(new EnumMap<ArmorItem.Type, Integer>(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 5);
        map.put(ArmorItem.Type.LEGGINGS, 9);
        map.put(ArmorItem.Type.CHESTPLATE, 11);
        map.put(ArmorItem.Type.HELMET, 5);
    }), 30, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 4.0f, 0.25f, () -> Ingredient.ofItems(ModItems.TITANIUM));
    @SuppressWarnings("deprecation")
    public static final StringIdentifiable.Codec<ArmorMaterials> CODEC;
    private static final EnumMap<ArmorItem.Type, Integer> BASE_DURABILITY;
    private final String name;
    private final int durabilityMultiplier;
    private final EnumMap<ArmorItem.Type, Integer> protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    @SuppressWarnings("deprecation")
    private final Lazy<Ingredient> repairIngredientSupplier;

    ModArmorMaterials(String name, int durabilityMultiplier, EnumMap<ArmorItem.Type, Integer> protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        //noinspection deprecation
        this.repairIngredientSupplier = new Lazy<Ingredient>(repairIngredientSupplier);
    }

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY.get(type) * this.durabilityMultiplier;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return this.protectionAmounts.get(type);
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredientSupplier.get();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }


    static {
        CODEC = StringIdentifiable.createCodec(ArmorMaterials::values);
        //noinspection rawtypes,unchecked
        BASE_DURABILITY = Util.make(new EnumMap(ArmorItem.Type.class), map -> {
            //noinspection unchecked
            map.put(ArmorItem.Type.BOOTS, 15);
            //noinspection unchecked
            map.put(ArmorItem.Type.LEGGINGS, 15);
            //noinspection unchecked
            map.put(ArmorItem.Type.CHESTPLATE, 15);
            //noinspection unchecked
            map.put(ArmorItem.Type.HELMET, 15);
        });
    }
}
