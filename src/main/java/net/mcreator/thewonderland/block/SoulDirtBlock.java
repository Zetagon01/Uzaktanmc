
package net.mcreator.thewonderland.block;

import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.BiomeColors;

import net.mcreator.thewonderland.init.TheWonderlandModBlocks;

import java.util.List;
import java.util.Collections;

public class SoulDirtBlock extends Block {
	public SoulDirtBlock() {
		super(BlockBehaviour.Properties.of(Material.GRASS).sound(new ForgeSoundType(1.0f, 1.0f,
				() -> new SoundEvent(new ResourceLocation("block.soul_sand.break")), () -> new SoundEvent(new ResourceLocation("block.grass.step")),
				() -> new SoundEvent(new ResourceLocation("block.soul_sand.place")), () -> new SoundEvent(new ResourceLocation("block.grass.fall")),
				() -> new SoundEvent(new ResourceLocation("block.grass.fall")))).strength(0.6000000000000001f, 6f));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(TheWonderlandModBlocks.SOUL_GRASS.get(), renderType -> renderType == RenderType.cutoutMipped());
	}

	@OnlyIn(Dist.CLIENT)
	public static void blockColorLoad(ColorHandlerEvent.Block event) {
		event.getBlockColors().register((bs, world, pos, index) -> {
			return world != null && pos != null ? BiomeColors.getAverageGrassColor(world, pos) : GrassColor.get(0.5D, 1.0D);
		}, TheWonderlandModBlocks.SOUL_GRASS.get());
	}

	@OnlyIn(Dist.CLIENT)
	public static void itemColorLoad(ColorHandlerEvent.Item event) {
		event.getItemColors().register((stack, index) -> {
			return GrassColor.get(0.5D, 1.0D);
		}, TheWonderlandModBlocks.SOUL_GRASS.get());
	}
}
