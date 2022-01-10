
package net.mcreator.monmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.monmod.item.RubisItem;
import net.mcreator.monmod.MonModModElements;

@MonModModElements.ModElement.Tag
public class MineraisModItemGroup extends MonModModElements.ModElement {
	public MineraisModItemGroup(MonModModElements instance) {
		super(instance, 230);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabminerais_mod") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RubisItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
