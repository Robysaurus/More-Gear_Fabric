package dog.robysaurus.moregear.entity.client;

import dog.robysaurus.moregear.entity.animation.ModAnimations;
import dog.robysaurus.moregear.entity.custom.ShrikeEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;
public class ShrikeModel<T extends ShrikeEntity> extends SinglePartEntityModel<T> {
	public final ModelPart Shrike;
	public final ModelPart head;
	public ShrikeModel(ModelPart root) {
		this.Shrike = root.getChild("Shrike");
		this.head = Shrike.getChild("head");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData Shrike = modelPartData.addChild("Shrike", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData tendrils = Shrike.addChild("tendrils", ModelPartBuilder.create().uv(24, 58).cuboid(-7.0F, -0.5F, -4.0F, 2.0F, 11.0F, 2.0F, new Dilation(0.0F))
				.uv(16, 58).cuboid(-3.0F, -0.5F, -5.0F, 2.0F, 11.0F, 2.0F, new Dilation(0.0F))
				.uv(56, 21).cuboid(1.0F, -0.5F, -5.0F, 2.0F, 11.0F, 2.0F, new Dilation(0.0F))
				.uv(48, 0).cuboid(5.0F, -0.5F, -4.0F, 2.0F, 11.0F, 2.0F, new Dilation(0.0F))
				.uv(33, 41).cuboid(5.0F, -0.5F, 2.0F, 2.0F, 11.0F, 2.0F, new Dilation(0.0F))
				.uv(25, 39).cuboid(1.0F, -0.5F, 3.0F, 2.0F, 11.0F, 2.0F, new Dilation(0.0F))
				.uv(8, 37).cuboid(-3.0F, -0.5F, 3.0F, 2.0F, 11.0F, 2.0F, new Dilation(0.0F))
				.uv(0, 37).cuboid(-7.0F, -0.5F, 2.0F, 2.0F, 11.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -15.0F, 0.0F));

		ModelPartData torso = Shrike.addChild("torso", ModelPartBuilder.create().uv(0, 0).cuboid(-7.0F, -42.0F, -5.0F, 14.0F, 27.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData bottom_left_arm = Shrike.addChild("bottom_left_arm", ModelPartBuilder.create().uv(31, 20).cuboid(-2.0F, -2.0F, -15.5F, 4.0F, 4.0F, 17.0F, new Dilation(0.0F)), ModelTransform.pivot(9.0F, -20.0F, 0.5F));

		ModelPartData bottom_right_arm = Shrike.addChild("bottom_right_arm", ModelPartBuilder.create().uv(0, 37).cuboid(-2.0F, -2.0F, -15.5F, 4.0F, 4.0F, 17.0F, new Dilation(0.0F)), ModelTransform.pivot(-9.0F, -20.0F, 0.5F));

		ModelPartData top_right_arm = Shrike.addChild("top_right_arm", ModelPartBuilder.create().uv(56, 0).cuboid(-2.0F, -1.5F, -2.0F, 4.0F, 17.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-9.0F, -39.5F, 0.0F));

		ModelPartData top_left_arm = Shrike.addChild("top_left_arm", ModelPartBuilder.create().uv(0, 58).cuboid(-2.0F, -1.5F, -2.0F, 4.0F, 17.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(9.0F, -39.5F, 0.0F));

		ModelPartData head = Shrike.addChild("head", ModelPartBuilder.create().uv(42, 41).cuboid(-5.0F, -10.0F, -5.0F, 10.0F, 10.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -42.0F, -1.0F));
		return TexturedModelData.of(modelData, 128, 128);
	}
	@Override
	public void setAngles(ShrikeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.setHeadAngles(netHeadYaw, headPitch);

		this.animateMovement(ModAnimations.WALK, limbSwing, limbSwingAmount, 0.1f, 0.1f);
		this.updateAnimation(entity.idleAnimationState, ModAnimations.IDLE, ageInTicks, 1f);
		this.updateAnimation(entity.attackAnimationState, ModAnimations.ATTACK, ageInTicks, 1f);
	}

	private void setHeadAngles(float headYaw, float headPitch) {
		headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
		headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

		this.head.yaw = headYaw * 0.017453292F;
		this.head.pitch = headPitch * 0.017453292F;
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		Shrike.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return Shrike;
	}
}