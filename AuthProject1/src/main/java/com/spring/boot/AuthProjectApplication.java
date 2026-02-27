package com.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthProjectApplication.class, args);
		System.out.println("App is runing on port no 8080");
	}

}
