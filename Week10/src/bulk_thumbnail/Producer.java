package bulk_thumbnail;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Producer extends Thread {
	ImageFile imageFile;

	public Producer(ImageFile imageFile) {
		this.imageFile = imageFile;
	}

	public void run() {
		int i = 0;
		//while (imageFile.getImage(i) != null) {
		try {
			BufferedImage originalImage;
			System.out.println(imageFile.getImage(i).getName());
			originalImage = ImageIO.read(new File(
					imageFile.FILE_PRE_PATH+imageFile.getImage(i).getName()));
			int type = originalImage.getType() == 0 ? BufferedImage.TYPE_INT_ARGB : originalImage.getType();
			BufferedImage resizeImageJpg = resizeImage(originalImage, type);
			imageFile.send(resizeImageJpg);
			i++;
		} catch (IOException e) {
			e.printStackTrace();
		}
		//}
	}

	private static final int IMG_WIDTH = 150;
	private static final int IMG_HEIGHT = 150;

	private static BufferedImage resizeImage(BufferedImage originalImage, int type) {
		BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);
		Graphics2D g = resizedImage.createGraphics();
		g.drawImage(originalImage, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
		g.dispose();

		return resizedImage;
	}

	@SuppressWarnings("unused")
	private static BufferedImage resizeImageWithHint(BufferedImage originalImage, int type) {

		BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);
		Graphics2D g = resizedImage.createGraphics();
		g.drawImage(originalImage, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
		g.dispose();
		g.setComposite(AlphaComposite.Src);

		g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		return resizedImage;
	}
}
