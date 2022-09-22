
package net.mcreator.thewonderland.world.biome;

import net.minecraftforge.common.BiomeDictionary;

import net.minecraft.world.level.levelgen.placement.SurfaceWaterDepthFilter;
import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraft.world.level.levelgen.placement.NoiseThresholdCountPlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.AquaticPlacements;
import net.minecraft.data.worldgen.features.VegetationFeatures;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.AquaticFeatures;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.core.Registry;

import net.mcreator.thewonderland.world.features.treedecorators.CandylandTrunkDecorator;
import net.mcreator.thewonderland.world.features.treedecorators.CandylandLeaveDecorator;
import net.mcreator.thewonderland.world.features.treedecorators.CandylandFruitDecorator;
import net.mcreator.thewonderland.init.TheWonderlandModBlocks;
import net.mcreator.thewonderland.init.TheWonderlandModBiomes;

import java.util.List;

import com.google.common.collect.ImmutableList;

public class CandylandBiome {
	public static final Climate.ParameterPoint PARAMETER_POINT = new Climate.ParameterPoint(Climate.Parameter.span(-0.142857142857f, 0.142857142857f),
			Climate.Parameter.span(-0.142857142857f, 0.142857142857f), Climate.Parameter.span(0.367142857143f, 0.652857142857f),
			Climate.Parameter.span(0.657142857143f, 0.942857142857f), Climate.Parameter.point(0),
			Climate.Parameter.span(-0.599505929371f, -0.313791643657f), 0);

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(-535297).waterColor(4159204).waterFogColor(329011).skyColor(-535297)
				.foliageColorOverride(10387789).grassColorOverride(-13247603).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("the_wonderland:tree_candyland",
						FeatureUtils.register("the_wonderland:tree_candyland", Feature.TREE,
								new TreeConfiguration.TreeConfigurationBuilder(
										BlockStateProvider.simple(TheWonderlandModBlocks.CANDY_WOODS_LOG.get().defaultBlockState()),
										new StraightTrunkPlacer(6, 2, 0),
										BlockStateProvider.simple(TheWonderlandModBlocks.CANDY_LEAVES.get().defaultBlockState()),
										new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1))
										.decorators(ImmutableList.of(CandylandLeaveDecorator.INSTANCE, CandylandTrunkDecorator.INSTANCE,
												CandylandFruitDecorator.INSTANCE))
										.build()),
						List.of(CountPlacement.of(20), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0),
								PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING),
								BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("the_wonderland:grass_candyland", VegetationFeatures.PATCH_GRASS,
						List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 20), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
								BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("the_wonderland:seagrass_candyland", AquaticFeatures.SEAGRASS_SHORT, AquaticPlacements.seagrassPlacement(9)));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("the_wonderland:flower_candyland", VegetationFeatures.FLOWER_DEFAULT, List.of(CountPlacement.of(4),
						RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		BiomeDefaultFeatures.addSurfaceFreezing(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.PLAINS).temperature(0.5f)
				.downfall(0.5f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build())
				.build();
	}

	public static void init() {
		BiomeDictionary.addTypes(ResourceKey.create(Registry.BIOME_REGISTRY, BuiltinRegistries.BIOME.getKey(TheWonderlandModBiomes.CANDYLAND.get())),
				BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.DRY, BiomeDictionary.Type.MAGICAL, BiomeDictionary.Type.OVERWORLD);
	}
}
