package week_1;

public class KthMin {

	public static int kthMin(int k, int[] arr) {
		if(k <= 0 || k > arr.length) {
			//exeption
			return 0;
		}
		for (int i = 0; i < k; i++) {
			int min = arr[i];
			int min_index = i;
			
			for (int j = i; j < arr.length; j++) {
				if (min > arr[j]) {
					min = arr[j];
					min_index = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
		}
		return arr[k - 1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 10, 15, 2, 7, 23 };
		System.out.println(kthMin(3, arr));

	}

}
