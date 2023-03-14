package com.day4.assignment3;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hostelite student = new Hostelite(101, 'F', "Jay", 5000, "NYU", 301);
		
		System.out.println(student.getStudentId());
		System.out.println(student.getStudentName());
		System.out.println(student.getStudentType());
		System.out.println(student.getFeesPerMonth());
		System.out.println(student.getHostelName());
		System.out.println(student.getRoomNumber());
		
		DayScholar student2 = new DayScholar(102, 'L', "Joel", 5000);
		System.out.println(student2.getStudentId());
		System.out.println(student2.getStudentName());
		System.out.println(student2.getStudentType());
		System.out.println(student2.getFeesPerMonth());
	}

}
