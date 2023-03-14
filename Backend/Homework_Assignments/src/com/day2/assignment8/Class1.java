package com.day2.assignment8;

public class Class1 {
	
	static int i = 22;
	static int j = 14000;
	static boolean k;
	static boolean l;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		i = 22;
		j = 14000;
		Class1 class1 = new Class1();
		k = class1.Method1(i);
		l = class1.Method2(j);
		
		if(k==true && l==true) {
			System.out.println(" Is a new employee");
		}
		else {
			System.out.println(" Is not a new employee");
		}
	}
	
	public boolean Method1 (int i) {
		
		if (i>20 && i<30) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean Method2 (int j) {
		
		if (j>=14000 && j<20000) {
			return true;
		}
		else {
			return false;
		}
	}

}
