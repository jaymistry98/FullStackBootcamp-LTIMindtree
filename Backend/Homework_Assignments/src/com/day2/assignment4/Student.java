package com.day2.assignment4;

public class Student {
	
	private int studentId;
	private char studentType;
	
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
	
	public Student(int studentId, char studentType) {
		super();
		this.studentId = studentId;
		this.studentType = studentType;
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
	
}
