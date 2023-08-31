package dog.robysaurus.moregear.item.custom;

import dog.robysaurus.moregear.item.ModArmorMaterials;
import dog.robysaurus.moregear.item.ModToolMaterials;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
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
        if(entity instanceof PlayerEntity){
            PlayerEntity player = ((PlayerEntity) entity);
            if(hasFullSuitOfArmorOn(player)){
                if(hasCorrectArmorOn(armorMaterial, player)) {
                    evaluateEffectToGrant(player, toolMaterial, armorMaterial);
                }
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }

    private void evaluateEffectToGrant(PlayerEntity player, ToolMaterial toolMaterial, ArmorMaterial armorMaterial) {
        if(armorMaterial==ModArmorMaterials.TOPAZ && toolMaterial==ModToolMaterials.TOPAZ){
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 100, 4));
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
