package wednesday_friday;
import java.util.ArrayList;

public class SMS {

	public static String[] NUMS_TO_CHAR = { " ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static String nextLetter(boolean isCapital, int index, int[] numbers) {
		int offset = 0;
		int capital = 0;

		if (!isCapital) {
			capital = -32;
		}
		if (numbers[index] == 0) {
			index++;
			offset++;
			return " " + offset;

		} else {
			return letterMaker(capital, index, numbers);
		}
	}

	public static String letterMaker(int capital, int index, int[] numbers) {
		int offset = 0;
		int count = 0;
		int size = NUMS_TO_CHAR[numbers[index]].length();

		while (index < numbers.length - 1 && numbers[index] == numbers[index + 1]) {
			if (count == size - 1) {
				count = 0;
			} else {
				count++;
			}

			index++;
			offset++;
		}
		char letter = (char) (NUMS_TO_CHAR[numbers[index]].charAt(count) + capital);

		return letter + "" + offset;
	}

	public static String numbersToMessage(int[] numbers) {
		StringBuilder sms = new StringBuilder();

		for (int i = 0; i < numbers.length; i++) {
			boolean isCapital = false;

			if (numbers[i] != -1) {
				if (numbers[i] == 0) {
					sms.append(" ");
				} else if (numbers[i] == 1) {
					while (i < numbers.length && numbers[i] == 1) {
						isCapital = !isCapital;
						i++;
					}
					String arr = nextLetter(!isCapital, i, numbers);
					i += Integer.parseInt(arr.charAt(1) + "");
					sms.append(arr.charAt(0));
				} else {
					String arr = nextLetter(!isCapital, i, numbers);
					i += Integer.parseInt(arr.charAt(1) + "");
					sms.append(arr.charAt(0));
				}
			}
		}

		return sms.toString();
	}
	
	public static boolean isCaps(char letter) {
		return letter >= 'A' && letter <= 'Z';
	}
	
	public static void numMaker(char letter, ArrayList<Integer> numbers) {
		for (int j = 0; j < NUMS_TO_CHAR.length; j++) {
			int index = NUMS_TO_CHAR[j].indexOf(letter);
			
			if(index != -1) {
				if(numbers.size() > 0 && numbers.get(numbers.size()-1) == j) {
					numbers.add(-1);
				}
				while(index > -1) {
					numbers.add(j);
					index--;
				}
			}
		}
	}

	public static Integer[] messageToNumbers(String message) {
		ArrayList<Integer> numbers = new ArrayList<>();		
		
		for (int i = 0; i < message.length(); i++) {
			char letter = message.charAt(i);
			
			if(isCaps(message.charAt(i))) {
				numbers.add(1);
				letter = (char) (letter + 32);
			}
			
			numMaker(letter, numbers);
		}

		Integer [] nums = new Integer[numbers.size()];
		
		return numbers.toArray(nums);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers1 = { 2, -1, 2, 2, -1, 2, 2, 2 };
		int[] numbers2 = { 2, 2, 2, 2 };
		int[] numbers3 = { 1, 4, 4, 4, 8, 8, 8, 6, 6, 6, 0, 3, 3, 0, 1, 7, 7, 7, 7, 7, 2, 6, 6, 3, 2 };
		System.out.println(numbersToMessage(numbers1));
		System.out.println(numbersToMessage(numbers2));
		System.out.println(numbersToMessage(numbers3));
		Integer [] arr = messageToNumbers("abc");
		Integer [] arr2 = messageToNumbers("a");
		Integer [] arr3 = messageToNumbers("Ivo e Panda");
		Integer [] arr4 = messageToNumbers("aabbcc");
		StringBuilder output = new StringBuilder();
		output.append("[");
		for (int i = 0; i < arr3.length; i++) {
			output.append(arr3[i]+", ");
		}
		output.append("]");
		System.out.println(output.toString());
	}

}
