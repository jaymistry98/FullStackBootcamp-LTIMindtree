package com.day4.assignment6;

public class DayScholar extends Student {
	private String residentialAddress;
	
	public void setResidentialAddress(String resAddress) {
		this.residentialAddress = resAddress;
	}
	
	public void getDetails() {
		super.getDetails();
		System.out.println("Student Name: " + studentName);
		System.out.println("Residential Address:" + residentialAddress);
	}
}
