
package net.mcreator.prismitearmament.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PrismiteIngotItem extends Item {
	public PrismiteIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
