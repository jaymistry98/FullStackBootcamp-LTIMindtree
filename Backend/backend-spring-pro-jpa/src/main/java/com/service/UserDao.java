package com.service;

import java.util.List;

import com.model.User;

public interface UserDao {
	
	public void addUser(User user);
	public List<User> loadAll();
	public boolean deleteUser(int id);
	public void updateUser(int id, User user);
	//public String checkUser(String uname, String pass);
	//public boolean findUser(String name);
	
}
