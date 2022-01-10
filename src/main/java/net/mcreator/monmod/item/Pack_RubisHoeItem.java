
package net.mcreator.monmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.monmod.MonModModElements;

@MonModModElements.ModElement.Tag
public class Pack_RubisHoeItem extends MonModModElements.ModElement {
	@ObjectHolder("mon_mod:pack_rubis_hoe")
	public static final Item block = null;

	public Pack_RubisHoeItem(MonModModElements instance) {
		super(instance, 302);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 4000;
			}

			public float getEfficiency() {
				return 16f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 8;
			}

			public int getEnchantability() {
				return 40;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RubisItem.block));
			}
		}, 0, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("pack_rubis_hoe"));
	}
}
