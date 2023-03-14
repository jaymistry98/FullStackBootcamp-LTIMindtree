package com.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class UserAppMain {

	ArrayList<Users> al = new ArrayList<Users>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UserAppMain().printUsers();

	}

	void printUsers() {
		getUsers();
		Collections.sort(al, new ProjectSort());
		for (Users us : al)
			System.out.println(us);
	}

	void getUsers() {
		File file = new File("users.txt");
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = br.readLine()) != null) {
				addUsers(line);
			}

		} catch (Exception e) {

			// e.printStackTrace();
		}
	}

	void addUsers(String lineToParse) {
		String[] tokens = lineToParse.split("/");
		Users users = new Users(tokens[0], tokens[1], tokens[2], tokens[3]);
		al.add(users);
	}

}
