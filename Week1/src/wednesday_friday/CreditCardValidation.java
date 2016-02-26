package wednesday_friday;

public class CreditCardValidation {

	public static boolean isCreditCardValid(String number) {
		String onlyNum = number.replaceAll("[a-z]|[A-Z]", "");
		if(onlyNum.length() != number.length()) {
			return false;
		}
		
		if (number.length() % 2 == 0) {
			return false;
		}

		int sum = 0;
		for (int i = number.length() - 1; i >= 0; i--) {
			if (i % 2 != 0) {
				sum += 2 * Integer.parseInt(number.charAt(i) + "");
			} else {
				sum += Integer.parseInt(number.charAt(i) + "");
			}
		}
		return sum % 10 == 0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isCreditCardValid("79927398715"));
		System.out.println(isCreditCardValid("79927398713"));
		System.out.println(isCreditCardValid("799z273a98713"));

	}

}
