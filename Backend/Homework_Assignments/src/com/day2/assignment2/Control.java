package com.day2.assignment2;

public class Control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bool = true;
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0;  j < 10; j++) {
				System.out.print(j + "\t");
				if(j > 5) {
					break;
				}
			}
		System.out.println("Outer Loop");
		}
		System.out.println("End");
	}

}
