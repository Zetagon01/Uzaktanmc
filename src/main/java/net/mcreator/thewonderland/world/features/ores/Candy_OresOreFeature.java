
package net.mcreator.thewonderland.world.features.ores;

public class Candy_OresOreFeature extends OreFeature {

	public static Candy_OresOreFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new Candy_OresOreFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("the_wonderland:candy_ores_ore", FEATURE,
				new OreConfiguration(Candy_OresOreFeatureRuleTest.INSTANCE, TheWonderlandModBlocks.CANDY_ORES_ORE.get().defaultBlockState(), 3));
		PLACED_FEATURE = PlacementUtils.register("the_wonderland:candy_ores_ore", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(5), InSquarePlacement.spread(),
						HeightRangePlacement.uniform(VerticalAnchor.absolute(1), VerticalAnchor.absolute(33)), BiomeFilter.biome()));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public Candy_OresOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;

		return super.place(context);
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	private static class Candy_OresOreFeatureRuleTest extends RuleTest {

		static final Candy_OresOreFeatureRuleTest INSTANCE = new Candy_OresOreFeatureRuleTest();

		private static final com.mojang.serialization.Codec<Candy_OresOreFeatureRuleTest> CODEC = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		private static final RuleTestType<Candy_OresOreFeatureRuleTest> CUSTOM_MATCH = () -> CODEC;

		@SubscribeEvent
		public static void init(FMLCommonSetupEvent event) {
			Registry.register(Registry.RULE_TEST, new ResourceLocation("the_wonderland:candy_ores_ore_match"), CUSTOM_MATCH);
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
