package de.tum.jk.structural.proxy.proxy;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ProxyImage extends ImageSubject {

	@Override
	public ImageSubject request(URL url) throws IOException {
		try {
			BufferedImage image = ImageIO.read(url);
			RemoteImage remoteImage = new RemoteImage();
			remoteImage.imageTitle = "RealPicture";
			return remoteImage.request(url);
		} catch (IOException e) {
			this.imageTitle = "DefaultImage";
			this.bufferedImage = ImageIO.read(new File(filePath));
			return this;
		}
	}

}
