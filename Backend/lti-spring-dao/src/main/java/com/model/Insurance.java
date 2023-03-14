package com.model;

public class Insurance {
	
	private int empId;
	private String schemeName;
	private int coverageAmount;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getSchemeName() {
		return schemeName;
	}
	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}
	public int getCoverageAmount() {
		return coverageAmount;
	}
	public void setCoverageAmount(int coverageAmount) {
		this.coverageAmount = coverageAmount;
	}
	
	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Insurance(int empId, String schemeName, int coverageAmount) {
		super();
		this.empId = empId;
		this.schemeName = schemeName;
		this.coverageAmount = coverageAmount;
	}
	
	@Override
	public String toString() {
		return "Insurance [empId=" + empId + ", schemeName=" + schemeName + ", coverageAmount=" + coverageAmount + "]";
	}
	
	
}
