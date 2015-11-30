package week_1;

public class CanBalance {
	
	public static boolean canBalance(int [] numbers) {
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < numbers.length/2; i++) {
			sum1 += numbers[i];
			sum2 += numbers[numbers.length - i - 1];
		}
		return sum1 == sum2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {1, 1, 1, 2, 1};
		int [] arr2 = {2, 1, 1, 2, 1};
		int [] arr3 = {10, 10};
		System.out.println(canBalance(arr1));
		System.out.println(canBalance(arr2));
		System.out.println(canBalance(arr3));
	}

}
