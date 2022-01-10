package net.mcreator.monmod.procedures;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.monmod.MonModMod;

import java.util.Map;

public class DetectBucketProcedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MonModMod.LOGGER.warn("Failed to load dependency entity for procedure DetectBucket!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		return ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == Items.BUCKET
				|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY).getItem() == Items.BUCKET;
	}
}
