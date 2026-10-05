
package net.mcreator.prismitearmament.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.prismitearmament.init.PrismiteArmamentModItems;

public class PrismiteSwordItem extends SwordItem {
	public PrismiteSwordItem() {
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
		}, 3, -2.4f, new Item.Properties());
	}
}
