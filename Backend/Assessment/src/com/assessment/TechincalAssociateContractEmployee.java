package com.assessment;

public class TechincalAssociateContractEmployee extends Employee {

	private double wage;
	private double hours;

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public TechincalAssociateContractEmployee() {
		super();
	}

	public TechincalAssociateContractEmployee(int empId, String empName, double wage, double hours) {
		super(empId, empName);
		this.wage = wage;
		this.hours = hours;
	}

	@Override
	public String toString() {
		return "TechincalAssociateContractEmployee [wage=" + wage + ", hours=" + hours + "]";
	}

	@Override
	public double getSalary() {
		if (hours <= 40) {
			return wage * hours;
		} else {
			return (40 * wage) + ((hours - 40) * wage * 2);
		}
	}

	@Override
	public void getMedicalCoverage() {
		System.out.println("Your Medical Coverage is : $0");
	}

}
