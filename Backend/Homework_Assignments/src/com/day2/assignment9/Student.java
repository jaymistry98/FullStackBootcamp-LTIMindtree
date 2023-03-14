package com.day2.assignment9;

public class Student {
	private static int studentId = 549;
	private char studentType;
	private String studentName;
	
	public Student() {
		studentId++;
	}
	
	public Student(char sType, String fname, String lname) {
		this();
		this.studentType = sType;
		this.studentName = fname + " " + lname;

	}
	
	public void displayDetails (Student student) {
		
		System.out.println(studentId);
		System.out.println(student.studentType);
		System.out.println(student.studentName);
	}
	
	public static void main(String[] args) {
		Student studentOne = new Student('D', "Bony", "Thomas");
		studentOne.displayDetails(studentOne);
		
		Student studentTwo = new Student('H', "Dinil", "Bose");
		studentTwo.displayDetails(studentTwo);
	}
	
	
}
