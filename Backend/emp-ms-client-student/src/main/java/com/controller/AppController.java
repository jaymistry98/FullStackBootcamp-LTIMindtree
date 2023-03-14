package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 import com.delegate.AppDelegate;
 
@RestController
@RequestMapping("/company")
public class AppController {
	@Autowired
	private AppDelegate dao;
	
	@GetMapping("/loadstudents")
	public String loadStudents(

	) {
		return dao.loadStudents();
	}
	

}
