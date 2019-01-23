package eire.mccloskey.callum.mysticgens.api;

import eire.mccloskey.callum.mysticgens.MysticGensPlugin;
import eire.mccloskey.callum.mysticgens.plugin.MysticGens;

public class MysticGensAPI {

	public static boolean isHooked() {
		return get() != null;
	}

	public static MysticGens get() {
		return MysticGensPlugin.get();
	}
}
