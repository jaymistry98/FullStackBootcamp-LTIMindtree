package com.collectiondemos;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Employee> al = new TreeSet<Employee>();
		
		al.add(new Employee(103, "adam", "science"));
		al.add(new Employee(101, "sam", "phy"));
		al.add(new Employee(102, "ira", "chem"));
		al.add(new Employee(102, "ira", "chem"));
		al.add(new Employee(103, "adam", "science"));
		
		for(Employee emp: al) {
			System.out.println(emp);
		}
		
		System.out.println(al.size());
	}

}
