
package net.mcreator.monmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.monmod.block.PierreAncienneBlock;
import net.mcreator.monmod.MonModModElements;

@MonModModElements.ModElement.Tag
public class Pack_Pierre_AncienneSwordItem extends MonModModElements.ModElement {
	@ObjectHolder("mon_mod:pack_pierre_ancienne_sword")
	public static final Item block = null;

	public Pack_Pierre_AncienneSwordItem(MonModModElements instance) {
		super(instance, 50);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 131;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 5;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PierreAncienneBlock.block));
			}
		}, 3, 4f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("pack_pierre_ancienne_sword"));
	}
}
