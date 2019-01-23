package eire.mccloskey.callum.mysticgens.api.managers;

import java.util.Map;

import org.bukkit.Location;
import org.bukkit.block.Block;

import eire.mccloskey.callum.mysticgens.api.core.Generator;

public interface GeneratorManager {

	void addGenerator(Location location, Generator Generator);

    Generator removeGenerator(Location location);

    Generator getGenerator(Location location);

    Generator getGenerator(Block block);

    Map<Location, Generator> getGenerators();
}
