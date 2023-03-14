package com.day4.assignment5;

public class DayScholar extends PostGradStudent{
	private String residentialAddress;
	private double fees = 0;

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
	
	public void calculateFees() {
		fees = this.getPostCoursefees()/ 6;
	}
	
	public double getFees() {
		return fees;
	}
	
	
	
	public DayScholar(int studentId, char studentType, String studentName, int postCourseId, String postCourseName,
			int postCoursefees) {
		super(studentId, studentType, studentName, postCourseId, postCourseName, postCoursefees);
		// TODO Auto-generated constructor stub
	}

	public DayScholar(int studentId, char studentType, String studentName) {
		super(studentId, studentType, studentName);
		// TODO Auto-generated constructor stub
	}

	public DayScholar(String residentialAddress, double fees) {
		super();
		this.residentialAddress = residentialAddress;
		this.fees = fees;
	}

	
}
