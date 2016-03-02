package wednesday;

public class Matrix {

	interface MatrixOperation {
		Pixel withPixel(int x, int y, Pixel[][] matrix);
	}

	private Pixel[][] matrix;
	private final float percentBrightnesReduction = (float) 0.1;

	public Matrix(Pixel[][] matrix) {
		this.matrix = matrix;
	}

	@SuppressWarnings("static-access")
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < matrix.length; i++) {
			sb.append("[");
			for (int j = 0; j < matrix[i].length; j++) {
				sb.append("".format("R[%1$2s], G[%2$2s], B[%3$2s] - ", matrix[i][j].getR(), matrix[i][j].getG(),
						matrix[i][j].getB()));
			}
			sb.append("]\n");
		}
		return sb.toString();
	}

	MatrixOperation brightnesReduce = new MatrixOperation() {

		@Override
		public Pixel withPixel(int x, int y, Pixel[][] matrix) {
			Pixel p = matrix[x][y];
			p.setR(p.getR() - p.getR() * percentBrightnesReduction);
			p.setG(p.getG() - p.getG() * percentBrightnesReduction);
			p.setB(p.getB() - p.getB() * percentBrightnesReduction);
			return p;
		}
	};

	MatrixOperation greyscale = new MatrixOperation() {

		@Override
		public Pixel withPixel(int x, int y, Pixel[][] matrix) {
			Pixel p = matrix[x][y];
			float Gray = (float) (p.getR() * 0.2126 + p.getG() * 0.7152 + p.getB() * 0.0722);
			p.setR(Gray);
			p.setG(Gray);
			p.setB(Gray);
			return p;
		}
	};

	public void operate(MatrixOperation op) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = op.withPixel(i, j, matrix);
			}
		}
	}

	public static void main(String[] args) {
		Pixel[][] matrix = new Pixel[5][3];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = new Pixel(131, 132, 133);
			}
		}

		Matrix mat = new Matrix(matrix);
		System.out.println(mat.toString());
		mat.operate(mat.brightnesReduce);
		System.out.println(mat.toString());
		mat.operate(mat.greyscale);
		System.out.println(mat.toString());

	}
}
