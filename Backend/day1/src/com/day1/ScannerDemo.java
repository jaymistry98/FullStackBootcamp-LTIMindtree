package com.day1;

import java.util.Scanner;

public class ScannerDemo {
	private static Scanner sc;
	
	public static void main(String[] args) {
		int size,i;
		sc = new Scanner(System.in);
		
		System.out.println("Enter Size: ");
		
		size = sc.nextInt();
		int data[] = new int[size];
		
		System.out.println("Enter Value: ");
		
		for(i=0; i < size; i++) {
			data[i] = sc.nextInt();
		}
		positiveData(data, size);
		negativeData(data, size);
		evenData(data, size);
		oddData(data ,size);
	}
	
	public static void positiveData(int[] psarr, int size) {
		
		System.out.println("Printing Positive Data");
		int i;
		for( i=0 ; i < size; i++) {
			if(psarr[i] >= 0) {
				System.out.println(psarr[i]);
			}
		}
	}
	
	public static void negativeData(int[] psarr, int size) {
		
		System.out.println("Printing Negative Data");
		int i;
		for( i=0 ; i < size; i++) {
			if(psarr[i] < 0) {
				System.out.println(psarr[i]);
			}
		}
	}
	
	public static void evenData(int[] psarr, int size) {
		
		System.out.println("Printing Even Data");
		int i;
		for( i=0 ; i < size; i++) {
			if(psarr[i] % 2 == 0) {
				System.out.println(psarr[i]);
			}
		}
	}
	
	public static void oddData(int[] psarr, int size) {
		
		System.out.println("Printing Odd Data");
		int i;
		for( i=0 ; i < size; i++) {
			if(psarr[i] % 2 != 0) {
				System.out.println(psarr[i]);
			}
		}
	}
}
