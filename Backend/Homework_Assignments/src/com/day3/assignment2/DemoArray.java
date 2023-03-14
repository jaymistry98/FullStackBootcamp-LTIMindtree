package com.day3.assignment2;

public class DemoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstArrayMatrix[][] = {{1,1,1},{1,1,1}};
		int secondArrayMatrix[][] = {{2,2,2},{2,2,2}};
		
		System.out.println("Matrix 1");
		for(int i =0; i < 2; i++) {
			for(int j =0; j < 3; j++) {
				System.out.print(firstArrayMatrix[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("Matrix 2");
		for(int i =0; i < 2; i++) {
			for(int j =0; j < 3; j++) {
				System.out.print(secondArrayMatrix[i][j]);
			}
			System.out.println();
		}
		
		int sumArrayMatrix[][] = new int [2][3];
		System.out.println("Sum of the Matrices");
		for(int i =0; i < 2; i++) {
			for(int j =0; j < 3; j++) {
				sumArrayMatrix[i][j] = firstArrayMatrix[i][j] + secondArrayMatrix[i][j];
				System.out.print(sumArrayMatrix[i][j]);
			}
			System.out.println();
		}
	}

}
