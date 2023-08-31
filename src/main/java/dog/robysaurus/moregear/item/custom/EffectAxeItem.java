package dog.robysaurus.moregear.item.custom;

import dog.robysaurus.moregear.item.ModArmorMaterials;
import dog.robysaurus.moregear.item.ModToolMaterials;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.BlazeEntity;
import net.minecraft.entity.player.PlayerEntity;
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
        if(attacker instanceof PlayerEntity){
            PlayerEntity player = ((PlayerEntity) attacker);
            if(hasFullSuitOfArmorOn(player)){
                if(hasCorrectArmorOn(armorMaterial, player)) {
                    evaluateEffectToDeal(target, toolMaterial, armorMaterial);
                }
            }
        }
        return super.postHit(stack, target, attacker);
    }



    private void evaluateEffectToDeal(LivingEntity target, ToolMaterial toolMaterial, ArmorMaterial armorMaterial) {
        if(armorMaterial== ModArmorMaterials.RUBY && toolMaterial== ModToolMaterials.RUBY){
            target.setOnFireFor(5);
        }else if(armorMaterial== ModArmorMaterials.OPAL && toolMaterial== ModToolMaterials.OPAL){
            if(target instanceof BlazeEntity){
                target.kill();
            }
        }
    }

    private boolean hasFullSuitOfArmorOn(PlayerEntity player) {
        ItemStack boots = player.getInventory().getArmorStack(0);
        ItemStack leggings = player.getInventory().getArmorStack(1);
        ItemStack breastplate = player.getInventory().getArmorStack(2);
        ItemStack helmet = player.getInventory().getArmorStack(3);
        boolean wearingElytra = breastplate.getItem()==Items.ELYTRA;

        return !helmet.isEmpty() && !breastplate.isEmpty() && !leggings.isEmpty() && !boots.isEmpty() && !wearingElytra;
    }

    private boolean hasCorrectArmorOn(ArmorMaterial material, PlayerEntity player) {
        ArmorItem boots = ((ArmorItem)player.getInventory().getArmorStack(0).getItem());
        ArmorItem leggings = ((ArmorItem)player.getInventory().getArmorStack(1).getItem());
        ArmorItem breastplate = ((ArmorItem)player.getInventory().getArmorStack(2).getItem());
        ArmorItem helmet = ((ArmorItem)player.getInventory().getArmorStack(3).getItem());

        return helmet.getMaterial() == material && breastplate.getMaterial() == material &&
                leggings.getMaterial() == material && boots.getMaterial() == material;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(this.toolMaterial==ModToolMaterials.RUBY){
            MutableText tempTooltip = Text.literal("Sets enemies on ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("fire").formatted(Formatting.GOLD, Formatting.BOLD));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("on hits when full ruby armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        }else if(this.toolMaterial==ModToolMaterials.OPAL){
            MutableText tempTooltip = Text.literal("Instantly ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("kills blazes").formatted(Formatting.GOLD, Formatting.BOLD));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("when full opal armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}
