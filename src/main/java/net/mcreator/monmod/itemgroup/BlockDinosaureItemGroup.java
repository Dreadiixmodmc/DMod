
package net.mcreator.monmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.monmod.block.RocheancienneBlock;
import net.mcreator.monmod.MonModModElements;

@MonModModElements.ModElement.Tag
public class BlockDinosaureItemGroup extends MonModModElements.ModElement {
	public BlockDinosaureItemGroup(MonModModElements instance) {
		super(instance, 52);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabblock_dinosaure") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RocheancienneBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
