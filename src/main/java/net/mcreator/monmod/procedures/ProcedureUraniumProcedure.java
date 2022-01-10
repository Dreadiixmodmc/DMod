package net.mcreator.monmod.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.monmod.item.UraniumItem;
import net.mcreator.monmod.MonModMod;

import java.util.Map;

public class ProcedureUraniumProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MonModMod.LOGGER.warn("Failed to load dependency entity for procedure ProcedureUranium!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(UraniumItem.block)) : false) {
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).attackEntityFrom(new DamageSource("custom").setDamageBypassesArmor(), (float) 1);
			}
		}
	}
}
