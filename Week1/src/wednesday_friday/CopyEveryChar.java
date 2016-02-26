package wednesday_friday;

public class CopyEveryChar {
	
	public static String copyEveryChar(String input, int k) {
		StringBuilder resault = new StringBuilder();
		
		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < k; j++) {
				resault.append(input.charAt(i));
			}
		}
		
		return resault.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(copyEveryChar("king", 4));

	}

}
