
package net.mcreator.monmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.monmod.itemgroup.MineraisModItemGroup;
import net.mcreator.monmod.MonModModElements;

@MonModModElements.ModElement.Tag
public class NickelPulveriseItem extends MonModModElements.ModElement {
	@ObjectHolder("mon_mod:nickel_pulverise")
	public static final Item block = null;

	public NickelPulveriseItem(MonModModElements instance) {
		super(instance, 271);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MineraisModItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("nickel_pulverise");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
