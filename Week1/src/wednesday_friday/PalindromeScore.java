package wednesday_friday;

public class PalindromeScore extends IsPalindrome {
	
	public static int pScore(int num) {
		ReverseMe reverse = new ReverseMe();
		int count = 1;
		
		while(!isPalindrome(num)) {
			num += (Integer.parseInt(reverse.reverseMe(num+"")));
			count++;
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pScore(121));
		System.out.println(pScore(48));
		System.out.println(pScore(198));
	}

}
