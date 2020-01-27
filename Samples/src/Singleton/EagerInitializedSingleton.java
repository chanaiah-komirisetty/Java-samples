/**
 * @author Chanaiah
 *
 * 
 */
package Singleton;

/**
 * @author Chanaiah
 *
 *         modified by @author Chanaiah last on 2019-10-22 11:58:07.463
 */
public class EagerInitializedSingleton {
	private static EagerInitializedSingleton instance = new EagerInitializedSingleton();

	// private constructor to avoid client applications to use constructor
	private EagerInitializedSingleton() {
	}

	public static EagerInitializedSingleton getInstance() {
		return instance;
	}

}
