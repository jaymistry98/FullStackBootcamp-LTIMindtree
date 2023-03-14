package com.inheritence;

public abstract class Employee {
	private int empId;
	private String empName;
	
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	public abstract void takesLeaves();

	public abstract void assignProject();
	
	public String applyAtten() {
		return "applied";
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
}
