package com.assessment;

public class TechnicalAssociate extends PermanentEmployee {

	public TechnicalAssociate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TechnicalAssociate(int empId, String empName, int noOfExperience, int noOfCertifications) {
		super(empId, empName, noOfExperience, noOfCertifications);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSalary() {
		return (5000*this.getNoOfExperience()) + (1000*this.getNoOfCertifications());
	}

	@Override
	public void getMedicalCoverage() {
		System.out.println("Your Medical Coverage is: $" + getSalary()*2);
	}
	
	
}
