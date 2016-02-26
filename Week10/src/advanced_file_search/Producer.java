package advanced_file_search;

import java.io.File;
import java.util.LinkedList;

public class Producer extends Thread {

	private FileSearch fileSearch;
	private File file;
	
	public Producer(FileSearch fileSearch, File file) {
		this.fileSearch = fileSearch;
		this.file = file;
	}
	
	public void run() {
		LinkedList<File> directories = new LinkedList<>();
		directories.add(file);
		while (directories.size() != 0) {
			File currentFile = directories.poll();
			File[] files = null;
			
			if (currentFile.isDirectory() == true) {
				files = currentFile.listFiles();
			} else if (currentFile.getName().endsWith(".txt")) {
				fileSearch.add(currentFile);
			}
			
			for (int i = 0; i < files.length; i++) {
				directories.add(files[i]);
			}
		}
	}
	
}
