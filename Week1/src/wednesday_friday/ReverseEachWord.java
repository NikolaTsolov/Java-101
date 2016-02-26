package wednesday_friday;

public class ReverseEachWord extends ReverseMe {
	
	public static String reverseEveryChar(String arg) {
		String [] arr = arg.split("[!-/]|[:-@]|[' ']|['		']");
		StringBuilder resault = new StringBuilder();
		
		for (int i = 0; i < arr.length; i++) {
			resault.append(reverseMe(arr[i])+" ");			
		}
		return resault.toString();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseEveryChar("What	is this"));
	}

}
