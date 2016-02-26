package monday;

import java.lang.Math;

public class Power <N1 extends Number , N2 extends Number > {
	
	public static <N1 extends Number , N2 extends Number > Number pow(N1 firstNumber, N2 secondNumber) {
		return Math.pow(firstNumber.doubleValue(), secondNumber.doubleValue());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Power.pow(2, 5));
		System.out.println(Power.pow(2, 5.2));
		System.out.println(Power.pow(2.5, 2));
	}

}
