package com.interfacedemo;

public class JPMCBank implements Bank, Insurance,Shares{

	@Override
	public void BuyInsurance() {
		// TODO Auto-generated method stub
		System.out.println("Bought Insurance from JPMC");
	}

	@Override
	public void ClaimInsurance() {
		// TODO Auto-generated method stub
		System.out.println("Claimed Insurance from JPMC");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposited in JPMC");
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Withdrew from JPMC");
	}

	@Override
	public void buyshares() {
		// TODO Auto-generated method stub
		System.out.println("Bought shares of the stock.");
	}

	@Override
	public void sellshares() {
		// TODO Auto-generated method stub
		System.out.println("Sold shares of the stock.");
	}

}
