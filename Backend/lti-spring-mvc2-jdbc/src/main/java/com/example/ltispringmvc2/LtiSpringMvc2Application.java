package com.example.ltispringmvc2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.model.User;
import com.service.UserDao;
import com.service.UserDaoImpl;



@ComponentScan("com")
@SpringBootApplication
public class LtiSpringMvc2Application {
	
	//@Autowired
	//UserDaoImpl userdao;
	
	public static void main(String[] args) {
		SpringApplication.run(LtiSpringMvc2Application.class, args);
		
		/*
		ApplicationContext ctx=	SpringApplication.run(LtiSpringMvc2Application.class, args);
		UserDao dao= ctx.getBean(UserDao.class);
		
		List<User> lst = dao.loadAll();
		for(User usr2: lst) {
			System.out.println(usr2);
		}
		*/
	}
	
	

}
