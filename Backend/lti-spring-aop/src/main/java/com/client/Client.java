package com.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dao.WelcomeAOP;
//import com.dao.WelcomeImpl;

public class Client {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		WelcomeAOP wi = (WelcomeAOP)ctx.getBean("wi");
		
		//System.out.println(wi.sayWelcome("Adam"));
		
		System.out.println(wi.Add(10, 20));
		
		//wi.sayHi();

	}

}
