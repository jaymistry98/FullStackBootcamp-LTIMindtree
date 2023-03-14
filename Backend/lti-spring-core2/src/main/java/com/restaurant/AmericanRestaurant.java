package com.restaurant;

import org.springframework.stereotype.Component;

//@Component(value = "ame")
public class AmericanRestaurant implements Restaurant {

	@Override
	public String prepareDish(String dishName) {
		
		return "preparing " + dishName + " with lots of cheese and pineapple.";
	}
	
	public AmericanRestaurant() {
		System.out.println("Inside American");
	}

}
