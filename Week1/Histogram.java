package week_1;

public class Histogram {

	public static int[] histogram(short[][] image) {
		int[] hist = new int[256];
		for (int i = 0; i < image.length; i++) {
			for (int j = 0; j < image[i].length; j++) {
				hist[image[i][j]]++;
			}
		}
		return hist;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short[][] image = { { 1, 2, 4 }, { 3, 5, 1 }, { 3, 2, 10 }, { 33, 5, 11 }, { 3, 4, 1 } };
		int [] arr = histogram(image);
		System.out.println(arr[1]);
		System.out.println(arr[3]);
		System.out.println(arr[33]);
	}

}
