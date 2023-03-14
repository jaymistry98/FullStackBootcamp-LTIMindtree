package com.day4.assignment2;

public class Student {
	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected String residentialStatus;
	protected double feesPerMonth;
	
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
	public void setResidentialStatus(String residentialStatus) {
		this.residentialStatus = residentialStatus;
	}
	public String getResidentialStatus() {
		return residentialStatus;
	}
	public void setFeesPerMonth(double feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}
	public double getFeesPerMonth() {
		return feesPerMonth;
	}
	/*
	public void calculateFees(double semesterFees) {
		feesPerMonth = semesterFees / 6.0;
	}
	
	public void calculateFees(double semesterFees, double hostelFees) {
		feesPerMonth = semesterFees / 6.0;
		feesPerMonth = feesPerMonth + hostelFees;
	}
	*/
	public Student(int studentId, char studentType, String studentName, double feesPerMonth) {
		super();
		this.studentId = studentId;
		this.studentType = studentType;
		this.studentName = studentName;
		this.feesPerMonth = feesPerMonth;

	}
	
	public Student() {
		super();
		//this.studentId = 10;
		//this.studentType = 'F';
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentType=" + studentType + ", studentName=" + studentName
				+ ", feesPerMonth=" + feesPerMonth + "]";
	}
	
	
}
