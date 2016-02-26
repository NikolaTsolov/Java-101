package monday;

public class Division <N1 extends Number , N2 extends Number > {
	
	public static  <N1 extends Number , N2 extends Number> Number div (N1 firstNumber, N2 secondNumber) {
		if(secondNumber.doubleValue() != 0) {
			return firstNumber.doubleValue() / secondNumber.doubleValue();
		}
		System.err.println("Division by zero is impossible \n");
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Division.div(3, 0));
		System.out.println(Division.div(3.15, 3));
	}

}
