package wednesday_friday;

public class MaxSpan {

	public static int maxSpan(int [] numbers) {
		int max = 1;
		for (int i = 0; i < numbers.length; i++) {
			int span = 0;
			
			for (int j = i+1; j < numbers.length; j++) {
				if(numbers[i] == numbers[j]) {
					span = j - i + 1;
				}
			}
			
			if(span > max) {
				max = span;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {1, 2, 1, 1, 3};
		int [] arr2 = {1, 4, 2, 1, 4, 1, 4};
		int [] arr3 = {1, 4, 2, 1, 4, 4, 4};
		System.out.println(maxSpan(arr1));
		System.out.println(maxSpan(arr2));
		System.out.println(maxSpan(arr3));
	}

}
