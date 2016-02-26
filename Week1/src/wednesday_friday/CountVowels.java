package wednesday_friday;

public class CountVowels {
	
	public static String VOWELS = "aeiouyAEIOUY";
	
	public static int countVowels(String str) {
		int count = 0;
		CountOccurrence occourance = new CountOccurrence();
		
		for (int i = 0; i < VOWELS.length(); i++) {
			count += occourance.countOccurrences(VOWELS.charAt(i)+"", str);
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countVowels("Java"));
		System.out.println(countVowels("Theistareykjarbunga"));
		System.out.println(countVowels("grrrrgh"));
		System.out.println(
				countVowels("Github is the second best thing that happend to programmers, after the keyboard!"));
		System.out.println(countVowels("A nice day to code!"));
	}

}
