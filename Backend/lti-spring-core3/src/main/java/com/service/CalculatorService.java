package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.model.InterestCalculator;

//@Service(value = "service")
public class CalculatorService {
	
	//@Autowired
	//@Qualifier(value = "fixed")
	private InterestCalculator calculator;
	
	

	public CalculatorService(InterestCalculator calculator) {
		super();
		this.calculator = calculator;
	}

	public InterestCalculator getCalculator() {
		return calculator;
	}

	public void setCalculator(InterestCalculator calculator) {
		this.calculator = calculator;
	}
	
	public double service(double amount) {
		return calculator.calculate(amount);
	}
}
