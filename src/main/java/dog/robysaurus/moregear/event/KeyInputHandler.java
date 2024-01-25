package dog.robysaurus.moregear.event;

import com.google.common.collect.Iterables;
import dog.robysaurus.moregear.item.ModArmorMaterials;
import dog.robysaurus.moregear.networking.ModPackets;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import org.lwjgl.glfw.GLFW;

public class KeyInputHandler {
    public static final String KEY_CATEGORY = "key.category.moregear";
    public static final String LEVITATE_KEY = "key.moregear.levitate";
    public static KeyBinding levitatingKey;
    public static void registerKeyInputs(){
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if(levitatingKey.isPressed() && client.player != null){
                if(hasCorrectArmorOn(ModArmorMaterials.PHYSICSIUM, client.player)) {
                    ClientPlayNetworking.send(ModPackets.LEVITATING_ID, PacketByteBufs.create());
                }
            }
        });
    }
    public static void register(){
        levitatingKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(LEVITATE_KEY, InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_Z, KEY_CATEGORY));
        registerKeyInputs();
    }

    private static boolean hasCorrectArmorOn(ArmorMaterial material, LivingEntity entity) {
        ItemStack[] stacks = Iterables.toArray(entity.getArmorItems(), ItemStack.class);
        if(stacks.length!=4) {
            return false;
        }
        ItemStack boots = stacks[3];
        ItemStack leggings = stacks[2];
        ItemStack breastplate = stacks[1];
        ItemStack helmet = stacks[0];
        boolean wearingElytra = breastplate.getItem()== Items.ELYTRA;
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
}
