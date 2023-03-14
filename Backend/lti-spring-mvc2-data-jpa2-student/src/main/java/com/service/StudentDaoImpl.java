package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.app.StudentApp;
import com.model.Student;

@Service
@Repository
public class StudentDaoImpl implements StudentDao{
	
	@Autowired
	private StudentApp app;
	
	List<Student> lst = new ArrayList<Student>();

	@Override
	//@Transactional
	public void addStudent(Student stu) {
		app.save(stu);	
	}

	@Override
	public List<Student> loadAll() {
		return (List<Student>) app.findAll();
	}

	@Override
	public boolean findStudent(int rollNo) {
		
		Optional<Student> opt = app.findById(rollNo);
		if (opt.isPresent()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteStudent(int rollNo) {
		Optional<Student> opt = app.findById(rollNo); 
		  if(opt.isPresent()) { 
			  //lst.remove(usr); 
			  app.deleteById(rollNo);
			  return true; 
	      }
	  return false;
	}

	@Override
	public boolean updateStudent(int rollNo, Student stu) {
		for(Student st : lst) {
			if(st.getRollNo()== rollNo) {
				st.setRollNo(stu.getRollNo());
				st.setName(stu.getName());
				st.setSubject(stu.getSubject());
				st.setSchoolName(stu.getSchoolName());
				return true;
			}
		}
		return false;
	}

}
