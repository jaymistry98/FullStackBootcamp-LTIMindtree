package com.model;

public class Bank {
	
	public static int empId;
	public static int accNo;
	public static int initialBalance;
	public static String typeofAccount;
	
	public static int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public static int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public static int getInitialBalance() {
		return initialBalance;
	}
	public void setInitialBalance(int initialBalance) {
		this.initialBalance = initialBalance;
	}
	public static String getTypeofAccount() {
		return typeofAccount;
	}
	public void setTypeofAccount(String typeofAccount) {
		this.typeofAccount = typeofAccount;
	}
	
	public Bank(int empId, int accNo, int initialBalance, String typeofAccount) {
		super();
		this.empId = empId;
		this.accNo = accNo;
		this.initialBalance = initialBalance;
		this.typeofAccount = typeofAccount;
	}
	
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Bank [empId=" + empId + ", accNo=" + accNo + ", initialBalance=" + initialBalance + ", typeofAccount="
				+ typeofAccount + "]";
		
		
	}
	
	
}
