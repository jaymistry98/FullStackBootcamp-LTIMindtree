package com.CaseStudy2.assignment1;

public class Demo {

	public static void main(String[] args) {
		
		Travel travel = new Travel();
		travel.setModeOfTravel('F');
		travel.setNoOfTickets(3);
		
		double serviceCharge = 0;
		double TotalServiceCharge;
		
		if (travel.getModeOfTravel() == 'F') {
			serviceCharge = 500;
		}
		else if (travel.getModeOfTravel() == 'T') {
			serviceCharge = 100;
		}
		else if (travel.getModeOfTravel() == 'B') {
			serviceCharge = 50;
		}
		
		TotalServiceCharge = serviceCharge * travel.getNoOfTickets();
		
		travel.setAmount(TotalServiceCharge);
		
		System.out.println(travel.getAmount());

	}

}
