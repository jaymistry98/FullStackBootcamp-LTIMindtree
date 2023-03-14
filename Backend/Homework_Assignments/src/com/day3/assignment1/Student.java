package com.day3.assignment1;

public class Student {
	private static int studentId = 549;
	private char studentType;
	private String studentName;
	private static int studentCount = 0;
	
	public Student() {
		studentCount++;
		studentId = studentCount;
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
	
	public static int getStudentCount() {
		return studentCount;
	}
	
	static {
		studentCount = 10;
	}
	
	public static void main(String[] args) {
		Student studentOne = new Student('D', "Bony", "Thomas");
		studentOne.displayDetails(studentOne);
		
		Student studentTwo = new Student('H', "Dinil", "Bose");
		studentTwo.displayDetails(studentTwo);
	}
	
	
}
