
package net.mcreator.nec.item;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class EldiscoItem extends RecordItem {
	public EldiscoItem() {
		super(1, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("nec:eldisco")), new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.EPIC), 2620);
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 1.5f;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
