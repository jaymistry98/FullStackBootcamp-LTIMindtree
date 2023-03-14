package com.day1;

public class ArrayTask {
	public static void main(String[] args) {
		int data[] = {12,-13,15,-77,91,22,-98};
		
		System.out.println("Odd Numbers");
		
		for(int i=0; i < data.length; i++) {
			if(data[i] > 0 && data[i]%2 != 0) {
				System.out.println(data[i]);
			}
		}
		
		System.out.println("Even Numbers");
		
		for(int i=0; i < data.length; i++) {
			if(data[i] > 0 && data[i]%2 == 0) {
				System.out.println(data[i]);
			}
		}
	}
}
