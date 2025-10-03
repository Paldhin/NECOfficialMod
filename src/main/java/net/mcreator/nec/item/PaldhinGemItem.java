
package net.mcreator.nec.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PaldhinGemItem extends Item {
	public PaldhinGemItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
