package wednesday_friday;

public class ZeroInsertion {

	public static long zeroInsertion(int n) {
		StringBuilder zeroInserted = new StringBuilder();
		char[] nums = (n + "").toCharArray();

		for (int i = 0; i < nums.length; i++) {
			zeroInserted.append(nums[i]);

			if (i + 1 < nums.length) {
				boolean areEqueal = nums[i] == nums[i + 1];
				boolean areDevided = (Integer.parseInt(nums[i] + "") 
						+ Integer.parseInt(nums[i + 1] + "")) % 10 == 0;

				if (areEqueal || areDevided) {
					zeroInserted.append('0');
				}
			}
		}
		return Long.parseLong(zeroInserted.toString());
	}

	public static void main(String[] args) {
		System.out.println(zeroInsertion(116457));
		System.out.println(zeroInsertion(55555555));
		System.out.println(zeroInsertion(1));
		System.out.println(zeroInsertion(6446));
	}

}
