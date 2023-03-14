package com.factory;

import com.restaurant.AmericanRestaurant;
import com.restaurant.IndianRestaurant;
import com.restaurant.Restaurant;

public class RestaurantFactory {
	public static Restaurant createObject(char type){
		switch(type) {
		
		case 'i': return new IndianRestaurant();
		case 'a': return new AmericanRestaurant();		
		}
		return null;
	}
}
