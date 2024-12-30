package dog.robysaurus.moregear.item.custom;

import dog.robysaurus.moregear.item.ModArmorMaterials;
import dog.robysaurus.moregear.item.ModToolMaterials;
import dog.robysaurus.moregear.util.MiscModUtil;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.BlazeEntity;
import net.minecraft.entity.mob.DrownedEntity;
import net.minecraft.entity.mob.GuardianEntity;
import net.minecraft.entity.mob.ShulkerEntity;
import net.minecraft.entity.passive.*;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

public class EffectAxeItem extends AxeItem {
    private final ToolMaterial toolMaterial;
    private final RegistryEntry<ArmorMaterial> armorMaterial;
    public EffectAxeItem(ToolMaterial toolMaterial, RegistryEntry<ArmorMaterial> armorMaterial, float attackDamage, float attackSpeed, Item.Settings settings) {
        super(toolMaterial, settings.attributeModifiers(AxeItem.createAttributeModifiers(toolMaterial, attackDamage, attackSpeed)));
        this.toolMaterial=toolMaterial;
        this.armorMaterial=armorMaterial;
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if(MiscModUtil.hasCorrectArmorOn(armorMaterial, attacker)) {
            evaluateEffectToDeal(target, toolMaterial, armorMaterial);
        }
        return super.postHit(stack, target, attacker);
    }



    private void evaluateEffectToDeal(LivingEntity target, ToolMaterial toolMaterial, RegistryEntry<ArmorMaterial> armorMaterial) {
        if(armorMaterial==ModArmorMaterials.PHYSICSIUM && toolMaterial==ModToolMaterials.PHYSICSIUM){
            target.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 200, 4, true, false, true));
            target.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 200, 2, true, false, true));
        }else if(armorMaterial==ModArmorMaterials.RUBY && toolMaterial==ModToolMaterials.RUBY){
            LightningEntity l = new LightningEntity(EntityType.LIGHTNING_BOLT, target.getWorld());
            l.setChanneler((ServerPlayerEntity)target.getAttacker());
            l.setCosmetic(false);
            l.setPosition(target.getX(), target.getY(), target.getZ());
            target.getWorld().spawnEntity(l);
        }else if(armorMaterial==ModArmorMaterials.REINFORCED_TRIPHITE && toolMaterial==ModToolMaterials.REINFORCED_TRIPHITE){
            target.removeStatusEffect(StatusEffects.INVISIBILITY);
            target.removeStatusEffect(StatusEffects.RESISTANCE);
            target.addStatusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 200, 0, true, false, true));
        }else if(armorMaterial==ModArmorMaterials.MYTHRIL && toolMaterial==ModToolMaterials.MYTHRIL){
            if(target instanceof ShulkerEntity){
                target.onDeath(target.getRecentDamageSource());
                target.kill();
            }
        }else if(armorMaterial==ModArmorMaterials.OPAL && toolMaterial==ModToolMaterials.OPAL){
            if(target instanceof BlazeEntity){
                target.onDeath(target.getRecentDamageSource());
                target.kill();
            }
        }else if(armorMaterial==ModArmorMaterials.PHENON && toolMaterial==ModToolMaterials.PHENON){
            if(target instanceof DrownedEntity || target instanceof GuardianEntity || target instanceof FishEntity || target instanceof DolphinEntity || target instanceof SquidEntity || target instanceof TurtleEntity || target instanceof AxolotlEntity){
                target.onDeath(target.getRecentDamageSource());
                target.kill();
            }
        }
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        if(this.toolMaterial == ModToolMaterials.PHYSICSIUM){
            MutableText tempTooltip = Text.literal("Deals ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("big skull emoji lol").formatted(Formatting.GOLD, Formatting.BOLD, Formatting.OBFUSCATED));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("to your enemies when full Physicsium armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        }else if(this.toolMaterial==ModToolMaterials.RUBY){
            MutableText tempTooltip = Text.literal("When you attack, summons ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("lightning").formatted(Formatting.GOLD, Formatting.BOLD));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("when full Ruby armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        }else if(this.toolMaterial == ModToolMaterials.REINFORCED_TRIPHITE){
            MutableText tempTooltip = Text.literal("Gives ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("Glowing").formatted(Formatting.GOLD, Formatting.BOLD));
            tempTooltip.append(Text.literal(" to and removes ").formatted(Formatting.AQUA));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("Invisibility and Resistance ").formatted(Formatting.GOLD, Formatting.BOLD);
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("from your enemies when full Reinforced Triphite armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        }else if(this.toolMaterial==ModToolMaterials.MYTHRIL){
            MutableText tempTooltip = Text.literal("Instantly ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("kills Shulkers").formatted(Formatting.GOLD, Formatting.BOLD));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("when full Mythril armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        }else if(this.toolMaterial==ModToolMaterials.OPAL){
            MutableText tempTooltip = Text.literal("Instantly ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("kills Blazes").formatted(Formatting.GOLD, Formatting.BOLD));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("when full Opal armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        }else if(this.toolMaterial==ModToolMaterials.PHENON){
            MutableText tempTooltip = Text.literal("Instantly ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("kills all water mobs").formatted(Formatting.GOLD, Formatting.BOLD));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("when full Phenon armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        }
        super.appendTooltip(stack, context, tooltip, type);
    }
}
