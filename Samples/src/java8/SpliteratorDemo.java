/**
 * @author Chanaiah
 *
 * 
 */
package java8;

/**
 * @author Chanaiah
 *
 * modified by @author Chanaiah last on 2019-12-05 16:31:45.149
 */
//Java program to demonstrate 
//methods of Spliterator 

import java.util.ArrayList;
import java.util.Spliterator; 
	
public class SpliteratorDemo 
{ 
	public static void main(String[] args) 
	{ 
		// Create an array list for doubles. 
		ArrayList<Integer> al = new ArrayList<>(); 
			
		// Add values to the array list. 
		al.add(1); 
		al.add(2); 
		al.add(-3); 
		al.add(-4); 
		al.add(5); 
			
		Spliterator<Integer> ll=al.stream().spliterator();
		
			
	} 
} 
