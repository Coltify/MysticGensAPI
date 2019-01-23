package eire.mccloskey.callum.mysticgens.api.core;

import org.bukkit.inventory.ItemStack;

public interface GeneratorItem {

	String getName();

	ItemStack toDisplayItem();

	ItemStack getItem();

	void setItem(ItemStack is);

	double getChance();

	void setChance(double chance);
}
