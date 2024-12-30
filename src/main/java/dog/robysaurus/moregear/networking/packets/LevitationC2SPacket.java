package dog.robysaurus.moregear.networking.packets;

import dog.robysaurus.moregear.networking.ModPackets;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.packet.CustomPayload;

public class LevitationC2SPacket {
    public record LevitationPayload() implements CustomPayload {
        public static final LevitationPayload INSTANCE = new LevitationPayload();
        public static final CustomPayload.Id<LevitationPayload> ID = new CustomPayload.Id<>(ModPackets.LEVITATING_ID);
        public static final PacketCodec<RegistryByteBuf, LevitationPayload> CODEC = PacketCodec.unit(INSTANCE);

        @Override
        public CustomPayload.Id<? extends LevitationPayload> getId() {
            return ID;
        }
    }
    
    public static void receive(LevitationPayload payload, ServerPlayNetworking.Context context){
        context.player().addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 15, 4, true, false, true));
    }
}