package eire.mccloskey.callum.mysticgens.plugin;

import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import eire.mccloskey.callum.mysticgens.api.core.Generator;
import eire.mccloskey.callum.mysticgens.api.core.GeneratorItem;
import eire.mccloskey.callum.mysticgens.api.core.Level;
import eire.mccloskey.callum.mysticgens.api.managers.ConstructionManager;
import eire.mccloskey.callum.mysticgens.api.managers.GeneratorManager;
import eire.mccloskey.callum.mysticgens.api.managers.LevelManager;
import eire.mccloskey.callum.mysticgens.api.managers.PlayerManager;

public interface MysticGens {

	ItemStack createGeneratorItem(String id);
    ItemStack createGeneratorItem(String id, Level level);
	ItemStack createGeneratorItem(String id, int level);
    Level getGeneratorItemLevel(ItemStack item);
    String getGeneratorItemType(ItemStack item);
    boolean isGeneratorItem(ItemStack item);
    boolean isGeneratorType(String id);
    boolean isGeneratorTypeEnabled(String id);
    void setGeneratorTypeEnabled(String id, boolean enabled); 
    void addItem(String id, GeneratorItem item);
    int getGeneratorLimit(Player player);
	int getRemainingGeneratorLimit(Player player);
    Generator[] getGenerators(Player player);
    String[] getGeneratorTypes();
    Generator[] getGenerators(String id);
    List<GeneratorItem> getItems(String id);

    GeneratorManager getGeneratorManager();
    ConstructionManager getConstructionManager();
    LevelManager getLevelManager();
    PlayerManager getPlayerManager();
}
