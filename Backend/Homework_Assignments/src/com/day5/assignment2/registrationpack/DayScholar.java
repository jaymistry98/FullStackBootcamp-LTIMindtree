package com.day5.assignment2.registrationpack;

import com.day5.assignment2.studentpack.Student;

public class DayScholar extends Student {
	private String residentialAddress;
	
	public void setResAddress(String resAddress) {
		this.residentialAddress = resAddress;
	}
	public void getDetails() {
		System.out.println("Student ID: " + studentId);
		System.out.println("Student Type: " + studentType);
		System.out.println("Student Name: " + studentName);
	}
}
