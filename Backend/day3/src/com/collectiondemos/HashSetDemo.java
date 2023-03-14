package com.collectiondemos;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//HashSet<Employee> al = new HashSet<Employee>();
		LinkedHashSet<Employee> al = new LinkedHashSet<Employee>();
		
		al.add(new Employee(103, "adam", "science"));
		al.add(new Employee(101, "sam", "phy"));
		al.add(new Employee(102, "ira", "chem"));
		
		for(Employee emp: al) {
			System.out.println(emp);
		}
		
		//System.out.println(al.size());
	}

}
