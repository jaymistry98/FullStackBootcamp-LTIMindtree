package com.assessment;

public class ProjectManagers extends PermanentEmployee {

	public ProjectManagers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProjectManagers(int empId, String empName, int noOfExperience) {
		super(empId, empName, noOfExperience, 0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSalary() {
		return 10000 * this.getNoOfExperience();
	}

	@Override
	public void getMedicalCoverage() {
		System.out.println("Your Medical Coverage is: $" + getSalary());
	}

}
