package com.exception;

public class ThrowDemo {
	public static void ageValidation(int age) {
		if (age < 18) {
			throw new ArithmeticException("User is not allowed to enter the PUB.");
		}else {
			System.out.println("Welcome.");
		}
	}
	public static void main(String[] args) {

		ageValidation(17);
	}

}
