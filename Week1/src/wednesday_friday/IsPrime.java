package wednesday_friday;

public class IsPrime {

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPrime(2));
		System.out.println(isPrime(21));
		System.out.println(isPrime(37));
	}

}
