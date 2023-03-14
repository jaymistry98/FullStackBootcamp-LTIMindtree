package com.app2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TestCase2Test {
	
	static TestCase2 test = null;
	
	@BeforeAll
	public static void callOnceOnly() {
		System.out.println("Called only once before all test cases");
		
		test = new TestCase2();
	}
	
	@BeforeEach
	public void callBefore() {
		
		System.out.println("Called Before");	
	}
	
	@AfterEach
	public void callAfter() {
		System.out.println("Called Afer");
	}
	
	
	
	@Test
	void testMultiply() {
	
		assertEquals(200, test.multiplyTest(20, 10));
		
	}
	

}
