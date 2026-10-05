
package net.mcreator.prismitearmament.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.prismitearmament.init.PrismiteArmamentModItems;

public class PrismiteHoeItem extends HoeItem {
	public PrismiteHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 1561;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PrismiteArmamentModItems.PRISMITE_INGOT.get()));
			}
		}, 0, -1f, new Item.Properties());
	}
}
