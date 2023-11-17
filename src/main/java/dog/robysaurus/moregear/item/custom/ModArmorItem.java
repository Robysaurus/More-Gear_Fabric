package dog.robysaurus.moregear.item.custom;

import com.google.common.collect.Iterables;
import dog.robysaurus.moregear.item.ModArmorMaterials;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
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
            if(entity instanceof LivingEntity lEntity) {
                if(hasFullSuitOfArmorOn(lEntity)) {
                    evaluateArmorEffects(lEntity);
                }else{
                    lEntity.removeStatusEffect(StatusEffects.HEALTH_BOOST);
                    lEntity.removeStatusEffect(StatusEffects.NIGHT_VISION);
                }
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }

    private void evaluateArmorEffects(LivingEntity entity) {
        if(hasCorrectArmorOn(ModArmorMaterials.TITANIUM, entity)){
            if(!entity.hasStatusEffect(StatusEffects.HEALTH_BOOST)){
                entity.addStatusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, -1, 4, true, false, true));
            }
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 100, 3, true, false, true));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 100, 0, true, false, true));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 100, 1, true, false, true));
        }else if(hasCorrectArmorOn(ModArmorMaterials.ENDIUM, entity)){
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 100, 1, true, false, true));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 100, 0, true, false, true));
        }else if(hasCorrectArmorOn(ModArmorMaterials.PHENON, entity)){
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 100, 0, true, false, true));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 100, 0, true, false, true));
        }else if(hasCorrectArmorOn(ModArmorMaterials.TOPAZ, entity)){
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 100, 2, true, false, true));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 100, 2, true, false, true));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 100, 0, true, false, true));
        }else if(hasCorrectArmorOn(ModArmorMaterials.SAPPHIRE, entity)){
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100, 2, true, false, true));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 100, 2, true, false, true));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 100, 0, true, false, true));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 100, 0, true, false, true));
        }else if(hasCorrectArmorOn(ModArmorMaterials.RUBY, entity)){
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 100, 0, true, false, true));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 100, 1, true, false, true));
        }else if(hasCorrectArmorOn(ModArmorMaterials.OPAL, entity)){
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 100, 0, true, false, true));
            if(!entity.hasStatusEffect(StatusEffects.NIGHT_VISION)){
                entity.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, -1, 0, true, false, true));
            }
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 100, 2, true, false, true));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 100, 2, true, false, true));
        }else if(hasCorrectArmorOn(ModArmorMaterials.ECHO, entity)){
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 100, 1, true, false, true));
            if(!entity.hasStatusEffect(StatusEffects.NIGHT_VISION)){
                entity.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, -1, 0, true, false, true));
            }
        }else if(hasCorrectArmorOn(ModArmorMaterials.EMERALD, entity)){
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, 100, 2, true, false, true));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 100, 1, true, false, true));
        }else if(hasCorrectArmorOn(ModArmorMaterials.AMETHYST, entity)){
            if(!entity.hasStatusEffect(StatusEffects.REGENERATION)){
                entity.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 0, true, false, true));
            }
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 100, 0, true, false, true));
        }else{
            entity.removeStatusEffect(StatusEffects.HEALTH_BOOST);
            entity.removeStatusEffect(StatusEffects.NIGHT_VISION);
        }
    }

    private boolean hasFullSuitOfArmorOn(LivingEntity entity) {
        ItemStack[] stacks = Iterables.toArray(entity.getArmorItems(), ItemStack.class);
        if(stacks.length!=4){
            return false;
        }
        ItemStack boots = stacks[3];
        ItemStack leggings = stacks[2];
        ItemStack breastplate = stacks[1];
        ItemStack helmet = stacks[0];
        boolean wearingElytra = breastplate.getItem()==Items.ELYTRA;
        return !helmet.isEmpty() && !breastplate.isEmpty() && !leggings.isEmpty() && !boots.isEmpty() && !wearingElytra;
    }

    private boolean hasCorrectArmorOn(ArmorMaterial material, LivingEntity entity) {
        ItemStack[] stacks = Iterables.toArray(entity.getArmorItems(), ItemStack.class);
        ArmorItem Boots = ((ArmorItem) stacks[3].getItem());
        ArmorItem Leggings = ((ArmorItem) stacks[2].getItem());
        ArmorItem Breastplate = ((ArmorItem) stacks[1].getItem());
        ArmorItem Helmet = ((ArmorItem) stacks[0].getItem());
        return Helmet.getMaterial() == material && Breastplate.getMaterial() == material &&
                Leggings.getMaterial() == material && Boots.getMaterial() == material;
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
        }else if(this.material==ModArmorMaterials.ENDIUM){
            MutableText tempTooltip = Text.literal("Grants ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("Resistance II and Slow Falling I").formatted(Formatting.GOLD, Formatting.BOLD));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("when full set of armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        }else if(this.material==ModArmorMaterials.PHENON){
            MutableText tempTooltip = Text.literal("Grants ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("Fire Resistance and Saturation I").formatted(Formatting.GOLD, Formatting.BOLD));
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