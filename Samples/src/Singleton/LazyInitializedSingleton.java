/**
 * @author Chanaiah
 *
 * 
 */
package Singleton;

/**
 * @author Chanaiah
 *
 * modified by @author Chanaiah last on 2019-10-22 12:12:03.535
 */
public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;
    
    private LazyInitializedSingleton(){}
    
    public static LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
