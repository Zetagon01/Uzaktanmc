
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thewonderland.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.thewonderland.fluid.ChocolateFluid;
import net.mcreator.thewonderland.TheWonderlandMod;

public class TheWonderlandModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, TheWonderlandMod.MODID);
	public static final RegistryObject<Fluid> CHOCOLATE = REGISTRY.register("chocolate", () -> new ChocolateFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_CHOCOLATE = REGISTRY.register("flowing_chocolate", () -> new ChocolateFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(CHOCOLATE.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_CHOCOLATE.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
