package com.interfacedemo;

public class HSBCBank implements Bank{

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposited in HSBC Bank");
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Withdrew from HSBC Bank");
	}
	
}
