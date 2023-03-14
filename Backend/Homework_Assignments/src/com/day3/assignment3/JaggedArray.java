package com.day3.assignment3;

public class JaggedArray {
	
	static String[][] tutorial = {{"Tony", "Java", "C", "C++"},
			{"Thomas", "Java", "UNIX"},
			{"Dinil","Linux", "Oracle"},
			{"Delvin", "RDBMS", "C#", "ORACLE"}};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=3; i>2; i--)
			for(int j =0; j<4;j++)
				System.out.print(tutorial[i][j] + " ");
		}
	}


