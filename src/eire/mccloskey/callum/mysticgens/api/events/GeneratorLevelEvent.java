package eire.mccloskey.callum.mysticgens.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

import eire.mccloskey.callum.mysticgens.api.core.CostType;
import eire.mccloskey.callum.mysticgens.api.core.Generator;

public class GeneratorLevelEvent extends PlayerEvent {
	
	private static final HandlerList handlers = new HandlerList();
	
	private final Generator generator;
	private final CostType costType;
	private final int level, nextLevel;
	private final int expCost;
	private final double ecoCost;
	
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

	public GeneratorLevelEvent(Player player, Generator generator, CostType costType) {
		super(player);
		
		this.generator = generator;
		this.costType = costType;
		this.level = generator.getLevel().toInt();
		this.nextLevel = level + 1;
		this.expCost = generator.getLevel().getExpCost();
		this.ecoCost = generator.getLevel().getEcoCost();
	}
	
	public Generator getGenerator() {
		return generator;
	}
	
	public int getLevel() {
		return level;
	}
	
	public int getNextLevel() {
		return nextLevel;
	}
	
	public int getExpCost() {
		return expCost;
	}
	
	public double getEcoCost() {
		return ecoCost;
	}
	
	public CostType getCostType() {
		return costType;
	}
}
