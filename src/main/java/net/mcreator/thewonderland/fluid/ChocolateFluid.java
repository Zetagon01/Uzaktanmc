
package net.mcreator.thewonderland.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.thewonderland.init.TheWonderlandModItems;
import net.mcreator.thewonderland.init.TheWonderlandModFluids;
import net.mcreator.thewonderland.init.TheWonderlandModBlocks;

public abstract class ChocolateFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(TheWonderlandModFluids.CHOCOLATE,
			TheWonderlandModFluids.FLOWING_CHOCOLATE,
			FluidAttributes.builder(new ResourceLocation("the_wonderland:blocks/chocolate"), new ResourceLocation("the_wonderland:blocks/chocolate"))

					.viscosity(5000)

	).explosionResistance(100f)

			.tickRate(30)

			.bucket(TheWonderlandModItems.CHOCOLATE_BUCKET).block(() -> (LiquidBlock) TheWonderlandModBlocks.CHOCOLATE.get());

	private ChocolateFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.EXPLOSION;
	}

	public static class Source extends ChocolateFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends ChocolateFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
