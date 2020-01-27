/**
 * @author Chanaiah
 *
 * 
 */
package Singleton;

/**
 * @author Chanaiah
 *
 * modified by @author Chanaiah last on 2019-10-22 11:49:58.251
 */
public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;
    
    private StaticBlockSingleton(){}
    
    //static block initialization for exception handling
    static{
        try{
            instance = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    
    public static StaticBlockSingleton getInstance(){
        return instance;
    }
    public static void main(String[] args) {
    	StaticBlockSingleton ss=StaticBlockSingleton.getInstance();
    	System.out.println(ss.hashCode());
    	StaticBlockSingleton ss1=StaticBlockSingleton.getInstance();
    	System.out.println(ss1.hashCode());
	}
}