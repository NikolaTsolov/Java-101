package mondey;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class PropartiesParser {

	/* Just a simple comment */
	private static File file;

	public static Map<String, String> parseProperties() throws IOException {
		BufferedReader br = null;
		Map<String, String> keyValue = null;
		
		try {
			br = new BufferedReader(new FileReader(file));
			String ln = br.readLine();
			while((ln = br.readLine()) != null) {
				if(!ln.startsWith("#")) {
					keyValue.put(makeKeyValue(ln)[0], makeKeyValue(ln)[1]);
				}
			}
		}
		
		finally {
			br.close();
		}
		
		return keyValue;
	}
	
	public static String[] makeKeyValue(String line) {
		String[] parts = line.split("=", 2);
		String key = parts[0].trim();
		String value = parts[1].trim();
		String[] keyValue = {key, value};
		return keyValue;
	}
	
	public static void main(String[] args) {
		PropartiesParser.makeKeyValue("a1=b1");
	}

}
