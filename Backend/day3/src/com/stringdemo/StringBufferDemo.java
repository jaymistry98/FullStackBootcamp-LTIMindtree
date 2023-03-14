package com.stringdemo;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		//StringBuffer buffer = new StringBuffer("Welcome"); //thread-safe
		
		StringBuilder buffer = new StringBuilder("Welcome");
		
		buffer.append(" to java");
		
		//buffer.insert(2, " python");
		//System.out.println(buffer);
		
		//buffer.reverse();
		//System.out.println(buffer);
		
		//Difference between equals and ==
		String s1 = "hello";
		String s2 = "hello";
		
		String s3 = new String("hello");
		
		System.out.println(s1 == s2); //true, it checks the object reference
		System.out.println(s1 == s3); //false
		
		System.out.println(s1.equals(s2)); //true, equals checks the data and not reference
		System.out.println(s1.equals(s3)); //true
		
	}

}
