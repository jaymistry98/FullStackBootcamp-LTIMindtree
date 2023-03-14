package com.client;

import java.util.List;

import com.dao.StudentDAO;
import com.dao.StudentManagement;
import com.model.Student;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(101,"adam", 9237229);
		Student s2 = new Student(102,"jay", 9237229);
		Student s3 = new Student(103,"sam", 9237229);
		
		StudentDAO dao = new StudentManagement();
		dao.addStudent(s1);
		dao.addStudent(s2);
		dao.addStudent(s3);
		
		dao.deleteStudent(102);
		dao.updateStudent(103, "alina", 9999999);
		
		System.out.println("Loading all students.");
		
		List<Student> data = dao.loadStudents();
		for(Student st: data) {
			System.out.println(st);
		}
		
		System.out.println("Finding student");
		
		Student stud = dao.findStudent(103);
		System.out.println(stud.getStudentName());
		
		
	}

}
