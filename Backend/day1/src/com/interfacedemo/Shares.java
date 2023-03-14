package com.interfacedemo;

public interface Shares {
	public void buyshares();
	public void sellshares();
	
	public default void shareDetailes(){
		System.out.println("You bought shares of $VTI");
	}
}
