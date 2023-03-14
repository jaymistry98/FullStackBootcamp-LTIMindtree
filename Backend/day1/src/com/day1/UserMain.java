package com.day1;

public class UserMain {
	public static void main(String[] args) {
		//Create a user object
		User user = new User();
		/*
		System.out.println(user.hashCode());
		
		User user2 = new User();
		System.out.println(user2.hashCode());
		
		user2 = user;
		System.out.println(user2.hashCode());
		*/
		
		user.setUserId(Integer.parseInt(args[0]));
		user.setUserName(args[1]);
		user.setUserEmail(args[2]);
		
		System.out.println(user.getUserId()+ " " + user.getUserName() + " " + user.getUserEmail());
		user = null;
		
	}
}
