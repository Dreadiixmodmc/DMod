
package net.mcreator.monmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.monmod.item.AllosaurusCraneItem;
import net.mcreator.monmod.MonModModElements;

@MonModModElements.ModElement.Tag
public class ItemDinosaureItemGroup extends MonModModElements.ModElement {
	public ItemDinosaureItemGroup(MonModModElements instance) {
		super(instance, 232);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabitem_dinosaure") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(AllosaurusCraneItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
