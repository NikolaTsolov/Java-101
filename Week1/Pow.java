package week_1;

public class Pow {
	
	public static long pow(int a, int b) {
		if(b == 0) return 1;

	    long d = pow(a, b/2);

	    if(b%2 == 0) return d*d;
	    else return a*d*d;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pow(2, 5));

	}

}
