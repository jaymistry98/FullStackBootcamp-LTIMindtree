package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.EmployeeDAO;
import com.model.Users;

@RestController
@RequestMapping("/mainapp")
public class AppController {
	@Autowired
	private EmployeeDAO dao;
	
	@GetMapping(value = "/loadall")
	public Users loadAll() {
		return dao.getAllUsers();
	}

	
	
	
}
