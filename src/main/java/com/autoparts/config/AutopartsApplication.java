package com.autoparts.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.autoparts")
public class AutopartsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutopartsApplication.class, args);
	}
}
