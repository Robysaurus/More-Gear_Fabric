package dog.robysaurus.moregear.networking;

import dog.robysaurus.moregear.MoreGear;
import dog.robysaurus.moregear.networking.packets.LevitationC2SPacket;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.util.Identifier;

public class ModPackets {
    public static final Identifier LEVITATING_ID = new Identifier(MoreGear.MOD_ID, "levitating");
    public static void registerC2SPackets(){
        ServerPlayNetworking.registerGlobalReceiver(LEVITATING_ID, LevitationC2SPacket::receive);
    }
    public static void registerS2CPackets(){

    }
}
