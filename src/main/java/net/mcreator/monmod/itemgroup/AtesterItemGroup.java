
package net.mcreator.monmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.monmod.block.TankBlock;
import net.mcreator.monmod.MonModModElements;

@MonModModElements.ModElement.Tag
public class AtesterItemGroup extends MonModModElements.ModElement {
	public AtesterItemGroup(MonModModElements instance) {
		super(instance, 92);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabatester") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(TankBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
