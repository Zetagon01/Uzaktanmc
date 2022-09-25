
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thewonderland.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.thewonderland.entity.ImpEntity;
import net.mcreator.thewonderland.entity.HexBallEntity;
import net.mcreator.thewonderland.TheWonderlandMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheWonderlandModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, TheWonderlandMod.MODID);
	public static final RegistryObject<EntityType<ImpEntity>> IMP = register("imp",
			EntityType.Builder.<ImpEntity>of(ImpEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(ImpEntity::new).fireImmune().sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<HexBallEntity>> HEX_BALL = register("projectile_hex_ball",
			EntityType.Builder.<HexBallEntity>of(HexBallEntity::new, MobCategory.MISC).setCustomClientFactory(HexBallEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ImpEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(IMP.get(), ImpEntity.createAttributes().build());
	}
}
