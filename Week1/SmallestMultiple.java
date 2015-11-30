package week_1;

public class SmallestMultiple {

	public static long getSmallestMultiple(int upperBound) {
		long multiple = 2;
		long current_mult = multiple;
		
		if(upperBound < 1) {
			return 0; //exeption
		}
		
		for (int i = 3; i <= upperBound; i++) {
			if (multiple % i != 0) {
				for (int j = i - 1; j > 1; j--) {
					if (i % j == 0) {
						multiple *= (i / j);
						break;
					}
				}

				if (current_mult == multiple) {
					multiple *= i;
				}
				current_mult = multiple;
			}
		}

		return multiple;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSmallestMultiple(10));

	}

}
