package com.inheritence;

public class PermanentEmployee extends Employee {

	public PermanentEmployee(int empId, String empName) {
		super(empId, empName);
	}

	@Override
	public void takesLeaves() {
		// TODO Auto-generated method stub
		System.out.println("Permanent Employee takes leave.");
	}

	@Override
	public void assignProject() {
		// TODO Auto-generated method stub
		System.out.println("Permanent Employee assigned to project.");
	}

}
