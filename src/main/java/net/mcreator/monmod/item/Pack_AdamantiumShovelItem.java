
package net.mcreator.monmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.monmod.MonModModElements;

@MonModModElements.ModElement.Tag
public class Pack_AdamantiumShovelItem extends MonModModElements.ModElement {
	@ObjectHolder("mon_mod:pack_adamantium_shovel")
	public static final Item block = null;

	public Pack_AdamantiumShovelItem(MonModModElements instance) {
		super(instance, 188);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 1550;
			}

			public float getEfficiency() {
				return 8f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 10;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(AdamantiumItem.block));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("pack_adamantium_shovel"));
	}
}
