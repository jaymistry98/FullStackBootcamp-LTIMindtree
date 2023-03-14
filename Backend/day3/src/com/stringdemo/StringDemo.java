package com.stringdemo;

public class StringDemo {

	public static void main(String[] args) {
		
		String s = "admin";
		
		s = s.concat(" manager");
		
		//System.out.println(s);
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		System.out.println(s.startsWith("ad"));
		System.out.println(s.endsWith("r"));
		
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(8));
		
		System.out.println(s.length());
		
		String data = "Hello manager, how are you manager?";
		
		String newData = data.replace("manager", "QA");
		
		System.out.println(newData);
	}

}
