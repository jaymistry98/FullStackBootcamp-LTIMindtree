package com.day2.assignment4;

public class CourseManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student(101, 'F');
		Student student2 = new Student(201, 'L');
		int studentId = 102;
		char studentType = 'F';
		
		Student student3 = new Student();
		student3.setStudentId(studentId);
		student3.setStudentType(studentType);
		
		System.out.println(student3.getStudentId());
		System.out.println(student3.getStudentType());
		
		System.out.println(student2.getStudentId());
		System.out.println(student2.getStudentType());
		
		System.out.println(student1.getStudentId());
		System.out.println(student1.getStudentType());
		
		Student student = new Student();
		System.out.println(student.getStudentId());
		System.out.println(student.getStudentType());

	}

}
