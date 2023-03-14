package com.day4.assignment1;

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
	}

}
