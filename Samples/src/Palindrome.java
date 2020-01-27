import java.util.Arrays;

/**
 * @author Chanaiah
 *
 * 
 */

/**
 * @author Chanaiah
 *
 * modified by @author Chanaiah last on 2019-12-13 10:35:06.159
 */
public class Palindrome {
	public static void main(String[] args) {
		String pal="radar";
		String rev="";
		char[] cArray=pal.toCharArray();
		for (int i =  pal.length()-1; i >= 0; i--) {
			rev=rev+cArray[i];
		}
		System.out.println(rev);
		if(pal.equals(rev)) {
			System.out.println("given string is pal");
		}else {
			System.out.println("given string is not pal.");
		}
		String str = "www.journaldev.com";
		System.out.println("Last 4 char String: " + str.subSequence(str.length() - 4, str.length()));
		System.out.println("First 4 char String: " + str.subSequence(0, 4));
		System.out.println("website name: " + str.subSequence(4, 14));
		System.out.println("website name: " + str.substring(4, 14));

		byte[] b=pal.getBytes();
		System.out.println(Arrays.toString(b))
	;
		byte[] byteArray = { 'P', 'A', 'N', 'K', 'A', 'J' };
		byte[] byteArray1 = { 80, 65, 78, 75, 65, 74 };

		String str1 = new String(b);

		System.out.println(str1);
		
	}
	public void foo(String s) {
		 System.out.println("String");
		 }

		 public void foo(StringBuffer sb){
		 System.out.println("StringBuffer");
		 }

}
