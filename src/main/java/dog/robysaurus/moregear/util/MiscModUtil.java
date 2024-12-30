package dog.robysaurus.moregear.util;

import com.google.common.collect.Iterables;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;

public class MiscModUtil {
    public static void registerMiscModUtil(){
        //registerTooltips();
    }
    public static boolean hasCorrectArmorOn(RegistryEntry<ArmorMaterial> material, LivingEntity entity) {
        ItemStack[] stacks = Iterables.toArray(entity.getArmorItems(), ItemStack.class);
        if(stacks.length!=4) {
            return false;
        }
        try {
            ArmorItem boots = ((ArmorItem) stacks[3].getItem());
            ArmorItem leggings = ((ArmorItem) stacks[2].getItem());
            ArmorItem chestplate = ((ArmorItem) stacks[1].getItem());
            ArmorItem helmet = ((ArmorItem) stacks[0].getItem());
            return helmet.getMaterial() == material && chestplate.getMaterial() == material &&
                    leggings.getMaterial() == material && boots.getMaterial() == material;
        }catch(Exception e){
            return false;
        }
    }
}
