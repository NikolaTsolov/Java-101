package wednesday;

public class CorrectBrackets {
	
	public static boolean isCorrect(String input) {
		int count1 = 0;
		int count2 = 0;
		
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == '(') {
				count1++;
			}
			else if(input.charAt(i) == ')') {
				count2++;
			}
			
			if(count2 > count1) {
				return false;
			}
		}
		
		if(count1 == count2) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		System.out.println(isCorrect("(()())"));
		System.out.println(isCorrect("())(()"));
	}

}
