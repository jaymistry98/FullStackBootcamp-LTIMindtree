package com.day1.assignment7;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bool1 = false;
		boolean bool2 = true;
		boolean bool3 = true;
		
		if(bool2 && (bool3 && (bool1 = true))) {
			System.out.println("Success");
		}
		else {
			System.out.println("Failure");
		}
		System.out.println("bool2 value : " + bool2);
	}

}
