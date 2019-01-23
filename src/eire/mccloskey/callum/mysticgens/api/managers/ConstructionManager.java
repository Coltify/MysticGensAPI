package eire.mccloskey.callum.mysticgens.api.managers;

import java.util.Map;
import java.util.Map.Entry;

import org.bukkit.scheduler.BukkitTask;

import eire.mccloskey.callum.mysticgens.api.core.Generator;

public interface ConstructionManager {

	void startConstruction(Generator Generator);

	void stopConstruction(Generator generator);

	void cancelConstruction(Generator generator);

	boolean isConstructing(Generator generator);

	void load();

	void save();

	Integer getTimeRemaining(Generator generator);

	BukkitTask getTask(Generator generator);

	Map<Generator, Entry<BukkitTask, Integer>> getTimes();
}
