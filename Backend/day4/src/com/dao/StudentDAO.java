package com.dao;

import java.util.List;

import com.model.Student;

public interface StudentDAO {
	public void addStudent(Student student);
	public boolean checkStudent(int id);
	public List<Student> loadStudents();
	public Student findStudent(int id);
	public void deleteStudent(int id);
	public void updateStudent(int id, String name, int contact);
}
