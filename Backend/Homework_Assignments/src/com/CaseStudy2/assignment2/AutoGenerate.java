package com.CaseStudy2.assignment2;

import java.util.ArrayList;

public class AutoGenerate {

	public static void main(String[] args) {
		
		StringBuilder ticket= new StringBuilder("115F");
		
		if(ticket.charAt(3) == 'F') {
			ticket.append("1020001");
		}
		
		else if(ticket.charAt(3) == 'T') {
			ticket.append("2020002");
		}
		else {
			ticket.append("3040003");
		}
		System.out.println(ticket.toString());
	}

}
