package com.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.exception.UserNotFoundException;
import com.model.User;
import com.repo.UserRepo;
import com.service.UserDao;

@RestController
@RequestMapping("/mainapp")
@CrossOrigin(origins = "http://localhost:4200/")
public class AppController {

	@Autowired
	private UserDao dao;
	
	@Autowired
	private UserRepo app;
	
	@PostMapping("/register")
	public String registerUser(@RequestBody User user) {
		dao.addUser(user);
		return "user added";
	}
	
	@PostMapping("/loginvalid")
	public boolean loginValid(@RequestBody User user) {
		
		for(User usr: app.findAll()) {
			if(usr.getUname().equals(user.getUname()) && usr.getPass().equals(user.getPass())) {
				return true;
			}
		}
		return false;
		
	}
	
	@GetMapping("/loadusers")
	public List<User> loadAll(){
		return dao.loadAll();
	}
	
	@DeleteMapping("/user/{id}")
	public String deleteUser(@PathVariable int id) {
		if(dao.deleteUser(id)) {
			return "User with " + id + " is deleted";
		}
		else {
			return "user not found";
		}
		
	}
	
	@PutMapping("/user/{id}")
	public String updateUser(@PathVariable int id, @RequestBody User user) {
		
		dao.updateUser(id, user);
			
		return "user info updated";
	}
	
	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable int id) {
		return app.findById(id)
				.orElseThrow(() -> new UserNotFoundException(id));
	}
	
	
	
	
	
	/*
	
	@GetMapping("/finduser/{name}")
	public String findUser(@PathVariable String name) {
		if(dao.findUser(name)) {
			return name + " found";
		}
		return "user not found";
	}
	
	
	
	*/
	
	
}