package week_1;

public class DoubleFact {
	
	public static long doubleFac(int n) {
		if(n < 0) {
			//exeption
			return 0;
		}
		
		long fac = 1;
		
		for(int i=2;i <= n*(n-1);i++) {
			fac *= i;
		}
		
		return fac;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(doubleFac(3));
	}

}
