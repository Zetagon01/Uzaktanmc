
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thewonderland.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.thewonderland.world.features.ores.SweetStoneFeature;
import net.mcreator.thewonderland.world.features.ores.SouldirttFeature;
import net.mcreator.thewonderland.world.features.ores.SoulDirtFeature;
import net.mcreator.thewonderland.world.features.ores.RawStoneSugarFeature;
import net.mcreator.thewonderland.world.features.ores.IcyOreFeature;
import net.mcreator.thewonderland.world.features.ores.GhostStoneFeature;
import net.mcreator.thewonderland.world.features.ores.Candy_WoodsLeavesFeature;
import net.mcreator.thewonderland.world.features.lakes.ChocolateFeature;
import net.mcreator.thewonderland.TheWonderlandMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class TheWonderlandModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, TheWonderlandMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> CHOCOLATE = register("chocolate", ChocolateFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.LAKES, ChocolateFeature.GENERATE_BIOMES, ChocolateFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CANDY_LEAVES = register("candy_leaves", Candy_WoodsLeavesFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, Candy_WoodsLeavesFeature.GENERATE_BIOMES, Candy_WoodsLeavesFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GHOST_STONE = register("ghost_stone", GhostStoneFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, GhostStoneFeature.GENERATE_BIOMES, GhostStoneFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SOUL_GRASS = register("soul_grass", SoulDirtFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SoulDirtFeature.GENERATE_BIOMES, SoulDirtFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SOULDIRTT = register("souldirtt", SouldirttFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SouldirttFeature.GENERATE_BIOMES, SouldirttFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SWEET_STONE = register("sweet_stone", SweetStoneFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SweetStoneFeature.GENERATE_BIOMES, SweetStoneFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RAW_STONE_SUGAR = register("raw_stone_sugar", RawStoneSugarFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, RawStoneSugarFeature.GENERATE_BIOMES,
					RawStoneSugarFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ICY_ORE = register("icy_ore", IcyOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, IcyOreFeature.GENERATE_BIOMES, IcyOreFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
