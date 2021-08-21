package icu.mofangserver.SchoolAdminSystemLite.fuctions;

/**
 * @author z_yu
 * @version 0.1
 * @serial SchoolAdminSystemLite
 * @since SchoolAdminSystemLite 0.7
 */

public final class EmptyPlaceholder {
	/**
	 * 
	 * @param isdefault
	 */
	public final void printPlaceholder(boolean isdefault) {
		for (int i = 0; i < 20; i++) {
			System.out.println();
		}
	}

	/**
	 * 
	 * @param amount
	 */
	public final void printPlaceholder(int amount) {
		for (int i = 0; i < amount; i++) {
			System.out.println();
		}
	}
}
