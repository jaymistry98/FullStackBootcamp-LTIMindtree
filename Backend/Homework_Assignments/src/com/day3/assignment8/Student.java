package com.day3.assignment8;

public class Student {
	
	private int studentId;
	private char studentType;
	private String studentName;
	private String residentialStatus;
	private double feesPerMonth;
	
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
	public double getFees() {
		return feesPerMonth;
	}
	
	public void calculateFees(double semesterFees) {
		feesPerMonth = semesterFees / 6.0;
	}
	
	public void calculateFees(double semesterFees, double hostelFees) {
		feesPerMonth = semesterFees / 6.0;
		feesPerMonth = feesPerMonth + hostelFees;
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
		Student student = new Student(101, 'F', "Jay", "Mistry");
		
		student.setResidentialStatus("Hostelite");
		
		if(student.getResidentialStatus() == "Day Scholar") {
			student.calculateFees(5000);
		}
		else {
			student.calculateFees(5000, 80000);
		}
		
		
		System.out.println(student.getStudentId());
		System.out.println(student.getStudentType());
		System.out.println(student.getStudentName());
		System.out.println(student.getFees());
	}
	
}
