package com.assessment;

public class PermanentEmployee extends Employee {

	private int noOfExperience;
	private int noOfCertifications;

	public int getNoOfExperience() {
		return noOfExperience;
	}

	public void setNoOfExperience(int noOfExperience) {
		this.noOfExperience = noOfExperience;
	}

	public int getNoOfCertifications() {
		return noOfCertifications;
	}

	public void setNoOfCertifications(int noOfCertifications) {
		this.noOfCertifications = noOfCertifications;
	}

	public PermanentEmployee() {
		super();
	}

	public PermanentEmployee(int empId, String empName, int noOfExperience, int noOfCertifications) {
		super(empId, empName);
		this.noOfExperience = noOfExperience;
		this.noOfCertifications = noOfCertifications;
	}

	@Override
	public String toString() {
		return "PermanentEmployee [noOfExperience=" + noOfExperience + ", noOfCertifications=" + noOfCertifications
				+ "]";
	}

}
