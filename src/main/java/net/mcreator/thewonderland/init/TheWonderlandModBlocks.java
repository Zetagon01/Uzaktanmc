
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thewonderland.init;

import org.checkerframework.checker.units.qual.K;
import org.checkerframework.checker.units.qual.C;
import org.checkerframework.checker.units.qual.A;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.thewonderland.block.ZBlock;
import net.mcreator.thewonderland.block.YBlock;
import net.mcreator.thewonderland.block.XBlock;
import net.mcreator.thewonderland.block.WBlock;
import net.mcreator.thewonderland.block.VBlock;
import net.mcreator.thewonderland.block.UBlock;
import net.mcreator.thewonderland.block.TBlock;
import net.mcreator.thewonderland.block.SweetStoneBlock;
import net.mcreator.thewonderland.block.SouldirttBlock;
import net.mcreator.thewonderland.block.SoulDirtBlock;
import net.mcreator.thewonderland.block.SoulBlockBlock;
import net.mcreator.thewonderland.block.SBlock;
import net.mcreator.thewonderland.block.RawStoneSugarBlock;
import net.mcreator.thewonderland.block.RBlock;
import net.mcreator.thewonderland.block.PBlock;
import net.mcreator.thewonderland.block.OBlock;
import net.mcreator.thewonderland.block.NBlock;
import net.mcreator.thewonderland.block.MBlock;
import net.mcreator.thewonderland.block.LBlock;
import net.mcreator.thewonderland.block.KBlock;
import net.mcreator.thewonderland.block.JBlock;
import net.mcreator.thewonderland.block.IcyOreBlock;
import net.mcreator.thewonderland.block.IcyBlockBlock;
import net.mcreator.thewonderland.block.IBlock;
import net.mcreator.thewonderland.block.HBlock;
import net.mcreator.thewonderland.block.GhostWoodBlock;
import net.mcreator.thewonderland.block.GhostStoneBlock;
import net.mcreator.thewonderland.block.GhostStairsBlock;
import net.mcreator.thewonderland.block.GhostSlabBlock;
import net.mcreator.thewonderland.block.GhostPressurePlateBlock;
import net.mcreator.thewonderland.block.GhostPlanksBlock;
import net.mcreator.thewonderland.block.GhostLogBlock;
import net.mcreator.thewonderland.block.GhostLeavesBlock;
import net.mcreator.thewonderland.block.GhostFenceGateBlock;
import net.mcreator.thewonderland.block.GhostFenceBlock;
import net.mcreator.thewonderland.block.GhostButtonBlock;
import net.mcreator.thewonderland.block.GBlock;
import net.mcreator.thewonderland.block.FBlock;
import net.mcreator.thewonderland.block.EBlock;
import net.mcreator.thewonderland.block.DemonicEnchantTableBlock;
import net.mcreator.thewonderland.block.DemonicCircleeBlock;
import net.mcreator.thewonderland.block.DemonicCircleBlock;
import net.mcreator.thewonderland.block.DemonicBlockBlock;
import net.mcreator.thewonderland.block.DBlock;
import net.mcreator.thewonderland.block.ChocolateBlock;
import net.mcreator.thewonderland.block.CandydirtBlock;
import net.mcreator.thewonderland.block.Candy_WoodsWoodBlock;
import net.mcreator.thewonderland.block.Candy_WoodsStairsBlock;
import net.mcreator.thewonderland.block.Candy_WoodsSlabBlock;
import net.mcreator.thewonderland.block.Candy_WoodsPressurePlateBlock;
import net.mcreator.thewonderland.block.Candy_WoodsPlanksBlock;
import net.mcreator.thewonderland.block.Candy_WoodsLogBlock;
import net.mcreator.thewonderland.block.Candy_WoodsLeavesBlock;
import net.mcreator.thewonderland.block.Candy_WoodsFenceGateBlock;
import net.mcreator.thewonderland.block.Candy_WoodsFenceBlock;
import net.mcreator.thewonderland.block.Candy_WoodsButtonBlock;
import net.mcreator.thewonderland.block.Candy_OresOreBlock;
import net.mcreator.thewonderland.block.Candy_OresBlockBlock;
import net.mcreator.thewonderland.block.CandySidewalkBlock;
import net.mcreator.thewonderland.block.CandyBlock;
import net.mcreator.thewonderland.block.CBlock;
import net.mcreator.thewonderland.block.ABlock;
import net.mcreator.thewonderland.TheWonderlandMod;

public class TheWonderlandModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TheWonderlandMod.MODID);
	public static final RegistryObject<Block> CANDY_GRASS_BLOCK = REGISTRY.register("candy_grass_block", () -> new CandyBlock());
	public static final RegistryObject<Block> CANDYDIRT = REGISTRY.register("candydirt", () -> new CandydirtBlock());
	public static final RegistryObject<Block> CHOCOLATE = REGISTRY.register("chocolate", () -> new ChocolateBlock());
	public static final RegistryObject<Block> CANDY_WOODS_WOOD = REGISTRY.register("candy_woods_wood", () -> new Candy_WoodsWoodBlock());
	public static final RegistryObject<Block> CANDY_WOODS_LOG = REGISTRY.register("candy_woods_log", () -> new Candy_WoodsLogBlock());
	public static final RegistryObject<Block> CANDY_WOODS_PLANKS = REGISTRY.register("candy_woods_planks", () -> new Candy_WoodsPlanksBlock());
	public static final RegistryObject<Block> CANDY_LEAVES = REGISTRY.register("candy_leaves", () -> new Candy_WoodsLeavesBlock());
	public static final RegistryObject<Block> CANDY_WOODS_STAIRS = REGISTRY.register("candy_woods_stairs", () -> new Candy_WoodsStairsBlock());
	public static final RegistryObject<Block> CANDY_WOODS_SLAB = REGISTRY.register("candy_woods_slab", () -> new Candy_WoodsSlabBlock());
	public static final RegistryObject<Block> CANDY_WOODS_FENCE = REGISTRY.register("candy_woods_fence", () -> new Candy_WoodsFenceBlock());
	public static final RegistryObject<Block> CANDY_WOODS_FENCE_GATE = REGISTRY.register("candy_woods_fence_gate",
			() -> new Candy_WoodsFenceGateBlock());
	public static final RegistryObject<Block> CANDY_WOODS_PRESSURE_PLATE = REGISTRY.register("candy_woods_pressure_plate",
			() -> new Candy_WoodsPressurePlateBlock());
	public static final RegistryObject<Block> CANDY_WOODS_BUTTON = REGISTRY.register("candy_woods_button", () -> new Candy_WoodsButtonBlock());
	public static final RegistryObject<Block> GHOST_WOOD = REGISTRY.register("ghost_wood", () -> new GhostWoodBlock());
	public static final RegistryObject<Block> GHOST_LOG = REGISTRY.register("ghost_log", () -> new GhostLogBlock());
	public static final RegistryObject<Block> GHOST_PLANKS = REGISTRY.register("ghost_planks", () -> new GhostPlanksBlock());
	public static final RegistryObject<Block> GHOST_LEAVES = REGISTRY.register("ghost_leaves", () -> new GhostLeavesBlock());
	public static final RegistryObject<Block> GHOST_STAIRS = REGISTRY.register("ghost_stairs", () -> new GhostStairsBlock());
	public static final RegistryObject<Block> GHOST_SLAB = REGISTRY.register("ghost_slab", () -> new GhostSlabBlock());
	public static final RegistryObject<Block> GHOST_FENCE = REGISTRY.register("ghost_fence", () -> new GhostFenceBlock());
	public static final RegistryObject<Block> GHOST_FENCE_GATE = REGISTRY.register("ghost_fence_gate", () -> new GhostFenceGateBlock());
	public static final RegistryObject<Block> GHOST_PRESSURE_PLATE = REGISTRY.register("ghost_pressure_plate", () -> new GhostPressurePlateBlock());
	public static final RegistryObject<Block> GHOST_BUTTON = REGISTRY.register("ghost_button", () -> new GhostButtonBlock());
	public static final RegistryObject<Block> GHOST_STONE = REGISTRY.register("ghost_stone", () -> new GhostStoneBlock());
	public static final RegistryObject<Block> SOUL_GRASS = REGISTRY.register("soul_grass", () -> new SoulDirtBlock());
	public static final RegistryObject<Block> SOULDIRTT = REGISTRY.register("souldirtt", () -> new SouldirttBlock());
	public static final RegistryObject<Block> SOUL_BLOCK = REGISTRY.register("soul_block", () -> new SoulBlockBlock());
	public static final RegistryObject<Block> SWEET_STONE = REGISTRY.register("sweet_stone", () -> new SweetStoneBlock());
	public static final RegistryObject<Block> RAW_STONE_SUGAR = REGISTRY.register("raw_stone_sugar", () -> new RawStoneSugarBlock());
	public static final RegistryObject<Block> CANDY_SIDEWALK = REGISTRY.register("candy_sidewalk", () -> new CandySidewalkBlock());
	public static final RegistryObject<Block> ICY_ORE = REGISTRY.register("icy_ore", () -> new IcyOreBlock());
	public static final RegistryObject<Block> ICY_BLOCK = REGISTRY.register("icy_block", () -> new IcyBlockBlock());
	public static final RegistryObject<Block> CANDY_ORES_ORE = REGISTRY.register("candy_ores_ore", () -> new Candy_OresOreBlock());
	public static final RegistryObject<Block> CANDY_ORES_BLOCK = REGISTRY.register("candy_ores_block", () -> new Candy_OresBlockBlock());
	public static final RegistryObject<Block> DEMONIC_CIRCLE = REGISTRY.register("demonic_circle", () -> new DemonicCircleBlock());
	public static final RegistryObject<Block> DEMONIC_BLOCK = REGISTRY.register("demonic_block", () -> new DemonicBlockBlock());
	public static final RegistryObject<Block> DEMONIC_ENCHANT_TABLE = REGISTRY.register("demonic_enchant_table",
			() -> new DemonicEnchantTableBlock());
	public static final RegistryObject<Block> DEMONIC_CIRCLEE = REGISTRY.register("demonic_circlee", () -> new DemonicCircleeBlock());
	public static final RegistryObject<Block> A = REGISTRY.register("a", () -> new ABlock());
	public static final RegistryObject<Block> S = REGISTRY.register("s", () -> new SBlock());
	public static final RegistryObject<Block> D = REGISTRY.register("d", () -> new DBlock());
	public static final RegistryObject<Block> F = REGISTRY.register("f", () -> new FBlock());
	public static final RegistryObject<Block> G = REGISTRY.register("g", () -> new GBlock());
	public static final RegistryObject<Block> H = REGISTRY.register("h", () -> new HBlock());
	public static final RegistryObject<Block> J = REGISTRY.register("j", () -> new JBlock());
	public static final RegistryObject<Block> K = REGISTRY.register("k", () -> new KBlock());
	public static final RegistryObject<Block> L = REGISTRY.register("l", () -> new LBlock());
	public static final RegistryObject<Block> M = REGISTRY.register("m", () -> new MBlock());
	public static final RegistryObject<Block> N = REGISTRY.register("n", () -> new NBlock());
	public static final RegistryObject<Block> O = REGISTRY.register("o", () -> new OBlock());
	public static final RegistryObject<Block> P = REGISTRY.register("p", () -> new PBlock());
	public static final RegistryObject<Block> R = REGISTRY.register("r", () -> new RBlock());
	public static final RegistryObject<Block> I = REGISTRY.register("i", () -> new IBlock());
	public static final RegistryObject<Block> Z = REGISTRY.register("z", () -> new ZBlock());
	public static final RegistryObject<Block> X = REGISTRY.register("x", () -> new XBlock());
	public static final RegistryObject<Block> C = REGISTRY.register("c", () -> new CBlock());
	public static final RegistryObject<Block> V = REGISTRY.register("v", () -> new VBlock());
	public static final RegistryObject<Block> W = REGISTRY.register("w", () -> new WBlock());
	public static final RegistryObject<Block> E = REGISTRY.register("e", () -> new EBlock());
	public static final RegistryObject<Block> T = REGISTRY.register("t", () -> new TBlock());
	public static final RegistryObject<Block> Y = REGISTRY.register("y", () -> new YBlock());
	public static final RegistryObject<Block> U = REGISTRY.register("u", () -> new UBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			CandyBlock.registerRenderLayer();
			SoulDirtBlock.registerRenderLayer();
			CandySidewalkBlock.registerRenderLayer();
			DemonicCircleBlock.registerRenderLayer();
			DemonicEnchantTableBlock.registerRenderLayer();
		}

		@SubscribeEvent
		public static void blockColorLoad(ColorHandlerEvent.Block event) {
			CandyBlock.blockColorLoad(event);
			SoulDirtBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(ColorHandlerEvent.Item event) {
			CandyBlock.itemColorLoad(event);
			SoulDirtBlock.itemColorLoad(event);
		}
	}
}
