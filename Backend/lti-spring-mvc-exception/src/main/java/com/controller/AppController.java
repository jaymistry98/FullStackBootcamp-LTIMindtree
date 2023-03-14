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
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.EmployeeDAO;
import com.model.User;
import com.model.Users;

@RestController
@RequestMapping("/mainapp")
public class AppController {

	@Autowired
	private EmployeeDAO dao;
	
	@GetMapping(value = "/loadusers", produces = "application/json")
	public Users loadAll(@RequestHeader (name = "X-COM-PERSIST", required = true) String headerPersist,
				@RequestHeader (name = "X-COM-LOCATION", defaultValue = "ASIA") String headerLocation)
	{
		return dao.getAllUsers();
	}
	
	/*
	@PostMapping("/login")
	public String loginValid(@ModelAttribute User user) {
		
		if(user.getUname().equals("admin") && user.getPass().equals("admin123")) {
			return "login valid";
		}
		//return dao.checkUser(user);
		return "login failed";
	}
	
	
	@PostMapping("/register")
	public String registerUser(@ModelAttribute User user) {
		dao.addUser(user);
		return "user added";
	}
	

	@GetMapping("/finduser/{name}")
	public String findUser(@PathVariable String name) {
		if(dao.findUser(name)) {
			return name + " found";
		}
		return "user not found";
	}
	
	@GetMapping("/deleteuser/{name}")
	public String deleteUser(@PathVariable String name) {
		if(dao.deleteUser(name)) {
			return name + " deleted";
		}
		return "user not found";
	}
	
	@PutMapping("/updateuser/{name}")
	public String updateUser(@PathVariable String name, @ModelAttribute User user) {
		
		dao.updateUser(name, user);
			
		return "user info updated";
	}
	
	*/
	
	
}