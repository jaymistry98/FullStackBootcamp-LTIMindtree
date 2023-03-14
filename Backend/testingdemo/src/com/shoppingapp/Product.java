package com.shoppingapp;

public class Product {
	
	private String title;
	private int price;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [title=" + title + ", price=" + price + "]";
	}
	
	
}
