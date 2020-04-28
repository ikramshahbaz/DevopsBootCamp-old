package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorApp {
	

	
	@GetMapping("/diff")
	public int calculateDiff() {
		int a = 20;
		int b = 10;
		int sub = a-b;
		return sub;
	}
	
	
	@GetMapping("/divide")
	public int calculateDivide() {
		int a = 20;
		int b = 10;
		int divide = a/b;
		return divide;

	}

}
