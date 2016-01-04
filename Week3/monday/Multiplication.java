package monday;

public class Multiplication <N1 extends Number , N2 extends Number > {
	
	public static  <N1 extends Number , N2 extends Number> Number mult (N1 firstNumber, N2 secondNumber) {
		return firstNumber.doubleValue() * secondNumber.doubleValue();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Multiplication.mult(3, 3.14));
		
	}

}
