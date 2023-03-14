package com.day4.assignment3;

public class DayScholar extends Student{
	private String residentialAddress;

	public String getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}

	public DayScholar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DayScholar(int studentId, char studentType, String studentName, double feesPerMonth) {
		super(studentId, studentType, studentName, feesPerMonth);
		// TODO Auto-generated constructor stub
	}

	public DayScholar(int studentId, char studentType, String studentName, double feesPerMonth,
			String residentialAddress) {
		super(studentId, studentType, studentName, feesPerMonth);
		this.residentialAddress = residentialAddress;
	}
	
	public void displayStudentDetails() {
		super.displayStudentDetails();
		System.out.println("residentialAddress" + residentialAddress);
	}
}
