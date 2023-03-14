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

import com.delegate.AppDelegate;


@RestController
@RequestMapping("/company")
public class AppController {

	@Autowired
	private AppDelegate dao;
	
	@GetMapping(value = "/loademp")
	public String loadAll()
	{
		return dao.loadUsers();
	}
	
	@GetMapping(value = "/loademp2")
	public String loadAll2()
	{
		return dao.loadUsers2();
	}
	
}