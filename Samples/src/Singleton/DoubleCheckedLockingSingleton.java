/**
 * @author Chanaiah
 *
 * 
 */
package Singleton;

/**
 * @author Chanaiah
 *
 * modified by @author Chanaiah last on 2019-10-22 12:16:16.492
 */
public class DoubleCheckedLockingSingleton {
	private static DoubleCheckedLockingSingleton instance;
	private DoubleCheckedLockingSingleton(){}
	public static DoubleCheckedLockingSingleton getInstanceUsingDoubleLocking(){
	    if(instance == null){
	        synchronized (DoubleCheckedLockingSingleton.class) {
	            if(instance == null){
	                instance = new DoubleCheckedLockingSingleton();
	            }
	        }
	    }
	    return instance;
	}

}
