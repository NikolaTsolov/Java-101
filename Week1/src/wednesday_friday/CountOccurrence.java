package wednesday_friday;

public class CountOccurrence {

	public static int countOccurrences(String needle, String heystack) {
		int occurrance = 0;
		
		for (int i = 0; i < heystack.length(); i++) {
			int l = needle.length();
			boolean isInRange = (i + l - 1) < heystack.length();
			
			if(isInRange && needle.equals(heystack.substring(i, i+l))) {
				occurrance++;
			}
		}
		
		return occurrance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countOccurrences("daa", "daaadaadada"));
	}

}
