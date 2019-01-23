package eire.mccloskey.callum.mysticgens.api.managers;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import eire.mccloskey.callum.mysticgens.api.core.GeneratorItem;
import eire.mccloskey.callum.mysticgens.api.core.Level;

public interface LevelManager {

	void addLevel(String id, int level, int speed, int costExp, double costEco, GeneratorItem... items);

	void addLevel(Level level);

	void deleteLevel(Level level);

	Level getLevel(String id, int level);

	Level getMinimumLevel(String id);

	Level getMaxLevel(String id);

	boolean isLevel(String id, int level);

	boolean isMinimumLevel(String id, int level);

	boolean isMaximumLevel(String id, int level);

	boolean hasLevels(String id);

	Map<String, List<Entry<Integer, Level>>> getLevelMap();

	List<Entry<Integer, Level>> getLevels(String id);

	void clear(String id);

	void clear();
}
