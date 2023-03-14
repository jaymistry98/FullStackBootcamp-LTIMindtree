package com.service;

import java.util.List;

import com.model.Student;

public interface StudentDao {

	public void addStudent(Student stu);
	//public String checkStudent(Student stu);
	public List<Student> loadAll();
	public boolean findStudent(int rollNo);
	public boolean deleteStudent(int rollNo);
	public boolean updateStudent(int rollNo, Student stu);
}
