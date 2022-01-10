
package net.mcreator.monmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.monmod.MonModModElements;

@MonModModElements.ModElement.Tag
public class AnkylosaureViandeItem extends MonModModElements.ModElement {
	@ObjectHolder("mon_mod:ankylosaure_viande")
	public static final Item block = null;

	public AnkylosaureViandeItem(MonModModElements instance) {
		super(instance, 249);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(3).saturation(0.3f)

							.build()));
			setRegistryName("ankylosaure_viande");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
