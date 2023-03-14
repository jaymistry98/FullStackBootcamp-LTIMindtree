package com.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	int a;
	static Calculator cal = null;
	
	@BeforeAll
	public static void callOnceOnly() {
		System.out.println("Called only once before all test cases");
		
		cal = new Calculator();
	}
	
	@BeforeEach
	public void callBefore() {
		a = 10;
		System.out.println("Called Before with value " + 10);	
	}
	
	@AfterEach
	public void callAfter() {
		System.out.println("Called Afer");
	}
	
	@Test
	void testAdd() {
		System.out.println("Inside Add() the value is " + a);
		++a;
		
		assertEquals(20, cal.add(10, 10));
		
		System.out.println("Value updated in Add(), the value is " + a);
	}
	
	@Test
	void testSubtract() {
		System.out.println("Inside Subtract() the value is " + a);
		--a;
		
		assertEquals(10, cal.subtract(20, 10));
		
		System.out.println("Value updated in Subtract(), the value is " + a);
	}

}
