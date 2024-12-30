package dog.robysaurus.moregear.networking;

import dog.robysaurus.moregear.MoreGear;
import dog.robysaurus.moregear.networking.packets.LevitationC2SPacket;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.util.Identifier;

public class ModPackets {
    public static final Identifier LEVITATING_ID = Identifier.of(MoreGear.MOD_ID, "levitating");
    public static void registerC2SPackets(){
        PayloadTypeRegistry.playC2S().register(LevitationC2SPacket.LevitationPayload.ID, LevitationC2SPacket.LevitationPayload.CODEC);
        ServerPlayNetworking.registerGlobalReceiver(LevitationC2SPacket.LevitationPayload.ID, LevitationC2SPacket::receive);
    }
    public static void registerS2CPackets(){

    }
}
