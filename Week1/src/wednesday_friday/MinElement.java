package wednesday_friday;

public class MinElement {

	public static int min(int[] arr) {
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 0 };
		System.out.println(min(arr));

	}

}
