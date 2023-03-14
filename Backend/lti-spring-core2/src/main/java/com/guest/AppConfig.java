package com.guest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.restaurant.AmericanRestaurant;
import com.restaurant.IndianRestaurant;
import com.restaurant.ItalianRestaurant;
import com.roomservice.RoomService;

@Configuration
//@ComponentScan("com")
public class AppConfig {
	
	@Bean
	@Lazy
	public IndianRestaurant ind() {
		return new IndianRestaurant();
	}
	
	@Bean
	@Lazy
	public AmericanRestaurant ame() {
		return new AmericanRestaurant();
	}
	
	@Bean
	@Lazy
	public ItalianRestaurant ital() {
		return new ItalianRestaurant();
	}
	
	@Bean
	@Lazy
	public RoomService service() {
		return new RoomService(ame());
	}
}
