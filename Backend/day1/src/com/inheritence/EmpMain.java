package com.inheritence;

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new PermanentEmployee(101, "admin");
		Employee emp2 = new ContractEmployee(102, "manager");
		
		emp.assignProject();
		emp2.assignProject();
		
		System.out.println(emp);
		System.out.println(emp2);
		
		System.out.println(emp.applyAtten());
	}

}
