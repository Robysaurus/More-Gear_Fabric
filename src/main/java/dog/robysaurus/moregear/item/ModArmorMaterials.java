package dog.robysaurus.moregear.item;

import dog.robysaurus.moregear.MoreGear;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    COPPER("copper", 12, new int[] {2,5,4,2}, 7, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f, 0.0f, () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    AMETHYST("amethyst", 17, new int[] {2,6,5,2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_GOLD   , 0.0f, 0.0f, () -> Ingredient.ofItems(Items.AMETHYST_SHARD)),
    EMERALD("emerald", 28, new int[] {2,7,6,2}, 17, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.7f, 0.0f, () -> Ingredient.ofItems(Items.EMERALD)),
    ECHO("echo", 36, new int[] {3,7,6,3}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5f, 0.05f, () -> Ingredient.ofItems(Items.ECHO_SHARD)),
    OPAL("opal", 37, new int[] {3,8,6,3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0f, 0.1f, () -> Ingredient.ofItems(ModItems.OPAL)),
    RUBY("ruby", 37, new int[] {3,8,6,3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0f, 0.1f, () -> Ingredient.ofItems(ModItems.RUBY)),
    SAPPHIRE("sapphire", 37, new int[] {3,8,6,3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0f, 0.1f, () -> Ingredient.ofItems(ModItems.SAPPHIRE)),
    TOPAZ("topaz", 37, new int[] {3,8,6,3}, 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0f, 0.1f, () -> Ingredient.ofItems(ModItems.TOPAZ)),
    HYPHITE("hyphite", 1000, new int[] {4,9,8,4}, 18, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.5f, 0.15f, () -> Ingredient.ofItems(ModItems.HYPHITE)),
    PHENON("phenon", 2500, new int[] {6,11,9,6}, 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.75f, 0.165f, () -> Ingredient.ofItems(ModItems.PHENON)),
    ENDIUM("endium", 4000, new int[] {9,14,12,6}, 27, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 4.0f, 0.18f, () -> Ingredient.ofItems(ModItems.ENDIUM)),
    MYTHRIL("mythril", 6000, new int[] {14, 19, 17, 14}, 31, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 4.25f, 0.195f, () -> Ingredient.ofItems(ModItems.MYTHRIL)),
    REINFORCED_TRIPHITE("reinforcedtriphite", 8000, new int[] {18, 24, 21, 18}, 35, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 4.6f, 0.21f, () -> Ingredient.ofItems(ModItems.REINFORCED_TRIPHITE)),
    TITANIUM("titanium", 10000, new int[] {22,30,26,22}, 40, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 5.0f, 0.23f, () -> Ingredient.ofItems(ModItems.TITANIUM));
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = { 11, 16, 15, 13 };
    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound,
                      float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability(ArmorItem.Type type) {
        if(this==TITANIUM || this==REINFORCED_TRIPHITE || this==MYTHRIL || this==ENDIUM || this==PHENON || this==HYPHITE){
            return this.durabilityMultiplier;
        }
        return BASE_DURABILITY[type.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return protectionAmounts[type.ordinal()];
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
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return MoreGear.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}