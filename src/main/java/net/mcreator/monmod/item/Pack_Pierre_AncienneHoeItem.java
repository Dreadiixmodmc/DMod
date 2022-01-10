
package net.mcreator.monmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.monmod.block.PierreAncienneBlock;
import net.mcreator.monmod.MonModModElements;

@MonModModElements.ModElement.Tag
public class Pack_Pierre_AncienneHoeItem extends MonModModElements.ModElement {
	@ObjectHolder("mon_mod:pack_pierre_ancienne_hoe")
	public static final Item block = null;

	public Pack_Pierre_AncienneHoeItem(MonModModElements instance) {
		super(instance, 49);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 131;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return -1f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PierreAncienneBlock.block));
			}
		}, 0, -2f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("pack_pierre_ancienne_hoe"));
	}
}
