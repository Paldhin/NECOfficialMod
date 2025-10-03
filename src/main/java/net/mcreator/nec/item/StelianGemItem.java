
package net.mcreator.nec.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class StelianGemItem extends Item {
	public StelianGemItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
