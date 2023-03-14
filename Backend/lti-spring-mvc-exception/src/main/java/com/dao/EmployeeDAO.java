package com.dao;


import org.springframework.stereotype.Repository;

import com.model.User;
import com.model.Users;

@Repository
public class EmployeeDAO {

	private static Users list = new Users();
	
	static {
		list.getUserList().add(new User("alex", "alex@123", "alex@mail.com", "London"));
		list.getUserList().add(new User("david", "david@123", "david@mail.com", "New York"));
		list.getUserList().add(new User("jay", "jay@123", "jay@mail.com", "Mumbai"));
		list.getUserList().add(new User("sana", "sana@123", "sana@mail.com", "Delhi"));	
	}
	
	public Users getAllUsers() {
		return list;
	}
	
	public void addUser(User user) {
		list.getUserList().add(user);
	}
}
