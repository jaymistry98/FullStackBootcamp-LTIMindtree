package com.day4.assignment5;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DayScholar dayscholar = new DayScholar();
		dayscholar.setStudentId(5);
		dayscholar.setPostCourseName("OOP");
		dayscholar.setPostCoursefees(16000);
		dayscholar.setPostCourseId(1001);
		dayscholar.setStudentName("Manu", null);
		dayscholar.setResidentialAddress("NO 32/3 Vijaynagar");
		System.out.println(dayscholar.getPostCourseId());
		System.out.println(dayscholar.getPostCourseName());
		dayscholar.calculateFees();
		System.out.println(dayscholar.getFees());
	}

}
