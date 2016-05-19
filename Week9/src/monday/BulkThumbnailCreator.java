package monday;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import javax.imageio.ImageIO;

public class BulkThumbnailCreator {

	private static class Set {
		private BufferedImage image;
		private File imageName;

		Set(BufferedImage image, File imageName) {
			this.image = image;
			this.imageName = imageName;
		}

		public BufferedImage getImage() {
			return image;
		}

		public File getImageName() {
			return imageName;
		}
	}

	private static Queue<File> images = new ConcurrentLinkedQueue<>();
	private static Queue<Set> resizedImages = new ConcurrentLinkedQueue<>();
	private static final String FOLDER_NAME = "thumbnail";

	public static void tumbnailGen(File filename, int newWidth, int newHight) {
		Thread imageAdder = new Thread(new Runnable() {
			
			@Override
			public void run() {
				addImages(filename);				
			}
		});
		imageAdder.start();
		Thread imageResizer = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (File image : images) {
					compResize(image, newHight, newWidth);
				}
				
			}
		});
		imageResizer.start();
		
		Thread newImageCreator = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (Set image : resizedImages) {					
					createNewImage(image.getImage(), imageRedirection(image.getImageName().getAbsolutePath()));
				}				
			}
		});
		newImageCreator.start();
	}

	public static void addImages(File filename) {
		File[] files = filename.listFiles();
		new File(filename + "/" + FOLDER_NAME).mkdir();

		for (File file : files) {
			if (file.getName().matches("^(.*jpg)") || file.getName().matches("^(.*png)")) {
				System.out.println(file.getAbsolutePath());
				images.add(file);
			}
			if (file.isDirectory() && !file.getAbsolutePath().contains(FOLDER_NAME)) {
				addImages(file);
			}
		}
	}
	
	public static String imageRedirection(String originalPath) {
		StringBuilder sb = new StringBuilder();
		char[] dst = new char[100];
		
		sb.append(originalPath);
		sb.getChars(sb.lastIndexOf("/"), sb.length(), dst, 0);
		sb.delete(sb.lastIndexOf("/"), sb.length());
		sb.append("/" + FOLDER_NAME);
		sb.append(dst);
		sb.delete(sb.lastIndexOf(".") + 4, sb.length());
		
		return sb.toString();
	}

	public static void compResize(File imagename, int newHight, int newWidth) {
		try {

			BufferedImage image = ImageIO.read(imagename);
			BufferedImage newImage = resize(image, newHight, newWidth);
			resizedImages.add(new Set(newImage, imagename));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void createNewImage(BufferedImage image, String ref) {
		try {
			String format = (ref.endsWith(".png")) ? "png" : "jpg";
			ImageIO.write(image, format, new File(ref));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static BufferedImage resize(BufferedImage img, int newW, int newH) {
		int w = img.getWidth();
		int h = img.getHeight();
		BufferedImage dimg = new BufferedImage(newW, newH, img.getType());
		Graphics2D g = dimg.createGraphics();
		g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g.drawImage(img, 0, 0, newW, newH, 0, 0, w, h, null);
		g.dispose();

		return dimg;
	}

	public static void main(String[] args) {
		tumbnailGen(new File("/home/nikola/Images"), 150, 150);
	}

}
