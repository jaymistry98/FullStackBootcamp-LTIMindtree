package com.dao;

import org.springframework.stereotype.Component;

import ch.qos.logback.core.util.SystemInfo;

@Component("wi")
public class WelcomeImpl implements WelcomeAOP{

	@Override
	public String sayWelcome(String name) {
		
		return "Welcome " + name;
	}

	@Override
	public int Add(int a, int b) {
		// TODO Auto-generated method stub
		if(a==10) throw new NumberFormatException("value is incorrect");
		return (a+b) ;
	}

	@Override
	public void sayHi() {
		// TODO Auto-generated method stub
		System.out.println("Hi.....");
	}

}
