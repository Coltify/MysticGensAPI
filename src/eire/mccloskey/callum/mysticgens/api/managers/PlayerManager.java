package eire.mccloskey.callum.mysticgens.api.managers;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import eire.mccloskey.callum.mysticgens.api.core.Generator;

public interface PlayerManager {

	void setViewing(Player player, Generator generator);

	void setViewing(Player player, Generator generator, Inventory inventory);

	void closeAll();

	Entry<Generator, Inventory> stopViewing(Player player);

	Entry<Generator, Inventory> getViewing(Player player);

	List<Player> getViewing(Generator generator);

	List<Player> getViewing(Inventory inventory);

	boolean isViewing(Player player);

	boolean isViewing(Player player, Generator generator);

	boolean isViewing(Player player, Inventory inventory);

	Map<UUID, Entry<Generator, Inventory>> getViewing();
}
