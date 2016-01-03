package monday;

public class LucasSeries {
	
	public static long nthLucas(int input) {
		StringBuilder resault = new StringBuilder();
		if (input < 0) {
			// Throw exeption
			return -1;
		} else if(input == 0) {
			return 2;
		} else if(input == 1) {
			return 21;
		}
		
		int previousEl = 2;
		int lastEl = 1;
		resault.append("21");
		
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
		System.out.println(nthLucas(0));
		System.out.println(nthLucas(1));
		System.out.println(nthLucas(2));
		System.out.println(nthLucas(10));
	}

}
