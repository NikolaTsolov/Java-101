package monday;

public class UniqueWords {
	
	public static int uniqueWordsCount(String[] arr) {
		int count = 1;
		boolean flag = false;
		
		for (int i = 1; i < arr.length; i++) {
			for (int j = i-1; j >= 0; j--) {
				if(arr[i].equals(arr[j])) {
					flag = true;
				}
			}
			
			if(!flag) {
				count++;
			}
			
			flag = false;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(uniqueWordsCount(new String[] {"apple", "banana", "apple", "pie"}));
		System.out.println(uniqueWordsCount(new String[] {"java", "java", "java", "android"}));
		System.out.println(uniqueWordsCount(new String[] {"HELLO!", "HELLO!", "HELLO!", "HELLO!"}));
	}

}
