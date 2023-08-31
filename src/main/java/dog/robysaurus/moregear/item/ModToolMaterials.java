package dog.robysaurus.moregear.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    COPPER(MiningLevels.IRON, 200, 5.5f, 1.5f, 12, () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    AMETHYST(MiningLevels.IRON, 350, 6.5f, 2.0f, 20, () -> Ingredient.ofItems(Items.AMETHYST_SHARD)),
    EMERALD(MiningLevels.DIAMOND, 1400, 7.5f, 2.5f, 10, () -> Ingredient.ofItems(Items.EMERALD)),
    ECHO(MiningLevels.DIAMOND, 2000, 8.5f, 3.5f, 15, () -> Ingredient.ofItems(Items.ECHO_SHARD)),
    OPAL(MiningLevels.NETHERITE, 2031, 9.0f, 4.0f, 15, () -> Ingredient.ofItems(ModItems.OPAL)),
    RUBY(MiningLevels.NETHERITE, 2031, 9.0f, 4.0f, 15, () -> Ingredient.ofItems(ModItems.RUBY)),
    SAPPHIRE(MiningLevels.NETHERITE, 2031, 9.0f, 4.0f, 15, () -> Ingredient.ofItems(ModItems.SAPPHIRE)),
    TOPAZ(MiningLevels.NETHERITE, 2031, 9.0f, 4.0f, 15, () -> Ingredient.ofItems(ModItems.TOPAZ)),
    TITANIUM(5, 5000, 70.0f, 5.0f, 50, () -> Ingredient.ofItems(ModItems.TITANIUM));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy<Ingredient>(repairIngredient);
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
