package com.CaseStudy1;

public class MinAccountBalValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Acount acc = new Acount();
		
		acc.setAccNo(42069);
		acc.setCustName("Jay");
		acc.setAccAmount(5000);
		
		if (acc.getAccAmount() < 500) {
			System.out.println("The balance is below minimum value");
		}
		else {
			System.out.println("The balance is $" + acc.getAccAmount());
		}
	}

}
