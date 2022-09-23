
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thewonderland.init;

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
import net.mcreator.thewonderland.item.IcyItem;
import net.mcreator.thewonderland.item.ChocolateItem;
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
	public static final RegistryObject<Item> ICY_ORE = block(TheWonderlandModBlocks.ICY_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ICY_BLOCK = block(TheWonderlandModBlocks.ICY_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
