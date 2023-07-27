package dog.robysaurus.moregear.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ModArmorItem extends ArmorItem {

    public ModArmorItem(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
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

        }else if(hasCorrectArmorOn(ModArmorMaterials.ECHO, player)){
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 100, 2, true, false, true));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 100, 0, true, false, true));
        }else if(hasCorrectArmorOn(ModArmorMaterials.EMERALD, player)){
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, 100, 2, true, false, true));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 100, 1, true, false, true));
        }else if(hasCorrectArmorOn(ModArmorMaterials.AMETHYST, player)){
            if(!player.hasStatusEffect(StatusEffects.REGENERATION)){
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 0, true, false, true));
            }
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 100, 0, true, false, true));
        }else{
            player.removeStatusEffect(StatusEffects.HEALTH_BOOST);
        }
    }

    private boolean hasFullSuitOfArmorOn(PlayerEntity player) {
        ItemStack boots = player.getInventory().getArmorStack(0);
        ItemStack leggings = player.getInventory().getArmorStack(1);
        ItemStack breastplate = player.getInventory().getArmorStack(2);
        ItemStack helmet = player.getInventory().getArmorStack(3);

        return !helmet.isEmpty() && !breastplate.isEmpty()
                && !leggings.isEmpty() && !boots.isEmpty();
    }

    private boolean hasCorrectArmorOn(ArmorMaterial material, PlayerEntity player) {
        ArmorItem boots = ((ArmorItem)player.getInventory().getArmorStack(0).getItem());
        ArmorItem leggings = ((ArmorItem)player.getInventory().getArmorStack(1).getItem());
        ArmorItem breastplate = ((ArmorItem)player.getInventory().getArmorStack(2).getItem());
        ArmorItem helmet = ((ArmorItem)player.getInventory().getArmorStack(3).getItem());

        return helmet.getMaterial() == material && breastplate.getMaterial() == material &&
                leggings.getMaterial() == material && boots.getMaterial() == material;
    }
}
