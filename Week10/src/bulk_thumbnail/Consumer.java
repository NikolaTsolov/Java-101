package bulk_thumbnail;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Consumer extends Thread {
	
	ImageFile imageFile;
	
	public Consumer(ImageFile imageFile) {
		this.imageFile = imageFile;
	}
	
	public void run() {
		int i = 0;
		while(imageFile.getResiedSize() != 0) {
			BufferedImage resized = imageFile.recieve(i);
			try {
				ImageIO.write(resized, "jpg", new File(
						imageFile.FILE_PRE_PATH+imageFile.getImage(i).getName()));
				i++;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
