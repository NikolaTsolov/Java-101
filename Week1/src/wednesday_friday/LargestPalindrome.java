package wednesday_friday;

public class LargestPalindrome {

	public static boolean isPalindrome(long[] arr, int l) {
		for (int k = 0; k < l / 2; k++) {
			if (arr[k] != arr[l - k - 1]) {
				return false;
			}
		}
		return true;
	}

	public static long getLargestPalindrome(long N) {
		for (long i = N; i > 0; i--) {
			long[] arr = new long[16];
			int j = 0;
			long num = i;

			while (num != 0) {
				arr[j] = num % 10;
				num /= 10;
				j++;
			}

			if (isPalindrome(arr, j / 2)) {
				return i;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getLargestPalindrome(1513125));
	}

}
