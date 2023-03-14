package com.dao;

import org.springframework.stereotype.Repository;

import com.model.User;
import com.model.Users;

@Repository
public class EmployeeDAO {

	private static Users list= new Users();
	
	
	static {
		list.getUserList().add(new User("alex", "alex@123", "alex@mail.com", "London"));
		list.getUserList().add(new User("David", "david@123", "david@mail.com", "newyork"));
		list.getUserList().add(new User("sam", "sam@123", "sam@mail.com", "mumbai"));
        list.getUserList().add(new User("sana", "sana@123", "sana@mail.com", "paris"));
        }
	public Users getAllUsers() {
		return list;
	}
	
	public void addUser(User user) {
		list.getUserList().add(user);
	}
	
}
