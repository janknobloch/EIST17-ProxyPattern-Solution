package de.tum.jk.structural.proxy.proxy;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class RemoteImage extends ImageSubject {

	
	@Override
	public ImageSubject request(URL url) throws IOException {
		this.bufferedImage = ImageIO.read(url);
		ImageIO.write(bufferedImage, "jpg", new File(filePath));
		return this;
	}

}
