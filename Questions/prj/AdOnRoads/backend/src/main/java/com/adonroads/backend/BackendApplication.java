package com.adonroads.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Tells Spring Boot to start auto-configuration and component scanning.
@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		 // Starts the Spring Boot application Launches the embedded server (Tomcat) and your app.
		SpringApplication.run(BackendApplication.class, args);
	}

}
