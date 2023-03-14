package com.dao;

import java.util.LinkedList;
import java.util.List;

import com.model.Student;

public class StudentManagement implements StudentDAO {
	
	LinkedList<Student> lst;
	
	public StudentManagement() {
		lst = new LinkedList<Student>();
	}
	
	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		if ( !checkStudent(student.getStudentId())) {
			lst.add(student);
		}
		else {
			System.out.println("Record already exists.");
		}
		
	}

	@Override
	public boolean checkStudent(int id) {
		// TODO Auto-generated method stub
		for (Student stu: lst) {
			if(stu.getStudentId() == id) {
				System.out.println(stu);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Student> loadStudents() {
		// TODO Auto-generated method stub
		return lst;
	}

	@Override
	public Student findStudent(int id) {
		// TODO Auto-generated method stub
		for (Student stu: lst) {
			if(stu.getStudentId() == id) {
				//System.out.println(stu);
				return stu;
			}
		}
		return null;
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		for(Student st: lst) {
			if(st.getStudentId() == id) {
				lst.remove(st);
			}
		}
		
	}

	@Override
	public void updateStudent(int id, String name, int contact) {
		// TODO Auto-generated method stub
		if(checkStudent(id)) {
			Student stu = findStudent(id);
			stu.setStudentName(name);
			stu.setContactNo(contact);
			System.out.println("Student Updated.");
		}
	}
	
	

}
