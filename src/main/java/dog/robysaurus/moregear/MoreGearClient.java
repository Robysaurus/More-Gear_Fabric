package dog.robysaurus.moregear;

import dog.robysaurus.moregear.entity.ModEntities;
import dog.robysaurus.moregear.entity.client.ModModelLayers;
import dog.robysaurus.moregear.entity.client.ShrikeModel;
import dog.robysaurus.moregear.entity.client.ShrikeRenderer;
import dog.robysaurus.moregear.event.KeyInputHandler;
import dog.robysaurus.moregear.networking.ModPackets;
import dog.robysaurus.moregear.util.MiscClientUtil;
import dog.robysaurus.moregear.util.ModModelPredicateProvider;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class MoreGearClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModModelPredicateProvider.registerModModels();
        MiscClientUtil.registerMiscModUtil();
        KeyInputHandler.register();
        ModPackets.registerS2CPackets();
        EntityRendererRegistry.register(ModEntities.SHRIKE, ShrikeRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.SHRIKE, ShrikeModel::getTexturedModelData);
    }
}