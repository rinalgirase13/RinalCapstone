package com.infy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.infy")
@EntityScan(basePackages = "com.infy.entity")
public class RinalCapstoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(RinalCapstoneApplication.class, args);
	}

}
