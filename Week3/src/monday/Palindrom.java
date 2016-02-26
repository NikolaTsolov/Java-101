package monday;

public class Palindrom<T> {

	public static String reverseMe(String argument) {
		StringBuilder rev = new StringBuilder();
		rev.append(argument);
		return rev.reverse().toString();
	}

	public static <T> boolean isPalindrome(T argument) {
		String arg = "" + argument;
		return arg.equals(reverseMe(arg));
	}

	public static void main(String[] args) {
		System.out.println(Palindrom.isPalindrome(33.33));

	}

}
