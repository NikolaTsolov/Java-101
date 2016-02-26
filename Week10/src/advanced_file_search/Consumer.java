package advanced_file_search;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Consumer extends Thread {
	
	private FileSearch fileSearch;
	private String KEY_WORD = "joke";
	
	public Consumer(FileSearch fileSearch) {
		this.fileSearch = fileSearch;
	}
	
	public void run() {
		File txtFile = fileSearch.read();
		BufferedReader br = null; 
		int line = 0;
		try {
			br = new BufferedReader(new FileReader(txtFile));
			String currentLine;
			while((currentLine = br.readLine()) != null) {
				if(currentLine.contains(KEY_WORD)) {
					fileSearch.addMatch("We found match in "
					+ txtFile.getName() + " at line " + line);
				}
				line++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
