package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.model.User;

@Service
public class UserDaoImpl extends JdbcDaoSupport implements UserDao {
	
	@Autowired
	DataSource dataSource;
	
	@PostConstruct 
	private void initConnection() { 
		setDataSource(dataSource); 
	}
	
	List<User> lst = new ArrayList<User>();
	
	@Override
	@Transactional
	public void addUser(User user) {
		
		String insertStatement = "insert into user values(?,?,?,?)";
		getJdbcTemplate().update(insertStatement, new Object[] {user.getUname(), user.getPass(), user.getEmail(), user.getCity() });
		lst.add(user);
		//System.out.println(lst);
		
	}

	@Override
	public List<User> loadAll() {
		// TODO Auto-generated method stub
		String sql = "select * from user";
		List<Map<String, Object>> lst1 = getJdbcTemplate().queryForList(sql);
		
		List<User> result = new ArrayList<User>();
		
		for(Map<String, Object> row: lst1) {
			User usr = new User((String)row.get("uname"),(String)row.get("pass"),(String)row.get("email"),(String)row.get("city"));
			result.add(usr);
		}
		return result;
		//return lst;
	}

	@Override
	public boolean findUser(String name) {
		// TODO Auto-generated method stub
		for(User usr:lst) {
			if(usr.getUname().equals(name)) {
				System.out.println(usr.getEmail());
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteUser(String name) {
		// TODO Auto-generated method stub
		for(User usr:lst) {
			if(usr.getUname().equals(name)) {
				lst.remove(usr);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean updateUser(String name, User user) {
	
		for(User usr : lst) {
			if(usr.getUname().equals(name)) {
				usr.setUname(user.getUname());
				usr.setEmail(user.getEmail());
				usr.setPass(user.getPass());
				usr.setCity(user.getCity());
				return true;
			}
		}
		return false;
		
	}
	
	/*
	@Override
	public String checkUser(User user) {
		// TODO Auto-generated method stub
		if(user.getUname().equals("admin") && user.getPass().equals("admin123")) {
			return "login valid";
		}
		return "login failed";
	}*/
	
	

}
