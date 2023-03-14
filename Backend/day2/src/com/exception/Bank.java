package com.exception;

public class Bank {
	private int initialBalance = 1000;
	
	public void withdraw(int amount) {
		if (amount > 200 || amount > this.initialBalance) {
			throw new ArithmeticException("Insufficient Funds.");
		} else {
			this.initialBalance = this.initialBalance - amount;
			System.out.println("You withdrew $" + amount + " and your balance is $" + this.initialBalance);
		}
	}
	
	public void deposit(int amount) {
		this.initialBalance = this.initialBalance + amount;
		System.out.println("You deposited $" + amount + " and your balance is $" + this.initialBalance);
	}
	
	public void checkBalance() {
		System.out.println("Your balance is $" + this.initialBalance);
	}
	
	
}
