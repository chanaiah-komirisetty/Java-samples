import java.util.Hashtable;

/**
 * @author Chanaiah
 *
 * 
 */

/**
 * @author Chanaiah
 *
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("azamtv\'var");
		int a=10&10;
		System.out.println(a);
		
		Hashtable<Integer,String> map=new Hashtable<Integer,String>();          
	     map.put(100,"Amit");    
	     map.put(102,"Ravi");   
	     map.put(101,"Vijay");    
	     map.put(103,"Rahul");    
	     System.out.println("Initial Map: "+map);  
	     //Inserts, as the specified pair is unique  
	     map.putIfAbsent(104,"Gaurav");  
	     System.out.println("Updated Map: "+map);  
	     //Returns the current value, as the specified pair already exist  
	     map.putIfAbsent(101,"Vijay");  
	     System.out.println("Updated Map: "+map);  
	}
	

}
