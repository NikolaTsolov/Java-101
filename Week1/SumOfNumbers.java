package week_1;

public class SumOfNumbers {
	
	public static int sumOfNumbers(String input) {
		int sum = 0;
		
		for (int i = 0; i < input.length(); i++) {
			StringBuilder nums = new StringBuilder();
			while(i < input.length() && input.charAt(i) > '/' && input.charAt(i) < ':') {
				nums.append(input.charAt(i)+"");
				i++;
			}
			
			if(nums.toString().length() != 0) {
				sum += Integer.parseInt(nums.toString());
			}			
		}
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfNumbers("abc123dd34"));
		System.out.println(sumOfNumbers("12 99 1"));
	}

}
