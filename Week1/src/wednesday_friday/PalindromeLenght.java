package wednesday_friday;

public class PalindromeLenght {

	public static int getPalindromeLenght(String input) {
		int counter = 0;
		int index = input.indexOf('*');
		int i = 1;

		while (index - i >= 0 && index + i < input.length()) {
			if (input.charAt(index - i) == input.charAt(index + i)) {
				counter++;
			} else {
				break;
			}
			
			i++;
		}
		
		return counter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getPalindromeLenght("51213*3214"));
	}

}
