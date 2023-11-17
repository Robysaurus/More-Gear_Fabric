package dog.robysaurus.moregear.item.custom;

import com.google.common.collect.Iterables;
import dog.robysaurus.moregear.item.ModArmorMaterials;
import dog.robysaurus.moregear.item.ModToolMaterials;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class EffectPickaxeItem extends PickaxeItem {
    private final ToolMaterial toolMaterial;
    private final ArmorMaterial armorMaterial;
    public EffectPickaxeItem(ToolMaterial toolMaterial, ArmorMaterial armorMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
        this.toolMaterial=toolMaterial;
        this.armorMaterial=armorMaterial;
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if(entity instanceof LivingEntity lEntity){
            if(hasCorrectArmorOn(armorMaterial, lEntity)) {
                evaluateEffectToGrant(lEntity, toolMaterial, armorMaterial);
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }

    private void evaluateEffectToGrant(LivingEntity entity, ToolMaterial toolMaterial, ArmorMaterial armorMaterial) {
        if(armorMaterial==ModArmorMaterials.TOPAZ && toolMaterial==ModToolMaterials.TOPAZ){
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 100, 4));
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
        if(this.toolMaterial==ModToolMaterials.TOPAZ){
            MutableText tempTooltip = Text.literal("Grants you ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("Haste V").formatted(Formatting.GOLD, Formatting.BOLD));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("when full topaz armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}
