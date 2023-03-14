package com.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;
import com.service.StudentDao;

@RestController
@RequestMapping("/mainapp")
public class AppController {

	@Autowired
	private StudentDao dao;
	
	
	//@RequestMapping(value = "/login", method = RequestMethod.POST)
	//@ResponseBody
	@PostMapping("/studentlogin")
	public String loginValid(@ModelAttribute Student stu) {
		
		if(stu.getRollNo() == 201 && stu.getName().equals("Jay")) {
			return "student login valid";
		}
		return "student login failed";
	}
	
	@PostMapping("/register")
	public String registerStudent(@ModelAttribute Student stu) {
		dao.addStudent(stu);
		return "student added";
	}
	
	@GetMapping("/loadstudents")
	public List<Student> loadAll(){
		return dao.loadAll();
	}
	
	@GetMapping("/findstudent/{rollNo}")
	public String findStudent(@PathVariable int rollNo) {
		if(dao.findStudent(rollNo)) {
			return rollNo + " found";
		}
		return "Student not found";
	}
	
	@GetMapping("/deletestudent/{rollNo}")
	public String deleteStudent(@PathVariable int rollNo) {
		if(dao.deleteStudent(rollNo)) {
			return rollNo + " deleted";
		}
		return "Student not found";
	}
	
	@PutMapping("/updatestudent/{rollNo}")
	public String updateStudent(@PathVariable int rollNo, @ModelAttribute Student stu) {
		
		dao.updateStudent(rollNo, stu);	
		return "Student info updated";
	}
	
	
	
	
}