package me.giovannipicco.ezer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EzerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EzerApplication.class, args);
	}

//	@Bean
//	CommandLineRunner commandLineRunner() {
//		return args -> {
//			System.out.println(MessageConfiguration.ERROR_MESSAGE_GENERIC.getMessage());
//			System.out.println(System.getProperty("user.dir"));
//		};
//	}
	
}
