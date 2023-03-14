package com.inheritence;

public class ContractEmployee extends Employee {

	public ContractEmployee(int empId, String empName) {
		super(empId, empName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void takesLeaves() {
		// TODO Auto-generated method stub
		System.out.println("Contract Employee takes leave.");
	}

	@Override
	public void assignProject() {
		// TODO Auto-generated method stub
		System.out.println("Contract Employee assigned to project.");
	}

}
