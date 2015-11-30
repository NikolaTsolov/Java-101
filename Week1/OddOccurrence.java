package week_1;

public class OddOccurrence {

	public static boolean isVisited(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				return true;
			}
		}

		return false;
	}

	public static int getOddOccurrence(int[] arr) {
		int[] visited = new int[arr.length / 2 + 1];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			int counter = 1;
			if (!isVisited(visited, arr[i])) {
				visited[index++] = arr[i];

				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						counter++;
					}
				}

				if (counter % 2 != 0) {
					return arr[i];
				}
			}
		}

		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 2, 1, 3, 4, 3, 4, 4, 6, 5, 6, 5 };
		System.out.println(getOddOccurrence(arr));
	}

}
