package monday;

public class SubsequanceWithEqualElements {

	public static int maxEqualConsecutive(int[] items) {
		int max = 1;
		int count = 1;

		for (int i = 0; i < items.length - 1; i++) {
			if (items[i] == items[i + 1]) {
				count++;
			} else {
				if (max < count) {
					max = count;
				}
				
				count = 1;
			}
		}
		
		if (max < count) {
			max = count;
		}

		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxEqualConsecutive(new int[] { 1, 2, 3, 3, 3, 3, 4, 3, 3 }));
		System.out.println(maxEqualConsecutive(new int[] { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5 }));
	}

}
