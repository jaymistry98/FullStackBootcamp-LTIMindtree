package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.exception.UserNotFoundException;
//import com.app.UserApp;
import com.model.User;
import com.repo.UserRepo;

@Service
@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private UserRepo app;
	
	/*
	 * @Autowired DataSource dataSource;
	 */
	
	/*
	 * @PostConstruct private void initConnection() { setDataSource(dataSource); }
	 */
	
	List<User> lst = new ArrayList<User>();
	
	@Override
	@Transactional
	public void addUser(User user) {
		
		app.save(user);
		
	}

	@Override
	public List<User> loadAll() {
		
		return (List<User>) app.findAll();
	}
	
	@Override
	public boolean deleteUser(int id) {
		 
		if(!app.existsById(id)) {
			throw new UserNotFoundException(id);
		}
		app.deleteById(id);
		return true;
	
	}
	
	@Override
	public void updateUser(int id, User user) {
		
		app.findById(id)
		.map(usr -> {
			usr.setUname(user.getUname());
			usr.setEmail(user.getEmail());
			usr.setPass(user.getPass());
			usr.setCity(user.getCity());
			return app.save(usr);
		}).orElseThrow (() -> new UserNotFoundException(id));
		
	}
	/*
	@Override
	public String checkUser(String uname, String pass) {
		
		for(User usr: app.findAll()) {
			if(usr.getUname().equals(uname) && usr.getPass().equals(pass)) {
				return "login valid";
			}
		}
		return "login failed";
	}
	*/
	

	/*
	@Override
	public boolean findUser(String name) {
		// TODO Auto-generated method stub
		Optional<User> opt = app.findById(name);
		if (opt.isPresent()) {
			return true;
		}
		return false;
	
	}

	
		 
		
	}

	
	
	
	
	*/
	

}
