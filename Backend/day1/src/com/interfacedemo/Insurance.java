package com.interfacedemo;

public interface Insurance {
	public void BuyInsurance();
	public void ClaimInsurance();
	
	public default void CheckInsurance() {
		System.out.println("Insurance valid");
	}
}
