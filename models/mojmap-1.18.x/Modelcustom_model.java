// Made with Blockbench 4.4.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart head;
	private final ModelPart leftarm;
	private final ModelPart rightarm;
	private final ModelPart body;
	private final ModelPart rightleg;
	private final ModelPart leftleg;

	public Modelcustom_model(ModelPart root) {
		this.head = root.getChild("head");
		this.leftarm = root.getChild("leftarm");
		this.rightarm = root.getChild("rightarm");
		this.body = root.getChild("body");
		this.rightleg = root.getChild("rightleg");
		this.leftleg = root.getChild("leftleg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(4, 38)
				.addBox(1.9758F, -3.6003F, -1.9967F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 40)
				.addBox(0.9758F, -2.0003F, -1.9967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 38)
				.addBox(0.9758F, -5.0003F, -1.9967F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 11)
				.addBox(-0.5242F, -0.0003F, -3.9967F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(26, 0)
				.addBox(-2.8242F, -1.0003F, -0.9967F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(30, 24)
				.addBox(-3.0242F, -2.0003F, 0.0033F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.0F, 1.0F, -0.0044F, 0.0415F, -0.0242F));

		PartDefinition cube_r1 = head
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(32, 5).addBox(-2.024F, 0.9997F, 0.0044F, 4.0F, 1.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0436F, 0.0F));

		PartDefinition head_r1 = head.addOrReplaceChild(
				"head_r1", CubeListBuilder.create().texOffs(18, 26).addBox(-2.0242F, -12.0003F, -0.9967F, 4.0F, 2.0F,
						4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 11.0F, -1.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition ear2 = head.addOrReplaceChild("ear2",
				CubeListBuilder.create().texOffs(35, 35)
						.addBox(3.0F, -1.0F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 35)
						.addBox(4.0F, -3.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 28)
						.addBox(6.0F, -3.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(23, 35)
						.addBox(4.0F, -2.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 22)
						.addBox(3.0F, -2.0F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 26)
						.addBox(3.0F, -1.0F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, -3.098F, 0.0F));

		PartDefinition horn = head.addOrReplaceChild("horn", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition horn2 = horn.addOrReplaceChild("horn2", CubeListBuilder.create().texOffs(40, 13)
				.addBox(-1.9758F, -3.0003F, -2.0033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(37, 37)
				.addBox(-1.9758F, -6.0003F, -2.0033F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 37)
				.addBox(-0.9758F, -4.6003F, -2.0033F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 1.0F, -3.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0879F, 0.0057F, -0.0047F));

		PartDefinition jaw_r1 = jaw.addOrReplaceChild("jaw_r1",
				CubeListBuilder.create().texOffs(32, 8).addBox(-1.9249F, -0.0084F, -2.1271F, 4.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.043F, -0.0059F, 0.0045F));

		PartDefinition ear = head.addOrReplaceChild("ear",
				CubeListBuilder.create().texOffs(37, 11)
						.addBox(3.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 36)
						.addBox(4.0F, -3.0F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 32)
						.addBox(6.0F, -3.5F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 36)
						.addBox(4.0F, -2.0F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 36)
						.addBox(3.0F, -2.0F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 36)
						.addBox(3.0F, -1.0F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm",
				CubeListBuilder.create().texOffs(35, 40)
						.addBox(0.0F, 1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(31, 40)
						.addBox(0.0F, 1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 38)
						.addBox(0.4F, 2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 8.0F, 1.5F));

		PartDefinition cube_r2 = leftarm.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(23, 37)
						.addBox(-1.05F, 0.0F, -2.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(-0.5F, 0.0F, -1.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9F, 4.0F, 0.2F, 0.6545F, 0.0F, 0.0F));

		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm",
				CubeListBuilder.create().texOffs(24, 39)
						.addBox(-1.0F, 1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 32)
						.addBox(-1.0F, 1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 37)
						.addBox(-1.6F, 2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 8.0F, 1.5F));

		PartDefinition cube_r3 = rightarm.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(37, 15)
						.addBox(-1.1F, 0.0F, -2.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.55F, 0.0F, -1.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.05F, 4.0F, 0.0F, 0.6981F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 26)
						.addBox(-3.0F, -14.0F, 0.0F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(39, 21)
						.addBox(-0.5F, -16.0F, 1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(31, 29)
						.addBox(-2.0F, -11.0F, 0.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(-3.0F, -8.0F, 0.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 23.0F, 0.0F));

		PartDefinition rightleg = partdefinition.addOrReplaceChild("rightleg",
				CubeListBuilder.create().texOffs(16, 38)
						.addBox(0.0F, 1.9962F, -2.0872F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 19)
						.addBox(-1.0F, 0.9962F, -2.0872F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 36)
						.addBox(0.0F, 3.9962F, -1.5872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 38)
						.addBox(0.0F, 4.9962F, -1.0872F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 15)
						.addBox(0.0F, 6.9962F, -4.0872F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 16.0F, 2.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition leftleg = partdefinition.addOrReplaceChild("leftleg",
				CubeListBuilder.create().texOffs(39, 18)
						.addBox(-1.0F, 1.9962F, -2.0872F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 32)
						.addBox(-1.0F, 0.9962F, -2.0872F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(39, 40)
						.addBox(-1.0F, 3.9962F, -1.5872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 38)
						.addBox(-1.0F, 4.9962F, -1.0872F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 32)
						.addBox(-1.0F, 6.9962F, -4.0872F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 16.0F, 2.0F, 0.0873F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.rightleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.rightarm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.leftleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leftarm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}