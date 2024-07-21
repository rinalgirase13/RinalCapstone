package com.infy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloG {
	
	@GetMapping("/")
	public String hello() {
		
		return "hello";
	}
	

}
