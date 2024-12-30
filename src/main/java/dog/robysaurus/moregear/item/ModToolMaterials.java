package dog.robysaurus.moregear.item;

import dog.robysaurus.moregear.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    COPPER(ModTags.Blocks.INCORRECT_FOR_COPPER_TOOL, 200, 5.5f, 1.5f, 7, () -> Ingredient.ofItems(Items.COPPER_INGOT)),/*MiningLevels.STONE*/
    AMETHYST(ModTags.Blocks.INCORRECT_FOR_AMETHYST_TOOL, 350, 6.5f, 2.0f, 12, () -> Ingredient.ofItems(Items.AMETHYST_SHARD)),/*MiningLevels.IRON*/
    EMERALD(ModTags.Blocks.INCORRECT_FOR_EMERALD_TOOL, 1400, 7.5f, 2.5f, 17, () -> Ingredient.ofItems(Items.EMERALD)),/*MiningLevels.DIAMOND*/
    ECHO(ModTags.Blocks.INCORRECT_FOR_ECHO_TOOL, 2000, 8.5f, 3.5f, 20, () -> Ingredient.ofItems(Items.ECHO_SHARD)),/*MiningLevels.DIAMOND*/
    OPAL(ModTags.Blocks.INCORRECT_FOR_OPAL_TOOL, 2031, 9.0f, 4.0f, 15, () -> Ingredient.ofItems(ModItems.OPAL)),/*MiningLevels.NETHERITE*/
    RUBY(ModTags.Blocks.INCORRECT_FOR_RUBY_TOOL, 2031, 9.0f, 4.0f, 15, () -> Ingredient.ofItems(ModItems.RUBY)),/*MiningLevels.NETHERITE*/
    SAPPHIRE(ModTags.Blocks.INCORRECT_FOR_SAPPHIRE_TOOL, 2031, 9.0f, 4.0f, 15, () -> Ingredient.ofItems(ModItems.SAPPHIRE)),/*MiningLevels.NETHERITE*/
    TOPAZ(ModTags.Blocks.INCORRECT_FOR_TOPAZ_TOOL, 2031, 20.0f, 4.0f, 20, () -> Ingredient.ofItems(ModItems.TOPAZ)),/*MiningLevels.NETHERITE*/
    HYPHITE(ModTags.Blocks.INCORRECT_FOR_HYPHITE_TOOL, 3000, 20.0f, 6.0f, 18, () -> Ingredient.ofItems(ModItems.HYPHITE)), /*5*/
    PHENON(ModTags.Blocks.INCORRECT_FOR_PHENON_TOOL, 3500, 30.0f, 15.0f, 20, () -> Ingredient.ofItems(ModItems.PHENON)),/*5*/
    ENDIUM(ModTags.Blocks.INCORRECT_FOR_ENDIUM_TOOL, 4000, 40.0f, 20.0f, 27, () -> Ingredient.ofItems(ModItems.ENDIUM)),/*6*/
    MYTHRIL(ModTags.Blocks.INCORRECT_FOR_MYTHRIL_TOOL, 6000, 55.0f, 35.0f, 31, () -> Ingredient.ofItems(ModItems.MYTHRIL)),/*7*/
    REINFORCED_TRIPHITE(ModTags.Blocks.INCORRECT_FOR_REINFORCED_TRIPHITE_TOOL, 8000, 65.0f, 43f, 35, () -> Ingredient.ofItems(ModItems.REINFORCED_TRIPHITE)),/*8*/
    TITANIUM(ModTags.Blocks.INCORRECT_FOR_TITANIUM_TOOL, 10000, 80.0f, 55.0f, 40, () -> Ingredient.ofItems(ModItems.TITANIUM)),/*9*/
    PHYSICSIUM(ModTags.Blocks.INCORRECT_FOR_PHYSICSIUM_TOOL, 100000, 500.0f, 100.0f, 50, () -> Ingredient.ofItems(ModItems.PHYSICSIUM));/*10*/

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(TagKey<Block> inverseTag, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.inverseTag = inverseTag;
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
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
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