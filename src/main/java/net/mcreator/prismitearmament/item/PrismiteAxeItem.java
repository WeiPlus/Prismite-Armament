
package net.mcreator.prismitearmament.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.prismitearmament.init.PrismiteArmamentModItems;

public class PrismiteAxeItem extends AxeItem {
	public PrismiteAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1561;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 8.5f;
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
		}, 1, -3f, new Item.Properties());
	}
}
