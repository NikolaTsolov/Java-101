package monday;

public class Sumation <N1 extends Number , N2 extends Number > {
	
	public static  <N1 extends Number , N2 extends Number> Number sum (N1 firstNumber, N2 secondNumber) {
		return firstNumber.doubleValue() + secondNumber.doubleValue();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Sumation.sum(3, 3.14));

	}

}
