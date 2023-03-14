package com.day3.assignment4;

public class Student {
	
	private int studentId;
	private char studentType;
	private String studentName;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public char getStudentType() {
		return studentType;
	}
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	public void setStudentName(String firstName, String lastName) {
		this.studentName = firstName + lastName;
	}
	public String getStudentName() {
		return studentName;
	}
	
	public Student(int studentId, char studentType, String firstName, String lastName) {
		super();
		this.studentId = studentId;
		this.studentType = studentType;
		this.studentName = firstName + lastName;
	}
	
	public Student() {
		super();
		this.studentId = 10;
		this.studentType = 'F';
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentType=" + studentType + "]";
	}
	
	public static void main(String[] args) {
		Student student = new Student();
		Student student2 = new Student(101,'L',"Jay","Mistry");
		
		int id = 102;
		char type = 'F';
		String fname = "Joel";
		String lname = "Gaikwad";
		
		student.setStudentId(id);
		student.setStudentName(fname, lname);
		student.setStudentType(type);
		
		System.out.println(student.getStudentId());
		System.out.println(student.getStudentType());
		System.out.println(student.getStudentName());
	
		System.out.println(student2.getStudentId());
		System.out.println(student2.getStudentType());
		System.out.println(student2.getStudentName());
	}
	
}
