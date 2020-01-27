/**
 * @author Chanaiah
 *
 * 
 */
package testing;

/**
 * @author Chanaiah
 *
 * modified by @author Chanaiah last on 2019-10-28 12:33:19.116
 */
import java.util.Scanner;

public class Permutation {
    
    
    
    public static void main (String args[])
    {
        System.out.println("Please enter the string whose permutations we need to show ");
        Scanner in = new Scanner(System.in);
        String original=in.nextLine();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Results are :");
        System.out.println("");
        System.out.println("");
        permute(original);
        int count=0;
        String s="alive is awesome";
        String[] arr=s.split(" ");
        for (int i = 0; i < arr.length; i++)
        {
        count++;
        }
        System.out.println(count);
        }
    
    
    
    
    
    public static   void permute( String input)
    {
        int inputLength = input.length();
        boolean[ ] used = new boolean[ inputLength ];
        StringBuffer outputString = new StringBuffer();
        char[ ] in = input.toCharArray( );
        doPermute ( in, outputString, used, inputLength, 0 );
        
    }
    
    public static    void doPermute ( char[ ] in, StringBuffer outputString,
    boolean[ ] used, int inputLength, int level)
    {
        if( level == inputLength) {
            System.out.println ( outputString.toString());
            return;
        }
        
        for( int i = 0; i < inputLength; ++i )
        {
            
            if( used[i] ) continue;
            
            outputString.append( in[i] );
            used[i] = true;
            doPermute( in,   outputString, used, inputLength, level + 1 );
            used[i] = false;
            outputString.setLength(   outputString.length() - 1 );
        }
    }
    
}