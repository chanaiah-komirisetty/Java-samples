import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinRexExp {
public static void main(String[] args) {
	//System.out.println("#######################"+validatePinNumberRegex1("1234"));
	//System.out.println("#######################"+isConsecutive("1234"));
	//System.out.println("#######################"+validateMobileNumberRegex1("1234"));
	System.out.println("#######################"+validatePinNumberRegex1("1243"));


}
public static boolean validatePinNumberRegex1(String mobileNo) {
	boolean isValid=true;
	//String regex ="^[1-9][0-9]{9}$";
	//String regex = "^(?:^(?:^(?:^(?:^0?1)?2)?3)4?)?5(?:$|6(?:$|7(?:$|8(?:$|90?))))$|^(0?1)?2(?:$|3(?:$|4))|^(6?7)?8(?:$|90?)$";
	//Pattern p = Pattern.compile(regex);
	//Matcher m = p.matcher(mobileNo);
	
	Pattern regex = Pattern.compile(
		    "\\b (?: (?: 0(?=1|\\b)|1(?=2|\\b)|2(?=3|\\b)|3(?=4|\\b)|4(?=5|\\b)|5(?=6|\\b)|6(?=7|\\b)| 7(?=8|\\b)|8(?=9|\\b)|9\\b)+|(?:9(?=8|\\b)|8(?=7|\\b)|7(?=6|\\b)| 6(?=5|\\b)|5(?=4|\\b)| 4(?=3|\\b)|3(?=2|\\b)| 2(?=1|\\b)|1(?=0|\\b)| 0\\b )+ )\\b", 
		    Pattern.COMMENTS);
		Matcher regexMatcher = regex.matcher(mobileNo);
		
	if (regexMatcher.matches())
	{
		isValid=true;
	}
	else{
		isValid=false;
	}
	return isValid;
}
public static boolean isConsecutive(final String pinCode)
{
  int [] digits = new int [pinCode.length()];
  int [] differences = new int [pinCode.length()-1];
  int temp = 0;

  for(int i = 0; i < pinCode.length(); i++)
      digits[i] = Integer.parseInt(String.valueOf(pinCode.charAt(i)));

  for(int i = 0; i < digits.length -1; i++)
      differences[i] = Math.abs(digits[i] - digits[i+1]);

  if(differences.length != 0) {
      temp = differences[0];
      for (int i = 1; i < differences.length; i++)
          if (temp != differences[i])
              return false;
  }

  return true;
}
public static boolean validateMobileNumberRegex1(String mobileNo) {
	boolean isValid=true;
	//String regex ="^[1-9][0-9]{9}$";
	String regex = "\\b(?:(?:0(?=1|\b)|1(?=2|\b)|2(?=3|\b)|3(?=4|\b)|4(?=5|\b)|5(?=6|\b)|6(?=7|\b)|7(?=8|\b)|8(?=9|\b)|9\b)+ |(?:9(?=8|\b)|8(?=7|\b)|7(?=6|\b)|6(?=5|\b)|5(?=4|\b)|4(?=3|\b)|3(?=2|\b)|2(?=1|\b)|1(?=0|\b)|0\b )+)\\b";
	Pattern p = Pattern.compile(regex, Pattern.COMMENTS);
	Matcher m = p.matcher(mobileNo);
	if (m.matches())
	{
		isValid=true;
	}
	else{
		isValid=false;
	}
	return isValid;
}
public static boolean validatePinNumberRegex(String mobileNo) {
	boolean isValid=true;
	Pattern regex = Pattern.compile(
		    "\\b                                                       \n" +
		    "(?:                                                       \n" +
		    " (?:                                                      \n" +
		    "  0(?=1|\\b)|                                             \n" +
		    "  1(?=2|\\b)|                                             \n" +
		    "  2(?=3|\\b)|                                             \n" +
		    "  3(?=4|\\b)|                                             \n" +
		    "  4(?=5|\\b)|                                             \n" +
		    "  5(?=6|\\b)|                                             \n" +
		    "  6(?=7|\\b)|                                             \n" +
		    "  7(?=8|\\b)|                                             \n" +
		    "  8(?=9|\\b)|                                             \n" +
		    "  9\\b         # or 9(?=0|\\b) if you want to allow 890123\n" +
		    " )+                                                       \n" +
		    " |                                                        \n" +
		    " (?:                                                      \n" +
		    "  9(?=8|\\b)|                                             \n" +
		    "  8(?=7|\\b)|                                             \n" +
		    "  7(?=6|\\b)|                                             \n" +
		    "  6(?=5|\\b)|                                             \n" +
		    "  5(?=4|\\b)|                                             \n" +
		    "  4(?=3|\\b)|                                             \n" +
		    "  3(?=2|\\b)|                                             \n" +
		    "  2(?=1|\\b)|                                             \n" +
		    "  1(?=0|\\b)|                                             \n" +
		    "  0\\b         # or 0(?=9|\\b) if you want to allow 321098\n" +
		    " )+                                                       \n" +
		    ")                                                         \n" +
		    "\\b", 
		    Pattern.COMMENTS);
		Matcher regexMatcher = regex.matcher(mobileNo);
		
	if (regexMatcher.matches())
	{
		isValid=true;
	}
	else{
		isValid=false;
	}
	return isValid;
}
public static boolean userNameValidation(String stringToMatch) {
    stringToMatch = stringToMatch.toLowerCase(); // To avoid the condition Aaaaaa and Abcdef and aBcDeF
    String regexRepeatedCheck = "^(.)\\1{5,}$";
    Pattern patternRepeated = Pattern.compile(regexRepeatedCheck);
    Matcher matcherRepeated = patternRepeated.matcher(stringToMatch);

    if (matcherRepeated.find()) {
        return true;
    } else if (check_ASCII_Sequence(stringToMatch)) {
        return true;
    }

    return false;
}

private static boolean check_ASCII_Sequence(String stringToMatch) {
    char[] splittedArray = stringToMatch.toCharArray();
    int initialValue = -1;
    int totalLength = 0;
    for (char c : splittedArray) {
        int ascii = (int) c;
        if (initialValue == -1) {
            initialValue = ascii;
        } else {
            initialValue = initialValue + 1;
        }

        if (ascii == initialValue) {
            totalLength = totalLength + 1;
        }
    }

    if (totalLength == splittedArray.length || stringToMatch.equalsIgnoreCase("1234567890")) {
        return true;
    }

    return false;
}
}
