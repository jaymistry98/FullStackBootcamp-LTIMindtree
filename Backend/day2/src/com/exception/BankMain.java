package com.exception;

public class BankMain {

	public static void main(String[] args) {
		Bank jpm = new Bank();
		jpm.withdraw(100);
		jpm.deposit(200);
		jpm.checkBalance();

	}

}
