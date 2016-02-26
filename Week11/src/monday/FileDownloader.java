package monday;

import java.net.*;
import java.io.*;

public class FileDownloader {
	
	public static void withStandard() throws IOException {
		URL url = new URL("http://shop.nuclearblast.com/static/articles/100/100296.jpg/1000x1000.jpg");
		InputStream in = new BufferedInputStream(url.openStream());
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		byte[] buf = new byte[1024];
		int n = 0;
		while (-1!=(n=in.read(buf)))
		{
		   out.write(buf, 0, n);
		}
		out.close();
		in.close();
		byte[] response = out.toByteArray();
		
		FileOutputStream fos = new FileOutputStream("/home/nikola/Images/BG.jpg");
		fos.write(response);
		fos.close();

	}
	
	public static void withAppache() {
		
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			withStandard();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
