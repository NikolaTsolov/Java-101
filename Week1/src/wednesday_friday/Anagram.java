package wednesday_friday;

public class Anagram  {

	public static String spliter(String input) {
		String[] arr = input.split(" ");
		StringBuilder temp = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			temp.append(arr[i]);
		}

		return temp.toString();
	}
	
	public static boolean isAnagram(String str_a, String str_b) {
		int i = 0;
		StringBuilder firstSentance = new StringBuilder();
		StringBuilder secondSentance = new StringBuilder();
		firstSentance.append(str_a);
		secondSentance.append(str_b);
		
		while (firstSentance.length() != 0 && i < secondSentance.length()) {
			if (firstSentance.toString().charAt(0) == secondSentance.toString().charAt(i)) {
				firstSentance.deleteCharAt(0);
				secondSentance.deleteCharAt(i);
				i = -1;
			}
			
			i++;
		}

		if(firstSentance.length() == 0) {
			return true;
		}
		
		return false;
	}



	public static boolean anagram(String A, String B) {
		
		String firstSentance = spliter(A.toLowerCase());
		String secondSentance = spliter(B.toLowerCase());
		
		if (firstSentance.length() != secondSentance.length()) {
			return false;
		}
		
		return isAnagram(firstSentance, secondSentance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(anagram("William Shakespeare", "I am a weakish speller"));
	}

}
