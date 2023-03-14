package com.roomservice;

import com.cleaning.CleaningService;
import com.restaurant.Restaurant;

public class RoomService {
	private Restaurant restaurant;
	private CleaningService cleaningService;

	public RoomService(CleaningService cleaningService) {
		super();
		this.cleaningService = cleaningService;
	}

	public RoomService(Restaurant restaurant) {
		super();
		this.restaurant = restaurant;
	}
	
	public String requestCleaing(int roomNumber){
		return cleaningService.clean(roomNumber);
	}
	
	public String placeOrder(String orderName) {
		return restaurant.prepareDish(orderName);
	}
	
}
