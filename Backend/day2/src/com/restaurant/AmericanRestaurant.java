package com.restaurant;

public class AmericanRestaurant implements Restaurant {

	@Override
	public String prepareDish(String dishName) {
		
		return "preparing " + dishName + " with lots of cheese and pineapple.";
	}

}
