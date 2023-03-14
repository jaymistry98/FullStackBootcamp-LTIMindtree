package com.day4.assignment7;

public class Student {
	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected final int semesterFees = 12000;
	protected int feesPerMonth;
	
	public void setStudentId(int sId) {
		this.studentId = sId;
	}
	
	public void setStudentType(char sType) {
		this.studentType = sType;
	}
	
	public void setStudentName(String sName) {
		this.studentName = sName;
	}
	
	public void calculateFees() {
		feesPerMonth = semesterFees / 6;
	}
	
	public void getDetails() {
		System.out.println("Student ID: " + studentId);
		System.out.println("Student Type: " + studentType);
		System.out.println("Student Name: " + studentName);
		System.out.println("Student Fees/Month: " + feesPerMonth);
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
}
