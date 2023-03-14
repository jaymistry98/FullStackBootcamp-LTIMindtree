package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank {
	
	@Id
	public int empId;
	
	public int accNo;
	public int initialBalance;
	public String typeofAccount;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public int getInitialBalance() {
		return initialBalance;
	}
	public void setInitialBalance(int initialBalance) {
		this.initialBalance = initialBalance;
	}
	public String getTypeofAccount() {
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
