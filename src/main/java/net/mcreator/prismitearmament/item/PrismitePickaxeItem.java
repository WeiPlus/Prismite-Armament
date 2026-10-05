
package net.mcreator.prismitearmament.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.prismitearmament.init.PrismiteArmamentModItems;

public class PrismitePickaxeItem extends PickaxeItem {
	public PrismitePickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1561;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 3.5f;
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
		}, 1, -2.4f, new Item.Properties());
	}
}
