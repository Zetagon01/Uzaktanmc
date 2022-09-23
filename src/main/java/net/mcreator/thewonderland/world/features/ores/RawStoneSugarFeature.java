
package net.mcreator.thewonderland.world.features.ores;

public class RawStoneSugarFeature extends OreFeature {

	public static RawStoneSugarFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new RawStoneSugarFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("the_wonderland:raw_stone_sugar", FEATURE,
				new OreConfiguration(RawStoneSugarFeatureRuleTest.INSTANCE, TheWonderlandModBlocks.RAW_STONE_SUGAR.get().defaultBlockState(), 16));
		PLACED_FEATURE = PlacementUtils.register("the_wonderland:raw_stone_sugar", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(10), InSquarePlacement.spread(),
						HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(40)), BiomeFilter.biome()));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("the_wonderland:candyland"));

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public RawStoneSugarFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;

		return super.place(context);
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	private static class RawStoneSugarFeatureRuleTest extends RuleTest {

		static final RawStoneSugarFeatureRuleTest INSTANCE = new RawStoneSugarFeatureRuleTest();

		private static final com.mojang.serialization.Codec<RawStoneSugarFeatureRuleTest> CODEC = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		private static final RuleTestType<RawStoneSugarFeatureRuleTest> CUSTOM_MATCH = () -> CODEC;

		@SubscribeEvent
		public static void init(FMLCommonSetupEvent event) {
			Registry.register(Registry.RULE_TEST, new ResourceLocation("the_wonderland:raw_stone_sugar_match"), CUSTOM_MATCH);
		}

		private List<Block> base_blocks = null;

		public boolean test(BlockState blockAt, Random random) {
			if (base_blocks == null) {
				base_blocks = List.of(Blocks.STONE);
			}

			return base_blocks.contains(blockAt.getBlock());
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}

	}

}
