
package net.mcreator.monmod.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.monmod.itemgroup.BlockDinosaureItemGroup;
import net.mcreator.monmod.MonModModElements;

import java.util.List;
import java.util.Collections;

@MonModModElements.ModElement.Tag
public class DalleenPierretailleeenRocheAncienneBlock extends MonModModElements.ModElement {
	@ObjectHolder("mon_mod:dalleen_pierretailleeen_roche_ancienne")
	public static final Block block = null;

	public DalleenPierretailleeenRocheAncienneBlock(MonModModElements instance) {
		super(instance, 34);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(BlockDinosaureItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends SlabBlock {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0).harvestLevel(1)
					.harvestTool(ToolType.PICKAXE).setRequiresTool());
			setRegistryName("dalleen_pierretailleeen_roche_ancienne");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(DalleenPierretailleeenRocheAncienneBlock.block));
		}
	}
}
