/**
 * @author Chanaiah
 *
 * 
 */
package testing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Chanaiah
 *
 * modified by @author Chanaiah last on 2019-11-18 16:06:29.407
 */
public class SwapTwoNumbers {
	public static void main(String[] args) {
		
			        // TODO Auto-generated method stub
		
			        int x, y, temp;
		
			        System.out.println("Enter x and y");
		
			        Scanner in = new Scanner(System.in);
		
			        x = in.nextInt();
		
			        y = in.nextInt();
		
			        System.out.println("Before Swapping" + x + y);
		
			        //temp = x;
		
			       // x = y;
		
			        //y = temp;
		
			       // System.out.println("After Swapping" + x + y);
		
			                    x = x + y;//4+5=9
			        
			        	      y = x - y;//9-5=4
			       
			        	      x = x - y;//9-4=5
			        
			        	  
			        
			        	      System.out.println("After Swapping without third variable\nx = "+x+"\ny = "+y);
			        	      
			        	      Map<String,String> map=new HashMap<String,String>();
			        	      
			        	      String str = new String("Sakkett");
			        	      
			        	      	                  int count = 0;
			        	      
			        	      	                  char[] chars = str.toCharArray();
			        	      
			        	      	                  System.out.println("Duplicate characters are:");
			        	      
			        	      	                  for (int i=0; i<str.length();i++) {
			        	      
			        	      	                              for(int j=i+1; j<str.length();j++) {
			        	      
			        	      	                                         if (chars[i] == chars[j]) {
			        	      
			        	      	                                                    System.out.println(chars[j]);
			        	      
			        	      	                                                    count++;
			        	      
			        	      	                                                    break;
			        	      
			        	      	                                          }
			        	      
			        	      	                               }
			        	      
			        	      	                   }
			        	      
			        	      	           }
			        	      
		
			    

}
