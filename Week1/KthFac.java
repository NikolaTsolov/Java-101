package week_1;

public class KthFac {

	public static long kthFac(int k, int n) {
		if (n < 0 || k <= 0) {
			// exetion
			return 0;
		}

		long fac = n;

		for (int i = n - k; i > 1; i -= k) {
			fac *= i;
		}

		return fac;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(kthFac(3, 9));
	}

}
