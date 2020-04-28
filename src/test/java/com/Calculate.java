package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class Calculate {

	int num1 = 20;
	int num2 = 10;
	CalculatorApp calc = new CalculatorApp();
	
	@Test
	public void testDif() {
		Assertions.assertEquals(10, calc.calculateDiff());
	}
	
	
	@Test
	public void testDivide() {
		Assertions.assertEquals(2, calc.calculateDivide());
	}
}
