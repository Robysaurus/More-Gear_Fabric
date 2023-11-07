package dog.robysaurus.moregear.item.custom;

import dog.robysaurus.moregear.item.ModArmorMaterials;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModArmorItem extends ArmorItem{
    ArmorMaterial material;

    public ModArmorItem(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
        this.material=material;
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if(!world.isClient()) {
            if(entity instanceof PlayerEntity) {
                PlayerEntity player = (PlayerEntity)entity;

                if(hasFullSuitOfArmorOn(player)) {
                    evaluateArmorEffects(player);
                }else{
                    player.removeStatusEffect(StatusEffects.HEALTH_BOOST);
                    player.removeStatusEffect(StatusEffects.NIGHT_VISION);
                }
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }

    private void evaluateArmorEffects(PlayerEntity player) {
        if(hasCorrectArmorOn(ModArmorMaterials.TITANIUM, player)){
            if(!player.hasStatusEffect(StatusEffects.HEALTH_BOOST)){
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, -1, 4, true, false, true));
            }
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 100, 3, true, false, true));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 100, 0, true, false, true));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 100, 1, true, false, true));
        }else if(hasCorrectArmorOn(ModArmorMaterials.TOPAZ, player)){
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 100, 2, true, false, true));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 100, 2, true, false, true));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 200, 0, true, false, true));
        }else if(hasCorrectArmorOn(ModArmorMaterials.SAPPHIRE, player)){
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100, 2, true, false, true));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 100, 2, true, false, true));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 100, 0, true, false, true));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 100, 0, true, false, true));
        }else if(hasCorrectArmorOn(ModArmorMaterials.RUBY, player)){
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 100, 0, true, false, true));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 100, 1, true, false, true));
        }else if(hasCorrectArmorOn(ModArmorMaterials.OPAL, player)){
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 100, 0, true, false, true));
            if(!player.hasStatusEffect(StatusEffects.NIGHT_VISION)){
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, -1, 0, true, false, true));
            }
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 100, 2, true, false, true));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 100, 2, true, false, true));
        }else if(hasCorrectArmorOn(ModArmorMaterials.ECHO, player)){
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 100, 1, true, false, true));
            if(!player.hasStatusEffect(StatusEffects.NIGHT_VISION)){
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, -1, 0, true, false, true));
            }
        }else if(hasCorrectArmorOn(ModArmorMaterials.EMERALD, player)){
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, 100, 2, true, false, true));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 100, 1, true, false, true));
        }else if(hasCorrectArmorOn(ModArmorMaterials.AMETHYST, player)){
            if(!player.hasStatusEffect(StatusEffects.REGENERATION)){
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 0, true, false, true));
            }
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 100, 0, true, false, true));
        }else{
            player.removeStatusEffect(StatusEffects.HEALTH_BOOST);
            player.removeStatusEffect(StatusEffects.NIGHT_VISION);
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
        if(this.material== ModArmorMaterials.TITANIUM){
            MutableText tempTooltip = Text.literal("Grants ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("Resistance IV, Fire Resistance,").formatted(Formatting.GOLD, Formatting.BOLD));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("Strength II, and Health Boost V").formatted(Formatting.GOLD, Formatting.BOLD);
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("when full set of armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        }else if(this.material==ModArmorMaterials.TOPAZ){
            MutableText tempTooltip = Text.literal("Grants ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("Resistance III, Haste III, and Saturation I").formatted(Formatting.GOLD, Formatting.BOLD));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("when full set of armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        }else if(this.material==ModArmorMaterials.SAPPHIRE){
            MutableText tempTooltip = Text.literal("Grants ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("Resistance III, Fire Resistance,").formatted(Formatting.GOLD, Formatting.BOLD));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("Strength I, and Speed III").formatted(Formatting.GOLD, Formatting.BOLD);
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("when full set of armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        }else if(this.material==ModArmorMaterials.RUBY){
            MutableText tempTooltip = Text.literal("Grants ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("Fire Resistance and Strength II").formatted(Formatting.GOLD, Formatting.BOLD));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("when full set of armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        }else if(this.material==ModArmorMaterials.OPAL){
            MutableText tempTooltip = Text.literal("Grants: ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("Water Breathing, Night Vision,").formatted(Formatting.GOLD, Formatting.BOLD));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("Dolphin's Grace III, and Conduit Power III").formatted(Formatting.GOLD, Formatting.BOLD);
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("when full set of armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        }else if(this.material==ModArmorMaterials.ECHO){
            MutableText tempTooltip = Text.literal("Grants ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("Resistance II and Night Vision").formatted(Formatting.GOLD, Formatting.BOLD));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("when full set of armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        }else if(this.material==ModArmorMaterials.EMERALD){
            MutableText tempTooltip = Text.literal("Grants ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("Luck III and Hero of the Village II").formatted(Formatting.GOLD, Formatting.BOLD));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("when full set of armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        }else if(this.material==ModArmorMaterials.AMETHYST){
            MutableText tempTooltip = Text.literal("Grants ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("Regeneration I and Glowing").formatted(Formatting.GOLD, Formatting.BOLD));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("when full set of armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}
