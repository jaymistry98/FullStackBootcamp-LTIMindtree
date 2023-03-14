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

import com.app.UserApp;
import com.model.User;

@Service
@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private UserApp app;
	
	/*
	 * @Autowired DataSource dataSource;
	 */
	
	/*
	 * @PostConstruct private void initConnection() { setDataSource(dataSource); }
	 */
	
	List<User> lst = new ArrayList<User>();
	
	@Override
	//@Transactional
	public void addUser(User user) {
		
		/*
		String insertStatement = "insert into user values(?,?,?,?)";
		getJdbcTemplate().update(insertStatement, new Object[] {user.getUname(), user.getPass(), user.getEmail(), user.getCity() });
		lst.add(user);
		//System.out.println(lst);
		*/
		app.save(user);
		
	}

	@Override
	public List<User> loadAll() {
		// TODO Auto-generated method stub
		/*
		String sql = "select * from user";
		List<Map<String, Object>> lst1 = getJdbcTemplate().queryForList(sql);
		
		List<User> result = new ArrayList<User>();
		
		for(Map<String, Object> row: lst1) {
			User usr = new User((int)row.get("uname"),(String)row.get("pass"),(String)row.get("email"),(String)row.get("city"));
			result.add(usr);
		}
		return result;
		//return lst;
		*/
		return (List<User>) app.findAll();
	}

	@Override
	public boolean findUser(String name) {
		// TODO Auto-generated method stub
	/*
		for(User usr:lst) {
			if(usr.getUname().equals(name)) {
				System.out.println(usr.getEmail());
				return true;
			}
		}
		return false;
	*/
		Optional<User> opt = app.findById(name);
		if (opt.isPresent()) {
			return true;
		}
		return false;
	
	}

	@Override
	public boolean deleteUser(String name) {
		// TODO Auto-generated method stub
		Optional<User> opt = app.findById(name); 
			  if(opt.isPresent()) { 
				  //lst.remove(usr); 
				  app.deleteById(name);
				  return true; 
		      }
		 
		  return false;
		 
		
	}

	@Override
	public boolean updateUser(String name, User user) {
	
		for(User usr : lst) {
			if(/*usr.getUname()== name*/usr.getUname().equals(name)) {
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
