package monday;

public class FibonacciNumber {

	public static long fibNum(int input) {
		StringBuilder resault = new StringBuilder();
		if (input < 0) {
			// Throw exeption
			return -1;
		}
		else if(input == 0) {
			return 0;
		}
		int previousEl = 0;
		int lastEl = 1;

		resault.append("1");
		for (int i = 1; i < input; i++) {
			int temp = previousEl;
			previousEl = lastEl;
			lastEl += temp;
			resault.append(lastEl);
		}

		return Long.parseLong(resault.toString());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibNum(0));
		System.out.println(fibNum(1));
		System.out.println(fibNum(2));
		System.out.println(fibNum(3));
		System.out.println(fibNum(10));
	}

}
