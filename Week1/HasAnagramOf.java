package wednesday_friday;

public class HasAnagramOf extends Anagram{
	

	
	public static boolean hasAnagramOF(String A, String B) {		
		String firstSentance = spliter(A.toLowerCase());
		String secondSentance = spliter(B.toLowerCase());
		
		if (firstSentance.length() > secondSentance.length()) {
			return false;
		}
		
		return isAnagram(firstSentance, secondSentance);
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hasAnagramOF("IWilliam Shakespeare", "II am a weakish speller"));
	}

}
