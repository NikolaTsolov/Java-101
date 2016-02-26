package monday;

public class Factorial<N extends Number> {

	public static <N extends Number> Number fact(N number) {
		if (number.doubleValue() == 1) {
			return 1;
		} else if (number.doubleValue() < 0) {
			return 1;
		} else {
			return number.doubleValue() * (fact(number.doubleValue() - 1)).doubleValue();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Factorial.fact(3));
		System.out.println(Factorial.fact(3.5));
		System.out.println(Factorial.fact(6));
		System.out.println(Factorial.fact(4.6));
	}

}
