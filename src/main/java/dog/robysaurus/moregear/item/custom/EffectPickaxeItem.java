package dog.robysaurus.moregear.item.custom;

import dog.robysaurus.moregear.item.ModArmorMaterials;
import dog.robysaurus.moregear.item.ModToolMaterials;
import dog.robysaurus.moregear.util.MiscModUtil;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class EffectPickaxeItem extends PickaxeItem {
    private final ToolMaterial toolMaterial;
    private final RegistryEntry<ArmorMaterial> armorMaterial;
    public EffectPickaxeItem(ToolMaterial toolMaterial, RegistryEntry<ArmorMaterial> armorMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, settings.attributeModifiers(AxeItem.createAttributeModifiers(toolMaterial, attackDamage, attackSpeed)));
        this.toolMaterial=toolMaterial;
        this.armorMaterial=armorMaterial;
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if(entity instanceof LivingEntity lEntity){
            if(MiscModUtil.hasCorrectArmorOn(armorMaterial, lEntity)) {
                evaluateEffectToGrant(lEntity, toolMaterial, armorMaterial);
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }

    private void evaluateEffectToGrant(LivingEntity entity, ToolMaterial toolMaterial, RegistryEntry<ArmorMaterial> armorMaterial) {
        if(armorMaterial==ModArmorMaterials.PHYSICSIUM && toolMaterial==ModToolMaterials.PHYSICSIUM){
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 100, 99, true, false, false));
        }else if(armorMaterial==ModArmorMaterials.TOPAZ && toolMaterial==ModToolMaterials.TOPAZ){
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 100, 3, true, false, false));
        }else if(armorMaterial==ModArmorMaterials.REINFORCED_TRIPHITE && toolMaterial==ModToolMaterials.REINFORCED_TRIPHITE){
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 100, 4, true, false, false));
        }
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        if(this.toolMaterial==ModToolMaterials.PHYSICSIUM){
            MutableText tempTooltip = Text.literal("Grants you ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("Haste C because funny").formatted(Formatting.GOLD, Formatting.BOLD, Formatting.OBFUSCATED));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("when full Physicsium armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        }else if(this.toolMaterial==ModToolMaterials.TOPAZ){
            MutableText tempTooltip = Text.literal("Grants you ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("Haste IV").formatted(Formatting.GOLD, Formatting.BOLD));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("when full Topaz armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        }else if(this.toolMaterial==ModToolMaterials.REINFORCED_TRIPHITE){
            MutableText tempTooltip = Text.literal("Grants you ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("Haste V").formatted(Formatting.GOLD, Formatting.BOLD));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("when full Reinforced Triphite armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        }
        super.appendTooltip(stack, context, tooltip, type);
    }
}
