package com.interfacedemo;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new HSBCBank();
		
		Insurance bank2 = new JPMCBank();
		
		Shares shr = new JPMCBank();
		
		bank.deposit();
		bank2.BuyInsurance();
		shr.buyshares();
		
		bank.checkBalance();
		bank2.CheckInsurance();
		shr.shareDetailes();
	}

}
