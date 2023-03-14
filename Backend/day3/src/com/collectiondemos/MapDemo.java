package com.collectiondemos;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, Employee> hm = new HashMap<Integer, Employee>();
		
		hm.put(2020, new Employee(103, "adam", "science"));
		hm.put(2021, new Employee(101, "sam", "phy"));
		hm.put(2022, new Employee(102, "ira", "chem"));
		
		System.out.println(hm.get(2022));

	}

}
