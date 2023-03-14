package com.day1;

public class ArrayDemo {
	public static void main(String[] args) {
		int userData[] = new int[5];
		
		userData[0] = 100;
		userData[1] = 101;
		userData[2] = 102;
		
		int userData2[] = {201,202,203};
		for(int ud: userData2) {
			System.err.println(ud);
		}
		
		for(int i = 0; i < userData.length; i++) {
			System.out.println(userData[i]);
		}
			
	}
}
