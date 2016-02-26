package advanced_file_search;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;

public class FileSearch {

	private LinkedList<File> txtFiles = new LinkedList<>();
	private LinkedList<String> matchInformation = new LinkedList<>();
	
	public void addMatch(String information) {
		matchInformation.add(information);
	}
	

	public synchronized void add(File txtFile) {
		txtFiles.add(txtFile);
		notifyAll();
	}
	
	public synchronized File read() {
		while(txtFiles.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return txtFiles.poll();
		
	}
}
