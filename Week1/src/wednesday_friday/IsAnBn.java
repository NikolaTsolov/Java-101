package wednesday_friday;

public class IsAnBn {

	public static boolean isAnBn(String input) {
		if (input.length() == 0) {
			return true;
		}
		if(input.length() % 2 != 0) {
			return false;
		}
		for (int i = 0; i < input.length() / 2; i++) {
			int right = input.charAt(input.length() - i - 1);
			int left = input.charAt(i);
			if (left != 'a' || right != 'b') {
				return false;
			}
		}

		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAnBn(""));
		System.out.println(isAnBn("hack"));
		System.out.println(isAnBn("aaabb"));
		System.out.println(isAnBn("aaabbb"));
		System.out.println(isAnBn("aabbaabb"));
		System.out.println(isAnBn("bbbaaa"));
		System.out.println(isAnBn("aaaaabbbbb"));

	}

}
