package dog.robysaurus.moregear.entity.client;

import dog.robysaurus.moregear.MoreGear;
import dog.robysaurus.moregear.entity.custom.ShrikeEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class ShrikeRenderer extends MobEntityRenderer<ShrikeEntity, ShrikeModel<ShrikeEntity>> {
    private static final Identifier TEXTURE = Identifier.of(MoreGear.MOD_ID, "textures/entity/shrike.png");
    public ShrikeRenderer(EntityRendererFactory.Context context) {
        super(context, new ShrikeModel<>(context.getPart(ModModelLayers.SHRIKE)), 0.75f);
    }

    @Override
    public Identifier getTexture(ShrikeEntity entity) {
        return TEXTURE;
    }
}
