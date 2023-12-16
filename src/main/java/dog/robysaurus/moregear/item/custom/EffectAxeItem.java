package dog.robysaurus.moregear.item.custom;

import com.google.common.collect.Iterables;
import dog.robysaurus.moregear.item.ModArmorMaterials;
import dog.robysaurus.moregear.item.ModToolMaterials;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.BlazeEntity;
import net.minecraft.entity.mob.DrownedEntity;
import net.minecraft.entity.mob.GuardianEntity;
import net.minecraft.entity.mob.ShulkerEntity;
import net.minecraft.entity.passive.*;
import net.minecraft.item.*;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class EffectAxeItem extends AxeItem {
    private final ToolMaterial toolMaterial;
    private final ArmorMaterial armorMaterial;
    public EffectAxeItem(ToolMaterial toolMaterial, ArmorMaterial armorMaterial, float attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
        this.toolMaterial=toolMaterial;
        this.armorMaterial=armorMaterial;
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if(hasCorrectArmorOn(armorMaterial, attacker)) {
            evaluateEffectToDeal(target, toolMaterial, armorMaterial);
        }
        return super.postHit(stack, target, attacker);
    }



    private void evaluateEffectToDeal(LivingEntity target, ToolMaterial toolMaterial, ArmorMaterial armorMaterial) {
        if(armorMaterial==ModArmorMaterials.RUBY && toolMaterial==ModToolMaterials.RUBY){
            target.setOnFireFor(7);
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

    private boolean hasCorrectArmorOn(ArmorMaterial material, LivingEntity entity) {
        ItemStack[] stacks = Iterables.toArray(entity.getArmorItems(), ItemStack.class);
        if(stacks.length!=4) {
            return false;
        }
        ItemStack boots = stacks[3];
        ItemStack leggings = stacks[2];
        ItemStack breastplate = stacks[1];
        ItemStack helmet = stacks[0];
        boolean wearingElytra = breastplate.getItem()==Items.ELYTRA;
        if (!helmet.isEmpty() && !breastplate.isEmpty() && !leggings.isEmpty() && !boots.isEmpty() && !wearingElytra) {
            ArmorItem Boots = ((ArmorItem) boots.getItem());
            ArmorItem Leggings = ((ArmorItem) leggings.getItem());
            ArmorItem Breastplate = ((ArmorItem) breastplate.getItem());
            ArmorItem Helmet = ((ArmorItem) helmet.getItem());
            return Helmet.getMaterial() == material && Breastplate.getMaterial() == material &&
                    Leggings.getMaterial() == material && Boots.getMaterial() == material;
        }
        return false;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(this.toolMaterial==ModToolMaterials.RUBY){
            MutableText tempTooltip = Text.literal("Sets enemies on ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("fire").formatted(Formatting.GOLD, Formatting.BOLD));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("on hits when full Ruby armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        }else if (this.toolMaterial == ModToolMaterials.REINFORCED_TRIPHITE) {
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
        super.appendTooltip(stack, world, tooltip, context);
    }
}
