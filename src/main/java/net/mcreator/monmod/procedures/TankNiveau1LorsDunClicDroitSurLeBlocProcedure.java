package net.mcreator.monmod.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.Entity;
import net.minecraft.block.BlockState;

import net.mcreator.monmod.block.TankNiveau2Block;
import net.mcreator.monmod.block.TankBlock;
import net.mcreator.monmod.MonModMod;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

public class TankNiveau1LorsDunClicDroitSurLeBlocProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MonModMod.LOGGER.warn("Failed to load dependency world for procedure TankNiveau1LorsDunClicDroitSurLeBloc!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MonModMod.LOGGER.warn("Failed to load dependency x for procedure TankNiveau1LorsDunClicDroitSurLeBloc!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MonModMod.LOGGER.warn("Failed to load dependency y for procedure TankNiveau1LorsDunClicDroitSurLeBloc!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MonModMod.LOGGER.warn("Failed to load dependency z for procedure TankNiveau1LorsDunClicDroitSurLeBloc!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MonModMod.LOGGER.warn("Failed to load dependency entity for procedure TankNiveau1LorsDunClicDroitSurLeBloc!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (DetectWaterBucketProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			RemoveWaterBucketProcedure.executeProcedure(Stream
					.of(new AbstractMap.SimpleEntry<>("entity", entity), new AbstractMap.SimpleEntry<>("x", x), new AbstractMap.SimpleEntry<>("y", y),
							new AbstractMap.SimpleEntry<>("z", z))
					.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				BlockState _bs = TankNiveau2Block.block.getDefaultState();
				world.setBlockState(_bp, _bs, 3);
			}
		} else if (DetectBucketProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			AddWaterBucketProcedure.executeProcedure(Stream
					.of(new AbstractMap.SimpleEntry<>("entity", entity), new AbstractMap.SimpleEntry<>("x", x), new AbstractMap.SimpleEntry<>("y", y),
							new AbstractMap.SimpleEntry<>("z", z))
					.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				BlockState _bs = TankBlock.block.getDefaultState();
				world.setBlockState(_bp, _bs, 3);
			}
		}
	}
}
