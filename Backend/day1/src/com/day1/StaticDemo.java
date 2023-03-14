package com.day1;

public class StaticDemo {
	
	static String Uname = "demo";
	
	static void show() {
		System.out.println("something " + Uname);
	}
	
	public static void main(String[] args) {
		System.out.println("Main method called");
		show();
	}
	
	static {
		System.out.println("static block called");
	}
}
