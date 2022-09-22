
package net.mcreator.thewonderland.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.thewonderland.entity.ImpEntity;
import net.mcreator.thewonderland.client.model.Modelcustom_model;

public class ImpRenderer extends MobRenderer<ImpEntity, Modelcustom_model<ImpEntity>> {
	public ImpRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ImpEntity entity) {
		return new ResourceLocation("the_wonderland:textures/entities/imps_texture.png");
	}
}
