
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
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.thewonderland.item.SoulaletSwordItem;
import net.mcreator.thewonderland.item.SoulaletShovelItem;
import net.mcreator.thewonderland.item.SoulaletPickaxeItem;
import net.mcreator.thewonderland.item.SoulaletHoeItem;
import net.mcreator.thewonderland.item.SoulaletAxeItem;
import net.mcreator.thewonderland.item.SoulItem;
import net.mcreator.thewonderland.item.SoulArmorsArmorItem;
import net.mcreator.thewonderland.item.PirateCutlassItem;
import net.mcreator.thewonderland.item.Lv1DemonSwordItem;
import net.mcreator.thewonderland.item.IcyToolsSwordItem;
import net.mcreator.thewonderland.item.IcyToolsShovelItem;
import net.mcreator.thewonderland.item.IcyToolsPickaxeItem;
import net.mcreator.thewonderland.item.IcyToolsHoeItem;
import net.mcreator.thewonderland.item.IcyToolsAxeItem;
import net.mcreator.thewonderland.item.IcyItem;
import net.mcreator.thewonderland.item.HexBallItem;
import net.mcreator.thewonderland.item.EnchantedDemonicEssenceItem;
import net.mcreator.thewonderland.item.DemonicEssenceItem;
import net.mcreator.thewonderland.item.ChocolateItem;
import net.mcreator.thewonderland.item.Candy_ToolsSwordItem;
import net.mcreator.thewonderland.item.Candy_ToolsShovelItem;
import net.mcreator.thewonderland.item.Candy_ToolsPickaxeItem;
import net.mcreator.thewonderland.item.Candy_ToolsHoeItem;
import net.mcreator.thewonderland.item.Candy_ToolsAxeItem;
import net.mcreator.thewonderland.item.Candy_OresDustItem;
import net.mcreator.thewonderland.item.Candy_ArmorArmorItem;
import net.mcreator.thewonderland.item.CandyBarItem;
import net.mcreator.thewonderland.TheWonderlandMod;

public class TheWonderlandModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TheWonderlandMod.MODID);
	public static final RegistryObject<Item> CANDY_GRASS_BLOCK = block(TheWonderlandModBlocks.CANDY_GRASS_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CANDYDIRT = block(TheWonderlandModBlocks.CANDYDIRT, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CHOCOLATE_BUCKET = REGISTRY.register("chocolate_bucket", () -> new ChocolateItem());
	public static final RegistryObject<Item> CANDY_WOODS_WOOD = block(TheWonderlandModBlocks.CANDY_WOODS_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CANDY_WOODS_LOG = block(TheWonderlandModBlocks.CANDY_WOODS_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CANDY_WOODS_PLANKS = block(TheWonderlandModBlocks.CANDY_WOODS_PLANKS,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CANDY_LEAVES = block(TheWonderlandModBlocks.CANDY_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> CANDY_WOODS_STAIRS = block(TheWonderlandModBlocks.CANDY_WOODS_STAIRS,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CANDY_WOODS_SLAB = block(TheWonderlandModBlocks.CANDY_WOODS_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CANDY_WOODS_FENCE = block(TheWonderlandModBlocks.CANDY_WOODS_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> CANDY_WOODS_FENCE_GATE = block(TheWonderlandModBlocks.CANDY_WOODS_FENCE_GATE,
			CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> CANDY_WOODS_PRESSURE_PLATE = block(TheWonderlandModBlocks.CANDY_WOODS_PRESSURE_PLATE,
			CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> CANDY_WOODS_BUTTON = block(TheWonderlandModBlocks.CANDY_WOODS_BUTTON,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> GHOST_WOOD = block(TheWonderlandModBlocks.GHOST_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> GHOST_LOG = block(TheWonderlandModBlocks.GHOST_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> GHOST_PLANKS = block(TheWonderlandModBlocks.GHOST_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> GHOST_LEAVES = block(TheWonderlandModBlocks.GHOST_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> GHOST_STAIRS = block(TheWonderlandModBlocks.GHOST_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> GHOST_SLAB = block(TheWonderlandModBlocks.GHOST_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> GHOST_FENCE = block(TheWonderlandModBlocks.GHOST_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> GHOST_FENCE_GATE = block(TheWonderlandModBlocks.GHOST_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> GHOST_PRESSURE_PLATE = block(TheWonderlandModBlocks.GHOST_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> GHOST_BUTTON = block(TheWonderlandModBlocks.GHOST_BUTTON, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> GHOST_STONE = block(TheWonderlandModBlocks.GHOST_STONE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SOUL_GRASS = block(TheWonderlandModBlocks.SOUL_GRASS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SOULDIRTT = block(TheWonderlandModBlocks.SOULDIRTT, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SOUL = REGISTRY.register("soul", () -> new SoulItem());
	public static final RegistryObject<Item> SOUL_BLOCK = block(TheWonderlandModBlocks.SOUL_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SOULALET_PICKAXE = REGISTRY.register("soulalet_pickaxe", () -> new SoulaletPickaxeItem());
	public static final RegistryObject<Item> SOULALET_AXE = REGISTRY.register("soulalet_axe", () -> new SoulaletAxeItem());
	public static final RegistryObject<Item> SOULALET_SWORD = REGISTRY.register("soulalet_sword", () -> new SoulaletSwordItem());
	public static final RegistryObject<Item> SOULALET_SHOVEL = REGISTRY.register("soulalet_shovel", () -> new SoulaletShovelItem());
	public static final RegistryObject<Item> SOULALET_HOE = REGISTRY.register("soulalet_hoe", () -> new SoulaletHoeItem());
	public static final RegistryObject<Item> SOUL_ARMORS_ARMOR_HELMET = REGISTRY.register("soul_armors_armor_helmet",
			() -> new SoulArmorsArmorItem.Helmet());
	public static final RegistryObject<Item> SOUL_ARMORS_ARMOR_CHESTPLATE = REGISTRY.register("soul_armors_armor_chestplate",
			() -> new SoulArmorsArmorItem.Chestplate());
	public static final RegistryObject<Item> SOUL_ARMORS_ARMOR_LEGGINGS = REGISTRY.register("soul_armors_armor_leggings",
			() -> new SoulArmorsArmorItem.Leggings());
	public static final RegistryObject<Item> SOUL_ARMORS_ARMOR_BOOTS = REGISTRY.register("soul_armors_armor_boots",
			() -> new SoulArmorsArmorItem.Boots());
	public static final RegistryObject<Item> IMP = REGISTRY.register("imp_spawn_egg",
			() -> new ForgeSpawnEggItem(TheWonderlandModEntities.IMP, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> CANDY_BAR = REGISTRY.register("candy_bar", () -> new CandyBarItem());
	public static final RegistryObject<Item> SWEET_STONE = block(TheWonderlandModBlocks.SWEET_STONE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RAW_STONE_SUGAR = block(TheWonderlandModBlocks.RAW_STONE_SUGAR, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CANDY_SIDEWALK = block(TheWonderlandModBlocks.CANDY_SIDEWALK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ICY = REGISTRY.register("icy", () -> new IcyItem());
	public static final RegistryObject<Item> CANDY_TOOLS_PICKAXE = REGISTRY.register("candy_tools_pickaxe", () -> new Candy_ToolsPickaxeItem());
	public static final RegistryObject<Item> ICY_ORE = block(TheWonderlandModBlocks.ICY_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CANDY_TOOLS_AXE = REGISTRY.register("candy_tools_axe", () -> new Candy_ToolsAxeItem());
	public static final RegistryObject<Item> ICY_BLOCK = block(TheWonderlandModBlocks.ICY_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CANDY_TOOLS_SWORD = REGISTRY.register("candy_tools_sword", () -> new Candy_ToolsSwordItem());
	public static final RegistryObject<Item> CANDY_TOOLS_SHOVEL = REGISTRY.register("candy_tools_shovel", () -> new Candy_ToolsShovelItem());
	public static final RegistryObject<Item> CANDY_TOOLS_HOE = REGISTRY.register("candy_tools_hoe", () -> new Candy_ToolsHoeItem());
	public static final RegistryObject<Item> ICY_TOOLS_PICKAXE = REGISTRY.register("icy_tools_pickaxe", () -> new IcyToolsPickaxeItem());
	public static final RegistryObject<Item> ICY_TOOLS_AXE = REGISTRY.register("icy_tools_axe", () -> new IcyToolsAxeItem());
	public static final RegistryObject<Item> ICY_TOOLS_SWORD = REGISTRY.register("icy_tools_sword", () -> new IcyToolsSwordItem());
	public static final RegistryObject<Item> ICY_TOOLS_SHOVEL = REGISTRY.register("icy_tools_shovel", () -> new IcyToolsShovelItem());
	public static final RegistryObject<Item> ICY_TOOLS_HOE = REGISTRY.register("icy_tools_hoe", () -> new IcyToolsHoeItem());
	public static final RegistryObject<Item> CANDY_ORES_DUST = REGISTRY.register("candy_ores_dust", () -> new Candy_OresDustItem());
	public static final RegistryObject<Item> CANDY_ORES_ORE = block(TheWonderlandModBlocks.CANDY_ORES_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CANDY_ORES_BLOCK = block(TheWonderlandModBlocks.CANDY_ORES_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DEMONIC_ESSENCE = REGISTRY.register("demonic_essence", () -> new DemonicEssenceItem());
	public static final RegistryObject<Item> ENCHANTED_DEMONIC_ESSENCE = REGISTRY.register("enchanted_demonic_essence",
			() -> new EnchantedDemonicEssenceItem());
	public static final RegistryObject<Item> DEMONIC_CIRCLE = block(TheWonderlandModBlocks.DEMONIC_CIRCLE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DEMONIC_BLOCK = block(TheWonderlandModBlocks.DEMONIC_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DEMONIC_ENCHANT_TABLE = block(TheWonderlandModBlocks.DEMONIC_ENCHANT_TABLE,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DEMONIC_CIRCLEE = block(TheWonderlandModBlocks.DEMONIC_CIRCLEE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> A = block(TheWonderlandModBlocks.A, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CANDY_ARMOR_ARMOR_HELMET = REGISTRY.register("candy_armor_armor_helmet",
			() -> new Candy_ArmorArmorItem.Helmet());
	public static final RegistryObject<Item> CANDY_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("candy_armor_armor_chestplate",
			() -> new Candy_ArmorArmorItem.Chestplate());
	public static final RegistryObject<Item> CANDY_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("candy_armor_armor_leggings",
			() -> new Candy_ArmorArmorItem.Leggings());
	public static final RegistryObject<Item> CANDY_ARMOR_ARMOR_BOOTS = REGISTRY.register("candy_armor_armor_boots",
			() -> new Candy_ArmorArmorItem.Boots());
	public static final RegistryObject<Item> S = block(TheWonderlandModBlocks.S, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> D = block(TheWonderlandModBlocks.D, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> F = block(TheWonderlandModBlocks.F, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> G = block(TheWonderlandModBlocks.G, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> H = block(TheWonderlandModBlocks.H, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> LV_1_DEMON_SWORD = REGISTRY.register("lv_1_demon_sword", () -> new Lv1DemonSwordItem());
	public static final RegistryObject<Item> J = block(TheWonderlandModBlocks.J, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> K = block(TheWonderlandModBlocks.K, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> L = block(TheWonderlandModBlocks.L, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> M = block(TheWonderlandModBlocks.M, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> N = block(TheWonderlandModBlocks.N, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> O = block(TheWonderlandModBlocks.O, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> P = block(TheWonderlandModBlocks.P, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> R = block(TheWonderlandModBlocks.R, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> I = block(TheWonderlandModBlocks.I, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> Z = block(TheWonderlandModBlocks.Z, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> X = block(TheWonderlandModBlocks.X, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> C = block(TheWonderlandModBlocks.C, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> V = block(TheWonderlandModBlocks.V, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> W = block(TheWonderlandModBlocks.W, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> E = block(TheWonderlandModBlocks.E, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> T = block(TheWonderlandModBlocks.T, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> Y = block(TheWonderlandModBlocks.Y, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> U = block(TheWonderlandModBlocks.U, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PIRATE_CUTLASS = REGISTRY.register("pirate_cutlass", () -> new PirateCutlassItem());
	public static final RegistryObject<Item> HEX_BALL = REGISTRY.register("hex_ball", () -> new HexBallItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
