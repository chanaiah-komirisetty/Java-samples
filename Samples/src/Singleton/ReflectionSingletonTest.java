/**
 * @author Chanaiah
 *
 * 
 */
package Singleton;

/**
 * @author Chanaiah
 *
 * modified by @author Chanaiah last on 2019-10-22 12:23:23.268
 */
import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

    public static void main(String[] args) {
    	BillPughSingleton instanceOne = BillPughSingleton.getInstance();
    	BillPughSingleton instanceTwo = null;
        try {
            Constructor[] constructors = BillPughSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (BillPughSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }

}