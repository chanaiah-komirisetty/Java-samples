/**
 * @author Chanaiah
 *
 * 
 */
package Singleton;

/**
 * @author Chanaiah
 *
 * modified by @author Chanaiah last on 2019-10-22 12:18:50.640
 */
public class BillPughSingleton {

    private BillPughSingleton(){}
    //inner class
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    
    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}