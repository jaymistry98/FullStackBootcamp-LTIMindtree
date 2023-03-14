package com.restaurant;

import org.springframework.stereotype.Component;

//@Component(value = "ital")
public class ItalianRestaurant implements Restaurant {

	@Override
	public String prepareDish(String dishName) {
		
		return "preparing " + dishName + " with alfredo sauce and chicken.";
	}
	
	public ItalianRestaurant() {
		System.out.println("Inside Italian");
	}

}

