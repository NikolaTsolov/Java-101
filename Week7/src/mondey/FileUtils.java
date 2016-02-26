package mondey;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Path;

public class FileUtils {
	
	private FileUtils() {
		
	}
	
	private static FileUtils mInstance;
	
	public static FileUtils getInstance() {
		if(mInstance == null) {
			mInstance = new FileUtils();
		}
		
		return mInstance;
	}
	
	public String readFrom(File file) throws IOException {
		BufferedReader br = null;
		StringBuilder str = new StringBuilder();
		try {
			br = new BufferedReader(new FileReader(file));
			String ln = br.readLine();
			while((ln = br.readLine()) != null) {
				str.append(ln);
				str.append(System.lineSeparator());
			}
		}
		finally {
			br.close();
		}
		
		return str.toString();
	}
	
	String readFrom(Path path) throws IOException {
		return readFrom(path.toFile());
	}
	
	public void writeTo(File file, String contents) throws IOException {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			bw.write(contents);
		}
	}
	
	public void writeTo(Path path, String contents) throws IOException {
		writeTo(path.toFile(), contents);
	}
	

}
