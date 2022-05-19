package me.giovannipicco.ezer.utilty.configuration.message;

import java.util.Properties;

import lombok.Getter;

@Getter
public class MessageKey {
	
	private final Properties properties = MessageProperties.getInstance();
	private final String message;
	
	
	public MessageKey(String key, String defaultValue) {
		this.message = properties.getProperty(key, defaultValue);
	}
	
	
	
}
