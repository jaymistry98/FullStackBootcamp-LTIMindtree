package com.guest;

import com.factory.CleaningServiceFactory;
import com.factory.RestaurantFactory;
import com.roomservice.RoomService;

public class Guest {

	public static void main(String[] args) {
		
		RoomService roomService = new RoomService(RestaurantFactory.createObject('i'));
		RoomService roomService2 = new RoomService(RestaurantFactory.createObject('a'));
		
		System.out.println(roomService.placeOrder("Butter Chicken"));
		System.out.println(roomService2.placeOrder("Pizza"));
		
		RoomService roomService3 = new RoomService(CleaningServiceFactory.createObject('r'));
		System.out.println(roomService3.requestCleaing(211));
		
		RoomService roomService4 = new RoomService(CleaningServiceFactory.createObject('b'));
		System.out.println(roomService4.requestCleaing(220));

	}

}
