package com.restaurant;

import org.springframework.stereotype.Component;

//@Component(value = "ind")
public class IndianRestaurant implements Restaurant{

	@Override
	public String prepareDish(String dishName) {
		
		return "preparing " + dishName + " with Indian spices."; 
	}
	
	public IndianRestaurant() {
		System.out.println("Inside Indian");
	}

}
