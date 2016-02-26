package wednesday;

import java.io.File;

public class BulkThumbnailCreator {

	public static File[] listImages(File file) {
		File[] files = null;
		if (file.isDirectory()) {
			files = file.listFiles();
		}
		if (files.length == 0) {
			return null;
		}
		File[] images = null;
		int j = 0;
		for (int i = 0; i < files.length; i++) {

			if (files[i].getName().endsWith(".jpg")) {
				images[j] = files[i];
				j++;
			}
		}
		return images;
	}

	public static void main(String[] args) {
		File im = new File("~/Images");
		ImageFile imageFile = new ImageFile(BulkThumbnailCreator.listImages(im));
		Producer produced = new Producer(imageFile);
		Consumer consumer = new Consumer(imageFile);
		produced.run();
		consumer.run();
	}

}
