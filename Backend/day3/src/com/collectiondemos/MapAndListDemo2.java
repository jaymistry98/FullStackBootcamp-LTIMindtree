package com.collectiondemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapAndListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, ArrayList<Employee>> map = new HashMap<String, ArrayList<Employee>>();
		
		map.put("USA", new ArrayList<Employee>(Arrays.asList(new Employee(103, "adam", "science"), new Employee(105, "jay", "cs") )));
		map.put("UK", new ArrayList<Employee>(Arrays.asList(new Employee(101, "sam", "phy"), new Employee(106, "ali", "bio"))));
		map.put("INDIA", new ArrayList<Employee>(Arrays.asList(new Employee(102, "ira", "chem"))));
		
		for(Map.Entry<String, ArrayList<Employee>> entry :map.entrySet()) {
			System.out.println("Getting the employee from " + entry.getKey());
			
			//Collections.sort(entry.getValue(), new NameSort()); //Sort By empName
			
			for(Employee emp: entry.getValue()) {
				System.out.println(emp);
			}
			System.out.println("-------------");
		}
	}

}
