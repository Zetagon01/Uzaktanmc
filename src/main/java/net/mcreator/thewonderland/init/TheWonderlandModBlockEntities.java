
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thewonderland.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.thewonderland.block.entity.DemonicEnchantTableBlockEntity;
import net.mcreator.thewonderland.TheWonderlandMod;

public class TheWonderlandModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES,
			TheWonderlandMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> DEMONIC_ENCHANT_TABLE = register("demonic_enchant_table",
			TheWonderlandModBlocks.DEMONIC_ENCHANT_TABLE, DemonicEnchantTableBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
