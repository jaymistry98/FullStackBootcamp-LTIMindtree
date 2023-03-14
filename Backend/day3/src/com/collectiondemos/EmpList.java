package com.collectiondemos;

import java.util.ArrayList;
import java.util.Collections;

public class EmpList {
	
	public static boolean searchUser (String userName) {
		
		for(Employee Em: al) {
			if (Em.getEmpName().equals(userName)) {
				System.out.println(Em.getDepartment());
				return true;
			}
		}
		return false;
	}
	static ArrayList<Employee> al = new ArrayList<Employee>();
	
	public static void main(String[] args) {
		
		//ArrayList<Employee> al = new ArrayList<Employee>();
		
		al.add(new Employee(103, "adam", "science"));
		al.add(new Employee(101, "sam", "phy"));
		al.add(new Employee(102, "ira", "chem"));
		
		//al.remove(2);
		
		//Collections.sort(al, new IdSort());
		//Collections.sort(al, new NameSort());
		Collections.sort(al, new DepartmentSort());
		
		for(Employee emp: al) {
			System.out.println(emp);
		}
		
		System.out.println(al.size());
		
		searchUser("adam");
		
	}

}
