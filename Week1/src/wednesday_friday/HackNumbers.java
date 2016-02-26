package wednesday_friday;

public class HackNumbers {

	public static boolean isHack(int num) {
		IsPalindrome palindrome = new IsPalindrome();
		CountOccurrence occourance = new CountOccurrence();
		
		String binary = Integer.toBinaryString(num);
		
		boolean is_palindrome = palindrome.isPalindrome(binary);
		boolean are_odd = occourance.countOccurrences("1", binary) % 2 != 0;
		
		if(is_palindrome && are_odd) {
			return true;
		}
		
		return false;
	}
	
	public static int nextHack(int num) {
		int i = 1;
		
		while(!isHack(num+i)) {
			i++;
		}
		
		return num + i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isHack(1));
		System.out.println(nextHack(0));
		System.out.println(isHack(21));
		System.out.println(nextHack(10));
		System.out.println(isHack(8191));
		System.out.println(nextHack(8031));
	}


}
