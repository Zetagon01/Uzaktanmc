
package net.mcreator.thewonderland.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.thewonderland.init.TheWonderlandModFluids;

public class ChocolateBlock extends LiquidBlock {
	public ChocolateBlock() {
		super(() -> (FlowingFluid) TheWonderlandModFluids.CHOCOLATE.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
	}
}
