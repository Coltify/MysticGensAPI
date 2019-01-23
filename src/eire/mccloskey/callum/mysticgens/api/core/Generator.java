package eire.mccloskey.callum.mysticgens.api.core;

import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import eire.mccloskey.callum.mysticgens.plugin.utils.RandomCollection;

public interface Generator {

	String getId();

	Inventory getInventory();

	UUID getOwner();

	Level getLevel();

	void setLevel(int level);

	void setLevel(Level level);

	ItemStack[] getContents();

	void setContents(ItemStack[] contents);

	Location getLocation();

	void setLocation(Location loc);

	RandomCollection<ItemStack> getItemPool();

	int getRemainingTime();
	
	int getConstructionTime();

	void view(Player player);

	void viewBlockPage(Player player, int page);

	void viewLevelPage(Player player, int page);

	void viewLevelItems(Player player, int level, int page);

	void upgrade(Player player, CostType type);

	void construct();
	
	void start();

	void stop();

	void restart();

	boolean isActive();
}
