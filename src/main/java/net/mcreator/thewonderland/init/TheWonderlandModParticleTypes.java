
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thewonderland.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.thewonderland.TheWonderlandMod;

public class TheWonderlandModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, TheWonderlandMod.MODID);
	public static final RegistryObject<ParticleType<?>> CANDY_LEAF = REGISTRY.register("candy_leaf", () -> new SimpleParticleType(true));
}
