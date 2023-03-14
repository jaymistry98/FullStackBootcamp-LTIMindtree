package com.interfacedemo;

public interface Bank {
	public void deposit();
	public void withdraw();
	
	public default void checkBalance() {
		System.out.println("Balance check");
	}
}
