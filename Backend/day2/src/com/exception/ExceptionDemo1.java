package com.exception;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		try {
			int data = Integer.parseInt(args[0])/Integer.parseInt(args[1]);
			System.out.println(data);
		}catch(ArithmeticException e) {
			System.out.println("Divide by Zero.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Provide arguments.");
		}finally {
			System.out.println("Called finally.");
		}
	}

}
