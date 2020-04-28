package com;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class Greeting {
	
	@Test
	public void testMessage() {
		GreetingMessage messageService = new GreetingMessage();
		System.out.println("hi");
		Assertions.assertEquals(messageService.sayHello(), "Hi Shahbaz");
	}
	
	@Test
	public void testWelcome() {
		GreetingMessage ms = new GreetingMessage();
		Assertions.assertEquals("Welcome to DevOps Session !!!", ms.welcomeGuest());
	}
	
}
