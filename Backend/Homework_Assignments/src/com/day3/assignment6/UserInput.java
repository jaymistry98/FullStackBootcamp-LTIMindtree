package com.day3.assignment6;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, iterations;
		number = Integer.parseInt(args[0]);
		iterations = Integer.parseInt(args[1]);
		
		for(int i=0; i<=iterations; i++)
			System.out.println(number*i);
	}

}
