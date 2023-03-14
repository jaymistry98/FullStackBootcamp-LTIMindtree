package com.day4.assignment8;

public class StudentMain {

	public static void main(String[] args) {
		
		/*
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
		*/
		Student stu;
		if(args[0].equals("Hostelite")) {
			stu = new Hostelite(101, 'F', "Joel", 690, "Mission Main", 35);
		}
		else {
			stu = new DayScholar(101, 'F', "Joel", 690, "230 Fifth");
		}
		stu.calculateFees(1200.0);
		stu.displayStudentDetails();
	}

}
