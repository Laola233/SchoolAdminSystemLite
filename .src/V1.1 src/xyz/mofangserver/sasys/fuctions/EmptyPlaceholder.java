package xyz.mofangserver.sasys.fuctions;

public final class EmptyPlaceholder {
	public final void printPlaceholder(boolean isdefault) {
		for (int i = 0; i < 20; i++) {
			System.out.println();
		}
	}

	public final void printPlaceholder(int amount) {
		for (int i = 0; i < amount; i++) {
			System.out.println();
		}
	}

	/**
	 * @deprecated
	 * 
	 */
	public static String getVersion() {
		return "V0.0.1";
	}
}
