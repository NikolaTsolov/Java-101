package week_1;

public class IsPalindrome extends ReverseMe {

	public static boolean isPalindrome(String argument) {
		return argument.equals(reverseMe(argument));
	}

	public static boolean isPalindrome(int argument) {

		// Palindroma moge da se obhogda ot liavo i ot diasno ednovremmenno s
		// cikul i da sravniava simvolite, sled koeto sled pulno obhogdane da
		// dade true ili false;
		
		String arg = "" + argument;
		return isPalindrome(arg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("abba"));
		System.out.println(isPalindrome("abbabbc"));
		System.out.println(isPalindrome("123321"));
		System.out.println(isPalindrome("345123"));

	}

}
