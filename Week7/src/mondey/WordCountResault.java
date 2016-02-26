package mondey;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordCountResault {
		
	private WordCountResault(int chars, int words, int lines) {
		
	}
	
	public static void wordCount(File file) throws IOException {
		BufferedReader br = null;
		int lines = 0;
		int words = 0;
		int chars = 0;
		try {
			br = new BufferedReader(new FileReader(file));
			String ln = br.readLine();
			while((ln = br.readLine()) != null) {
				int[] tuple = countCharWord(ln);
				chars += tuple[1];
				words += tuple[0];
				lines++;
			}
		}
		finally {
			br.close();
		}
	}
	
	public static int[] countCharWord(String line) {
		String[] words = line.split(" ");
		int chars = 0;
		for (int i = 0; i < line.length(); i++) {
			chars += words.length;
		}
		
		int[] tuple = {words.length, chars};
		
		return tuple;
	}
	

}
