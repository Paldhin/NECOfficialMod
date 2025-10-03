
package net.mcreator.nec.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class NECItemItem extends Item {
	public NECItemItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.EPIC).food((new FoodProperties.Builder()).nutrition(20).saturationMod(0.3f).alwaysEat().build()));
	}

	@Override
	public int getEnchantmentValue() {
		return 100;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 100f;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public boolean isCorrectToolForDrops(BlockState state) {
		return true;
	}
}
