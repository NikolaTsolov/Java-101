package week_1;

public class MaxScalarSum {

	public static long maximalScalarSum(int[] a, int[] b) {
		quickSort(a, 0, a.length - 1);
		quickSort(b, 0, b.length - 1);
		long sum = 0;		
		for (int i = 0; i < a.length; i++) { 
			sum += (a[i] *b[i]); 
			System.out.println(a[i]+" "+b[i]); 
		}
		 

		return sum;

	}

	public static int partition(int arr[], int left, int right) {
		int i = left, j = right;
		int tmp;
		int pivot = arr[(left + right) / 2];

		while (i <= j) {
			while (arr[i] < pivot)
				i++;
			while (arr[j] > pivot)
				j--;
			if (i <= j) {
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			}
		}
		;

		return i;
	}

	public static void quickSort(int[] arr, int left, int right) {
		int index = partition(arr, left, right);
		if (left < index - 1)
			quickSort(arr, left, index - 1);
		if (index < right)
			quickSort(arr, index, right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 5, 3, 1, 4, 7, 2, 15, 10, 3 };
		int[] arr2 = { 3, 7, 8, 5, 2, 1, 9, 5, 4 };
		System.out.println(maximalScalarSum(arr1, arr2));
	}

}
