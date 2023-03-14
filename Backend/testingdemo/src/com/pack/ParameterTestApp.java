package com.pack;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterTestApp {
	
	@Parameter(0)
	public int m1;
	@Parameter(1)
	public int m2;
	@Parameter(2)
	public int m3;
	@Parameter(3)
	public int result;
	
	@Parameters
	public static Collection<Object[]> data() {
		
		Object[][] data = new Object[][] {{1,2,2,5}, {5,3,15,23}, {121,4,484,609}};
		return Arrays.asList(data);
	}
	/*
	@Test
	public void testMul() {
		MyClass tester = new MyClass();
		assertEquals(result, tester.multiply(m1,m2));

	}
	*/
	@Test
	public void testAdd() {
		MyClass tester = new MyClass();
		assertEquals(result, tester.add(m1,m2,m3));

	}
	
	class MyClass{
		public int multiply(int i, int j) {
			return i*j;
		}
		
		public int add(int i, int j,int k) {
			return i+j+k;
		}
	}
	
}
