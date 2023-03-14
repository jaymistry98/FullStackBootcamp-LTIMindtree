package com.mainservice;

import com.model.Bank;
import com.model.Employee;
import com.model.Insurance;

public interface JoinOrganization {
	
	void joinOrg(Employee employee, Insurance insurance, Bank bank);
	void leaveOrg(int empid);
}
