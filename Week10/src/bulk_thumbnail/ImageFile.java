package bulk_thumbnail;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

public class ImageFile {

	private File[] images;
	private boolean available = false;
	private LinkedList<BufferedImage> resized = new LinkedList<>();
	public String FILE_PRE_PATH = "/home/nikola/Images/";
	
	public ImageFile(File[] images) {
		this.images = images;
	}
	
	public int getLenght() {
		return images.length;
	}
	
	public int getResiedSize() {
		return resized.size();
	}
	
	public File getImage(int i) {
		return images[i];
	}

	public void send(BufferedImage image) {
		while (available == true) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		resized.add(image);
		notifyAll();
		available = true;
	}

	public BufferedImage recieve(int i) {
		while (available == true) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		available = false;
		notifyAll();
		return resized.get(i);
	}
}
