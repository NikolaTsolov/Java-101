package wednesday_friday;

public class Rescale {
	
	public static int [][] rescale(int[][] original, int newWidth, int newHeight) {
		int [][] rescaled = new int[newWidth][newHeight];
		double x_ratio = original.length/newWidth;
		double y_ratio = original[0].length/newHeight;
		double px, py;
		for (int i = 0; i < rescaled.length; i++) {
			for (int j = 0; j < rescaled[i].length; j++) {
				px = Math.floor(i*x_ratio);
				py = Math.floor(j*y_ratio);
				rescaled[i][j] = original[(int) (px*original.length)][(int) (py*original[i].length)];
			}
		}
		
		return rescaled;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
