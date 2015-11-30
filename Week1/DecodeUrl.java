package week_1;

public class DecodeUrl {
	
	public static String [] URL = {"%20", "%3A", "%3D", "%2F"};
	public static String [] Meanings = {" ", ":", "?", "/"};
	
	public static String decodeUrl(String input) {
		input += " ";
	
		for (int i = 0; i < URL.length; i++) {
			StringBuilder resault = new StringBuilder();
			String [] arr = input.split(URL[i]);
			
			for (int j = 0; j < arr.length; j++) {
				resault.append(arr[j]+Meanings[i]);
			}
			
			resault.deleteCharAt(resault.length()-1);
			input = resault.toString();
		}
		return input;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(decodeUrl("%2Fkit%3Aten%20pic.jpg%3D"));
	}

}
