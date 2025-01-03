package dog.robysaurus.moregear.item.custom;

import com.google.common.collect.Iterables;
import dog.robysaurus.moregear.item.ModArmorMaterials;
import dog.robysaurus.moregear.util.MiscModUtil;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class ModArmorItem extends ArmorItem{
    private final RegistryEntry<ArmorMaterial> material;

    public ModArmorItem(RegistryEntry<ArmorMaterial> material, Type type, Settings settings) {
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
        if(MiscModUtil.hasCorrectArmorOn(ModArmorMaterials.PHYSICSIUM, entity)){
            if(!entity.hasStatusEffect(StatusEffects.HEALTH_BOOST)){
                entity.addStatusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, -1, 14, true, false, false));
            }
            if(!entity.hasStatusEffect(StatusEffects.REGENERATION)){
                entity.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 2, true, false, false));
            }
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 100, 3, true, false, false));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 100, 0, true, false, false));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 100, 4, true, false, false));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, 100, 9, true, false, false));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 100, 4, true, false, false));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100, 4, true, false, false));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 100, 4, true, false, false));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 100, 1, true, false, false));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 100, 4, true, false, false));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 100, 4, true, false, false));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 100, 4, true, false, false));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 100, 4, true, false, false));
        }else if(MiscModUtil.hasCorrectArmorOn(ModArmorMaterials.TITANIUM, entity)){
            if(!entity.hasStatusEffect(StatusEffects.HEALTH_BOOST)){
                entity.addStatusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, -1, 4, true, false, false));
            }
            if(!entity.hasStatusEffect(StatusEffects.REGENERATION)){
                entity.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 1, true, false, false));
            }
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 100, 2, true, false, false));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 100, 0, true, false, false));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 100, 1, true, false, false));
        }else if(MiscModUtil.hasCorrectArmorOn(ModArmorMaterials.REINFORCED_TRIPHITE, entity)){
            if(!entity.hasStatusEffect(StatusEffects.REGENERATION)){
                entity.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 0, true, false, false));
            }
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 100, 1, true, false, false));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 100, 1, true, false, false));
        }else if(MiscModUtil.hasCorrectArmorOn(ModArmorMaterials.MYTHRIL, entity)){
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100, 1, true, false, false));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 100, 0, true, false, false));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 100, 2, true, false, false));
        }else if(MiscModUtil.hasCorrectArmorOn(ModArmorMaterials.ENDIUM, entity)){
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 100, 0, true, false, false));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 100, 0, true, false, false));
        }else if(MiscModUtil.hasCorrectArmorOn(ModArmorMaterials.PHENON, entity)){
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 100, 0, true, false, false));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 100, 0, true, false, false));
        }else if(MiscModUtil.hasCorrectArmorOn(ModArmorMaterials.TOPAZ, entity)){
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 100, 2, true, false, false));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 100, 0, true, false, false));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 100, 0, true, false, false));
        }else if(MiscModUtil.hasCorrectArmorOn(ModArmorMaterials.SAPPHIRE, entity)){
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100, 2, true, false, false));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 100, 0, true, false, false));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 100, 0, true, false, false));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 100, 0, true, false, false));
        }else if(MiscModUtil.hasCorrectArmorOn(ModArmorMaterials.RUBY, entity)){
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 100, 0, true, false, false));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 100, 1, true, false, false));
        }else if(MiscModUtil.hasCorrectArmorOn(ModArmorMaterials.OPAL, entity)){
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 100, 0, true, false, false));
            if(!entity.hasStatusEffect(StatusEffects.NIGHT_VISION)){
                entity.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, -1, 0, true, false, false));
            }
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 100, 2, true, false, false));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 100, 2, true, false, false));
        }else if(MiscModUtil.hasCorrectArmorOn(ModArmorMaterials.ECHO, entity)){
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 100, 0, true, false, false));
            if(!entity.hasStatusEffect(StatusEffects.NIGHT_VISION)){
                entity.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, -1, 0, true, false, false));
            }
        }else if(MiscModUtil.hasCorrectArmorOn(ModArmorMaterials.EMERALD, entity)){
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, 100, 2, true, false, false));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 100, 1, true, false, false));
        }else if(MiscModUtil.hasCorrectArmorOn(ModArmorMaterials.AMETHYST, entity)){
            if(!entity.hasStatusEffect(StatusEffects.REGENERATION)){
                entity.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 0, true, false, false));
            }
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 100, 0, true, false, false));
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
        ItemStack chestplate = stacks[1];
        ItemStack helmet = stacks[0];
        return (helmet.getItem() instanceof ArmorItem) && (chestplate.getItem() instanceof ArmorItem) && (leggings.getItem() instanceof ArmorItem) && (boots.getItem() instanceof ArmorItem);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        if(this.material==ModArmorMaterials.PHYSICSIUM){
            MutableText tempTooltip = Text.literal("Grants ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("skull emoji lol").formatted(Formatting.GOLD, Formatting.BOLD, Formatting.OBFUSCATED));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("when full set of Physicsium armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        }else if(this.material== ModArmorMaterials.TITANIUM){
            MutableText tempTooltip = Text.literal("Grants ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("Resistance III, Fire Resistance,").formatted(Formatting.GOLD, Formatting.BOLD));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("Strength II, Regeneration II, and Health Boost V").formatted(Formatting.GOLD, Formatting.BOLD);
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("when full set of Titanium armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        }else if(this.material==ModArmorMaterials.REINFORCED_TRIPHITE){
            MutableText tempTooltip = Text.literal("Grants ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("Resistance II, Strength II, and Regeneration I").formatted(Formatting.GOLD, Formatting.BOLD));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("when full set of Reinforced Triphite armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        }else if(this.material==ModArmorMaterials.MYTHRIL){
            MutableText tempTooltip = Text.literal("Grants ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("Speed II, Strength I, and Conduit Power III").formatted(Formatting.GOLD, Formatting.BOLD));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("when full set of Mythril armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        }else if(this.material==ModArmorMaterials.ENDIUM){
            MutableText tempTooltip = Text.literal("Grants ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("Resistance I and Slow Falling I").formatted(Formatting.GOLD, Formatting.BOLD));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("when full set of Endium armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        }else if(this.material==ModArmorMaterials.PHENON){
            MutableText tempTooltip = Text.literal("Grants ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("Fire Resistance and Saturation I").formatted(Formatting.GOLD, Formatting.BOLD));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("when full set of Phenon armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        }else if(this.material==ModArmorMaterials.TOPAZ){
            MutableText tempTooltip = Text.literal("Grants ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("Resistance I, Haste III, and Saturation I").formatted(Formatting.GOLD, Formatting.BOLD));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("when full set of Topaz armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        }else if(this.material==ModArmorMaterials.SAPPHIRE){
            MutableText tempTooltip = Text.literal("Grants ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("Resistance I, Fire Resistance,").formatted(Formatting.GOLD, Formatting.BOLD));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("Strength I, and Speed III").formatted(Formatting.GOLD, Formatting.BOLD);
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("when full set of Sapphire armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        }else if(this.material==ModArmorMaterials.RUBY){
            MutableText tempTooltip = Text.literal("Grants ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("Fire Resistance and Strength II").formatted(Formatting.GOLD, Formatting.BOLD));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("when full set of Ruby armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        }else if(this.material==ModArmorMaterials.OPAL){
            MutableText tempTooltip = Text.literal("Grants: ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("Water Breathing, Night Vision,").formatted(Formatting.GOLD, Formatting.BOLD));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("Dolphin's Grace III, and Conduit Power III").formatted(Formatting.GOLD, Formatting.BOLD);
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("when full set of Opal armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        }else if(this.material==ModArmorMaterials.ECHO){
            MutableText tempTooltip = Text.literal("Grants ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("Resistance I and Night Vision").formatted(Formatting.GOLD, Formatting.BOLD));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("when full set of Echo armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        }else if(this.material==ModArmorMaterials.EMERALD){
            MutableText tempTooltip = Text.literal("Grants ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("Luck III and Hero of the Village II").formatted(Formatting.GOLD, Formatting.BOLD));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("when full set of Emerald armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        }else if(this.material==ModArmorMaterials.AMETHYST){
            MutableText tempTooltip = Text.literal("Grants ").formatted(Formatting.AQUA);
            tempTooltip.append(Text.literal("Regeneration I and Glowing").formatted(Formatting.GOLD, Formatting.BOLD));
            tooltip.add(tempTooltip);
            tempTooltip = Text.literal("when full set of Amethyst armor is worn.").formatted(Formatting.AQUA);
            tooltip.add(tempTooltip);
        }
        super.appendTooltip(stack, context, tooltip, type);
    }
}