package de.tum.jk.structural.proxy.client;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import de.tum.jk.structural.proxy.proxy.ImageSubject;
import de.tum.jk.structural.proxy.proxy.ProxyImage;

public class Main {

	public static void main(String[] args) throws MalformedURLException, IOException {

		ProxyImage proxyImage = new ProxyImage();

		URL invalidURL = new URL("http://THIS URL IS TOTALLY WRONG THEREFORE WE DO A FALLBACK TO A LOCAL IMAGE");
		ImageSubject img1 = proxyImage.request(invalidURL);
		new PictureJFrame(img1);

		URL validURL = new URL(
				"https://www1.in.tum.de/lehrstuhl_1/templates/ordasofttemplate-basetemplate/images/center.jpg");
		ImageSubject img2 = proxyImage.request(validURL);
		new PictureJFrame(img2);

	}

}
