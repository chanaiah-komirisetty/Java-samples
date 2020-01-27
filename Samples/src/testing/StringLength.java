/**
 * @author Chanaiah
 *
 * 
 */
package testing;

/**
 * @author Chanaiah
 *
 * modified by @author Chanaiah last on 2019-10-28 11:45:56.231
 */
public class StringLength
{
    static int i,c,res;
    
    static int length(String s)
    {
        try
        {
            for(i=0,c=0;i>=0;i++,c++)
            s.charAt(i);
        }
        catch(Exception e)
        //Array index out of bounds and array index out of range are different exceptions
        {
            System.out.print("length is ");
            // we can not put return  statement in catch
        }
        return c;
    }
    
    public static void main (String args[])
    {
        
        System.out.println("Original String is : ");
        System.out.println("Alive is awesome ");
        res=StringLength.length("Alive is awesome ");
        System.out.println( res);
    }
}
