package wednesday_friday;

public class ReverseMe {
	
	public static String reverseMe(String argument) {
		StringBuilder rev = new StringBuilder();
		rev.append(argument);
		return rev.reverse().toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseMe("balkan"));
	}

}
