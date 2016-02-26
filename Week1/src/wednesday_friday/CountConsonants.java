package wednesday_friday;

public class CountConsonants {

	public static String CONSONANTS = "bcdfghjklmnpqrstvwxzBCDFGHJKLMNPQRSTVWXZ";

	public static int countConsonants(String str) {
		int count = 0;
		CountOccurrence occourance = new CountOccurrence();

		for (int i = 0; i < CONSONANTS.length(); i++) {
			count += occourance.countOccurrences(CONSONANTS.charAt(i) + "", str);
		}

		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countConsonants("Java"));
		System.out.println(countConsonants("Theistareykjarbunga"));
		System.out.println(countConsonants("grrrrgh"));
		System.out.println(
				countConsonants("Github is the second best thing that happend to programmers, after the keyboard!"));
		System.out.println(countConsonants("A nice day to code!"));
	}

}
