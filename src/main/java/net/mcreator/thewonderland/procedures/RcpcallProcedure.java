package net.mcreator.thewonderland.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class RcpcallProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		RCPProcedure.execute(world, x, y, z);
	}
}
