package org.edwith.webbe.calculatorcli;

import org.springframework.stereotype.Service;

@Service
public class MyService {
	private final CalculatorService calculatorService;
	
	public MyService(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}
	
	public int execute(int value1, int value2) {
		int value=0;
		return value*2;
	}
}
