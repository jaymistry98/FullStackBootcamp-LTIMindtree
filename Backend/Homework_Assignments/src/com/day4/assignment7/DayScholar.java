package com.day4.assignment7;

public class DayScholar extends Student {
	private String residentialAddress;
	
	public void setResidentialAddress(String resAddress) {
		this.residentialAddress = resAddress;
	}
	
	public void getDetails() {
		super.getDetails();
		System.out.println("Residential Address:" + residentialAddress);
	}

	public DayScholar(int studentId, char studentType, String studentName, int semesterFees, String residentialAddress) {
		super();
		this.studentId = studentId;
		this.studentType = studentType;
		this.studentName = studentName;
		this.residentialAddress = residentialAddress;
	}

	public DayScholar() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
