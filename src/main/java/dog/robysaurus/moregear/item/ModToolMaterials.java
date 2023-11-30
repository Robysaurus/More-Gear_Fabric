package dog.robysaurus.moregear.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    COPPER(MiningLevels.STONE, 200, 5.5f, 1.5f, 7, () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    AMETHYST(MiningLevels.IRON, 350, 6.5f, 2.0f, 12, () -> Ingredient.ofItems(Items.AMETHYST_SHARD)),
    EMERALD(MiningLevels.DIAMOND, 1400, 7.5f, 2.5f, 17, () -> Ingredient.ofItems(Items.EMERALD)),
    ECHO(MiningLevels.DIAMOND, 2000, 8.5f, 3.5f, 20, () -> Ingredient.ofItems(Items.ECHO_SHARD)),
    OPAL(MiningLevels.NETHERITE, 2031, 9.0f, 4.0f, 15, () -> Ingredient.ofItems(ModItems.OPAL)),
    RUBY(MiningLevels.NETHERITE, 2031, 9.0f, 4.0f, 15, () -> Ingredient.ofItems(ModItems.RUBY)),
    SAPPHIRE(MiningLevels.NETHERITE, 2031, 9.0f, 4.0f, 15, () -> Ingredient.ofItems(ModItems.SAPPHIRE)),
    TOPAZ(MiningLevels.NETHERITE, 2031, 20.0f, 4.0f, 20, () -> Ingredient.ofItems(ModItems.TOPAZ)),
    HYPHITE(5, 3000, 20.0f, 6.0f, 18, () -> Ingredient.ofItems(ModItems.HYPHITE)),
    PHENON(5, 3500, 30.0f, 15.0f, 20, () -> Ingredient.ofItems(ModItems.PHENON)),
    ENDIUM(6, 4000, 40.0f, 20.0f, 27, () -> Ingredient.ofItems(ModItems.ENDIUM)),
    MYTHRIL(7, 6000, 55.0f, 35.0f, 31, () -> Ingredient.ofItems(ModItems.MYTHRIL)),
    REINFORCED_TRIPHITE(8, 8000, 65.0f, 43f, 35, () -> Ingredient.ofItems(ModItems.REINFORCED_TRIPHITE)),
    TITANIUM(9, 10000, 80.0f, 55.0f, 40, () -> Ingredient.ofItems(ModItems.TITANIUM));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}