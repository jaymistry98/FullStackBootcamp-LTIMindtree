package com.apexceptionapp;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class UserDaoImpl implements UserDao {

	@Override
	public void addUser(User user) throws DAOException {
		
		try {
			FileOutputStream fs = new FileOutputStream("C://mydata");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			throw new DAOException("Something went wrong, Please try again later.", e);
		}
		
	}

}
