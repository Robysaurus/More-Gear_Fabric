package dog.robysaurus.moregear.event;

import dog.robysaurus.moregear.item.ModArmorMaterials;
import dog.robysaurus.moregear.networking.packets.LevitationC2SPacket;
import dog.robysaurus.moregear.util.MiscModUtil;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class KeyInputHandler {
    public static final String KEY_CATEGORY = "key.category.moregear";
    public static final String LEVITATE_KEY = "key.moregear.levitate";
    public static KeyBinding levitatingKey;
    public static void registerKeyInputs(){
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if(client.player != null && levitatingKey.isPressed()){
                if(MiscModUtil.hasCorrectArmorOn(ModArmorMaterials.PHYSICSIUM, client.player)) {
                    ClientPlayNetworking.send(LevitationC2SPacket.LevitationPayload.INSTANCE);
                }
            }
        });
    }
    public static void register(){
        levitatingKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(LEVITATE_KEY, InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_Z, KEY_CATEGORY));
        registerKeyInputs();
    }
}
