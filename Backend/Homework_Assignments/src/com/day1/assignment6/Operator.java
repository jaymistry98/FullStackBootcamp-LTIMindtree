package com.day1.assignment6;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intVal = 10;
		float floatVal = 3.0f;
		boolean bool1 = true;
		boolean bool2 = false;
		boolean bool3 = true;
		
		//Arithematic: Modulus operator
		System.out.println("Arithematic");
		System.out.println(intVal + " % " + floatVal + "=" + (intVal % floatVal));
		System.out.println();
		
		//String Concatenation: Observe the difference
		System.out.println("String Concatenated");
		System.out.println("Day " + 2 + " Session");
		System.out.println("\n" + 2 + 3 + "\n" + (2+3));
		System.out.println();
		
		//Relational: Equality operator
		System.out.println("Relational");
		System.out.println(intVal + " == " + floatVal + " = " + (intVal==floatVal));
		floatVal = 10.0f;
		System.out.println(intVal + " == " + floatVal + 
				" = " + (intVal == floatVal));
		System.out.println();
		
		bool2 = false;
		
		if(bool1 || (bool1 && (bool2 = false))) {
			System.out.println("Success");
		}
		else {
			System.out.println("Failure");
		}
		System.out.println("bool2 value : " + bool2);
	}

}
