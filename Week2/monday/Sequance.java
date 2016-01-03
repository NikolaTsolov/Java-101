package monday;

public class Sequance {

	public static boolean isIncreasing(int[] sequance) {
		for (int i = 0; i < sequance.length - 1; i++) {
			if (sequance[i] > sequance[i + 1]) {
				return false;
			}
		}

		return true;
	}

	public static boolean isDecreasing(int[] sequance) {
		for (int i = 0; i < sequance.length - 1; i++) {
			if (sequance[i] < sequance[i + 1]) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		int[] seq1 = { 1, 2, 4, 6 };
		int[] seq2 = { 1, 3, 6, 5 };
		int[] seq3 = { 10, 9, 7, 4 };
		System.out.println(isIncreasing(seq1));
		System.out.println(isIncreasing(seq2));
		System.out.println(isIncreasing(seq3));
		System.out.println(isDecreasing(seq1));
		System.out.println(isDecreasing(seq2));
		System.out.println(isDecreasing(seq3));

	}

}
