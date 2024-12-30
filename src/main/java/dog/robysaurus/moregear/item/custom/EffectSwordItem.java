package dog.robysaurus.moregear.item.custom;

import dog.robysaurus.moregear.item.ModArmorMaterials;
import dog.robysaurus.moregear.item.ModToolMaterials;
import dog.robysaurus.moregear.util.MiscModUtil;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.BlazeEntity;
import net.minecraft.entity.mob.EndermanEntity;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

public class EffectSwordItem extends SwordItem {
    private final ToolMaterial toolMaterial;
    private final RegistryEntry<ArmorMaterial> armorMaterial;

    public EffectSwordItem(ToolMaterial toolMaterial, RegistryEntry<ArmorMaterial> armorMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, settings.attributeModifiers(AxeItem.createAttributeModifiers(toolMaterial, attackDamage, attackSpeed)));
        this.toolMaterial = toolMaterial;
        this.armorMaterial = armorMaterial;
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (MiscModUtil.hasCorrectArmorOn(armorMaterial, attacker)) {
            evaluateEffect(target, toolMaterial, armorMaterial, attacker);
        }
        return super.postHit(stack, target, attacker);
    }

    private void evaluateEffect(LivingEntity target, ToolMaterial toolMaterial, RegistryEntry<ArmorMaterial> armorMaterial, LivingEntity entity) {
        if (armorMaterial == ModArmorMaterials.PHYSICSIUM && toolMaterial == ModToolMaterials.PHYSICSIUM) {
            target.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 200, 2));
            target.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 200, 2));
            target.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 200, 4));
        } else if (armorMaterial == ModArmorMaterials.TITANIUM && toolMaterial == ModToolMaterials.TITANIUM) {
            target.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 200, 2));
        } else if (armorMaterial == ModArmorMaterials.REINFORCED_TRIPHITE && toolMaterial == ModToolMaterials.REINFORCED_TRIPHITE) {
            target.addStatusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 200, 0, true, false, true));
            target.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100, 0, true, false, true));
            target.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 100, 1, true, false, true));
        } else if (armorMaterial == ModArmorMaterials.MYTHRIL && toolMaterial == ModToolMaterials.MYTHRIL) {
            if (target instanceof EndermanEntity) {
                target.onDeath(target.getRecentDamageSource());
                target.kill();
            }
        } else if (armorMaterial == ModArmorMaterials.ENDIUM && toolMaterial == ModToolMaterials.ENDIUM) {
            if (target.hasStatusEffect(StatusEffects.REGENERATION)) {
                entity.addStatusEffect(target.getStatusEffect(StatusEffects.REGENERATION));
                target.removeStatusEffect(StatusEffects.REGENERATION);
            }
            if (target.hasStatusEffect(StatusEffects.RESISTANCE)) {
                entity.addStatusEffect(target.getStatusEffect(StatusEffects.RESISTANCE));
                target.removeStatusEffect(StatusEffects.RESISTANCE);
            }
        } else if (armorMaterial == ModArmorMaterials.SAPPHIRE && toolMaterial == ModToolMaterials.SAPPHIRE) {
            target.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 100, 4));
        } else if (armorMaterial == ModArmorMaterials.OPAL && toolMaterial == ModToolMaterials.OPAL) {
            if (target instanceof BlazeEntity) {
                target.onDeath(target.getRecentDamageSource());
                target.kill();
            }
        } else if (armorMaterial == ModArmorMaterials.ECHO && toolMaterial == ModToolMaterials.ECHO) {
            target.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 100, 0));
        }
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        if (this.toolMaterial == ModToolMaterials.PHYSICSIUM) {
            MutableText tempTooltip = Text.literal("Deals ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("big skull emoji lol").formatted(Formatting.GOLD, Formatting.BOLD, Formatting.OBFUSCATED));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("to your enemies when full Physicsium armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        } else if (this.toolMaterial == ModToolMaterials.TITANIUM) {
            MutableText tempTooltip = Text.literal("Deals ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("Wither III").formatted(Formatting.GOLD, Formatting.BOLD));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("damage to your enemies when full Titanium armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        } else if (this.toolMaterial == ModToolMaterials.REINFORCED_TRIPHITE) {
            MutableText tempTooltip = Text.literal("Gives ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("Glowing, Nausea, and Weakness II").formatted(Formatting.GOLD, Formatting.BOLD));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("to your enemies when full Reinforced Triphite armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        } else if (this.toolMaterial == ModToolMaterials.MYTHRIL) {
            MutableText tempTooltip = Text.literal("Instantly ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("kills Endermen").formatted(Formatting.GOLD, Formatting.BOLD));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("when full Mythril armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        } else if (this.toolMaterial == ModToolMaterials.ENDIUM) {
            MutableText tempTooltip = Text.literal("Steals ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("Regeneration and Resistance").formatted(Formatting.GOLD, Formatting.BOLD));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("from your enemies when full Endium armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        } else if (this.toolMaterial == ModToolMaterials.SAPPHIRE) {
            MutableText tempTooltip = Text.literal("Gives ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("Slowness V").formatted(Formatting.GOLD, Formatting.BOLD));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("to your enemies when full Sapphire armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        } else if (this.toolMaterial == ModToolMaterials.OPAL) {
            MutableText tempTooltip = Text.literal("Instantly ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("kills blazes").formatted(Formatting.GOLD, Formatting.BOLD));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("when full Opal armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        } else if (this.toolMaterial == ModToolMaterials.ECHO) {
            MutableText tempTooltip = Text.literal("Gives ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("Blindness").formatted(Formatting.GOLD, Formatting.BOLD));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("to your enemies when full Echo armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        }
        super.appendTooltip(stack, context, tooltip, type);
    }
}