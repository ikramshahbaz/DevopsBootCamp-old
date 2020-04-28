package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingMessage {
	
	@GetMapping("/hi")
	public String sayHello() {
		return "Hi Shahbaz";
	}
	
	
	@GetMapping("/Session")
	public String welcomeGuest() {
		return "Welcome to DevOps Session !!!";
	}

}
