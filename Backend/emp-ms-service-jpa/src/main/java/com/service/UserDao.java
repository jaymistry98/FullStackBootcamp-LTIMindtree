package com.service;

import java.util.List;

import com.model.User;

public interface UserDao {
	
	public void addUser(User user);
	//public String checkUser(User user);
	public List<User> loadAll();
	public boolean findUser(String name);
	public boolean deleteUser(String name);
	public boolean updateUser(String name, User user);
	
}
