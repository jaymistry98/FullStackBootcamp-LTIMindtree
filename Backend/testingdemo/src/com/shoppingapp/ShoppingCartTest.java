package com.shoppingapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
//import org.junit.*;

public class ShoppingCartTest {
	
	private static ShoppingCart cart;
	
	private Product book1;
	private Product book2;
	
	@BeforeAll
	public static void callBeforeAll() {
		cart = new ShoppingCart();
	}
	
	@BeforeEach
	public void callBeforeTest() {
		book1 = new Product("Java Book", 100);
		book2 = new Product("Oracle Book", 200);
		cart.addItem(book1);
		cart.addItem(book2);
	}
	
	@Test
	public void testAdd() {
		Product p3 = new Product("mobile", 445);
		cart.addItem(p3);
		//cart.removeProduct(p3);
		cart.empty();
		assertEquals(0, cart.getItemCount());
	}
	
	@Test
	public void testCheckBalance() {
		Product p3 = new Product("mobile", 445);
		cart.addItem(p3);
		double expectedBalance = book1.getPrice() + book2.getPrice() + p3.getPrice();
		assertEquals(expectedBalance, cart.getBalance());
	}
}
