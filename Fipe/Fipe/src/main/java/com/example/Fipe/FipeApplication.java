package com.example.Fipe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example"})
public class FipeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FipeApplication.class, args);
	}
}
