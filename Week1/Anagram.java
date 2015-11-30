package week_1;

public class Anagram  {
	
	public static String toLowLetters(String input) {
		StringBuilder new_str = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {

			if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
				char num = (char) (input.charAt(i) + 32);
				new_str.append(num + "");

			} else {
				new_str.append(input.charAt(i));
			}
		}

		return new_str.toString();
	}

	public static String spliter(String input) {
		String[] arr = input.split(" ");
		StringBuilder temp = new StringBuilder();

		for (int i = 0; i < arr.length; i++) {
			temp.append(arr[i]);
		}

		return temp.toString();
	}
	
	public static boolean isAnagram(StringBuilder str_a, StringBuilder str_b) {
		int i = 0;
		
		while (str_a.length() != 0 && i < str_b.length()) {
			if (str_a.toString().charAt(0) == str_b.toString().charAt(i)) {
				str_a.deleteCharAt(0);
				str_b.deleteCharAt(i);
				i = -1;
			}
			
			i++;
		}

		if(str_a.length() == 0) {
			return true;
		}
		
		return false;
	}



	public static boolean anagram(String A, String B) {
		StringBuilder str_a = new StringBuilder();
		StringBuilder str_b = new StringBuilder();
		
		str_a.append(spliter(toLowLetters(A)));
		str_b.append(spliter(toLowLetters(B)));
		
		if (str_a.length() != str_b.length()) {
			return false;
		}
		
		return isAnagram(str_a, str_b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(anagram("William Shakespeare", "I am a weakish speller"));
	}

}
