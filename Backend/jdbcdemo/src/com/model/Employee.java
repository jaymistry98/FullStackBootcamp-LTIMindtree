package com.model;

public class Employee {

	private int empId;
	private String name;
	private String city;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String name, String city) {
		super();
		this.empId = empId;
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", city=" + city + "]";
	}

}
