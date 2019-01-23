package eire.mccloskey.callum.mysticgens.api.core;

import java.util.List;

public interface Level {
	String getId();

	int toInt();

	int getSpeed();

	int getExpCost();

	double getEcoCost();

	List<GeneratorItem> getItems();

	void setSpeed(int speed);

	void setExpCost(int expCost);

	void setEcoCost(double ecoCost);

	void setItems(List<GeneratorItem> items);
}
