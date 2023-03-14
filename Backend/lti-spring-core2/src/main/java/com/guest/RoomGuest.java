package com.guest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.roomservice.RoomService;

public class RoomGuest {

	public static void main(String[] args) {
		
		//ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		RoomService rs = (RoomService)ctx.getBean("service");
		
		System.out.println(rs.placeOrder("Pasta"));
		
		ctx.close();
	}

}
