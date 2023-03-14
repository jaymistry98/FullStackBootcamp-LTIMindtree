package com.restaurant;

public class IndianRestaurant implements Restaurant{

	@Override
	public String prepareDish(String dishName) {
		
		return "preparing " + dishName + " with Indian spices."; 
	}

}
