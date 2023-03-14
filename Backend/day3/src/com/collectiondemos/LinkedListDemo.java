package com.collectiondemos;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Employee> al = new LinkedList<Employee>();
		
		al.add(new Employee(103, "adam", "science"));
		al.add(new Employee(101, "sam", "phy"));
		al.add(new Employee(102, "ira", "chem"));
		
		al.addFirst(new Employee(109, "ir", "maths"));
		al.addLast(new Employee(106, "uty", "maths2"));
		
		al.removeFirst();
		al.removeLast();
		
		//Collections.sort(al, new IdSort());
		//Collections.sort(al, new NameSort());
		//Collections.sort(al, new DepartmentSort());
		
		for(Employee emp: al) {
			System.out.println(emp);
		}
		
		System.out.println(al.size());
	}

}
