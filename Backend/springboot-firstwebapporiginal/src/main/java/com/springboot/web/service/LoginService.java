package com.springboot.web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean validateUser(String name, String password) {
 		return name.equalsIgnoreCase("amarjeet")
				&& password.equalsIgnoreCase("dummy");
	}

}
