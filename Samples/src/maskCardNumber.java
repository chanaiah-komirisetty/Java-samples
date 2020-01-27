import java.util.Arrays;

public class maskCardNumber {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("100001111111111111111");
		int idx = str.length() - 8;

		while (idx > 0) {
			str.insert(idx, "-");
			idx = idx - 8;
		}

		System.out.println(str.toString());
	}

	public static String maskCardNumber(String cardNumber, String mask) {

		// format the number
		int index = 0;
		StringBuilder maskedNumber = new StringBuilder();
		for (int i = 0; i < mask.length(); i++) {
			char c = mask.charAt(i);
			if (c == '#') {
				maskedNumber.append(cardNumber.charAt(index));
				index++;
			} else if (c == 'x') {
				maskedNumber.append(c);
				index++;
			} else {
				maskedNumber.append(c);
			}
		}

		// return the masked number
		return maskedNumber.toString();
	}
}
