// Java program to convert URL to URI

import java.net.*;

class GFG {
	public static void main(String args[])
	{

		// url and uri objects
		URL url = null;
		URI uri = null;

		try {

			// create a URL
			url = new URL("https://photos.app.goo.gl/uSs6xCfwDhoVDaWn9");

			// display the URL
			System.out.println("URL: " + url);

			// convert the URL to URI
			uri = url.toURI();

			// display the URI
			System.out.println("URI: " + uri);
		}
		// if any error occurs
		catch (Exception e) {

			// display the error
			System.out.println(e);
		}
	}
}
