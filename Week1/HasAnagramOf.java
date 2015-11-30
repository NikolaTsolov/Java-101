package week_1;

public class HasAnagramOf extends Anagram{
	

	
	public static boolean hasAnagramOF(String A, String B) {
		StringBuilder str_a = new StringBuilder();
		StringBuilder str_b = new StringBuilder();
		
		str_a.append(spliter(toLowLetters(A)));
		str_b.append(spliter(toLowLetters(B)));
		
		if (str_a.length() > str_b.length()) {
			return false;
		}
		
		return isAnagram(str_a, str_b);
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hasAnagramOF("IWilliam Shakespeare", "II am a weakish speller"));
	}

}
