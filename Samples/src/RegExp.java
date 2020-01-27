import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Chanaiah
 *
 * 
 */

/**
 * @author Chanaiah
 *
 * modified by @author Chanaiah last on 2019-12-13 12:42:47.864
 */
public class RegExp {
public static void main(String[] args) {
	//Mobile Reg exp.
	Pattern p=Pattern.compile("^[5-9][0-9]{9}$");
	Matcher m=p.matcher("1948809443");
	if(m.matches()) {
		System.out.println("matched");
	}else {
		System.out.println("not mached");
	}
	System.out.println("AB cd be".replaceAll("\\s", ""));
}
}
