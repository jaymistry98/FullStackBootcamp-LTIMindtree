package com.shoppingapp;

import java.util.ArrayList;
import java.util.Iterator;

public class ShoppingCart {
	
	private ArrayList<Product> items;
	
	public ShoppingCart() {
		items = new ArrayList<Product>();
	}
	
	public void addItem(Product product) {
		items.add(product);
	}
	
	public int getItemCount() {
		return items.size();
	}
	
	public double getBalance() {
		double balance = 0;
		for(Iterator itr = items.iterator(); itr.hasNext();) {
			Product item = (Product)itr.next();
			balance += item.getPrice();
		}
		return balance;
	}
	
	public void removeProduct(Product item) {
		items.remove(item);
	}
	
	public void empty() {
		items.clear();
	}
}
