package eire.mccloskey.callum.mysticgens.api.events;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

import eire.mccloskey.callum.mysticgens.api.core.Generator;

public class GeneratorBreakEvent extends PlayerEvent {

	private static final HandlerList handlers = new HandlerList();
	private final Generator generator;
	private final Location location;
	
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

	public GeneratorBreakEvent(Player player, Generator generator) {
		super(player);
		
		this.generator = generator;
		this.location = generator.getLocation();
	}
	
	public Generator getGenerator() {
		return generator;
	}
	
	public Location getLocation() {
		return location;
	}
}
