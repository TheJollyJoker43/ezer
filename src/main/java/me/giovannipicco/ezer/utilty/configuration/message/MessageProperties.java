package me.giovannipicco.ezer.utilty.configuration.message;

import java.time.LocalDateTime;
import java.util.Properties;

public class MessageProperties {

	private static Properties prop;
	private static LocalDateTime lastUpdate;

	private MessageProperties() {
	}

	public static Properties getInstance() {

		if (prop == null || lastUpdate.plusMinutes(30).isBefore(LocalDateTime.now())) {
			prop = System.getProperties();
			// WAITING BETTER IMPLEMENTATION
//			Properties sysProp = System.getProperties();
//			try (FileInputStream propFile = new FileInputStream("src" + File.separator + "main" + File.separator +  "resources" + File.separator + "static" + File.separator + "message.properties")) {
//				Properties p = new Properties(sysProp);
//				p.load(propFile);
//				prop = p;
//				lastUpdate = LocalDateTime.now();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
		}
		
		return prop;
	}

}