package wednesday_friday;

public class Average {

	public static int average(int[] array) {
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		return sum / array.length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 5, 3, 9, 10 };
		System.out.println(average(array));
	}

}
