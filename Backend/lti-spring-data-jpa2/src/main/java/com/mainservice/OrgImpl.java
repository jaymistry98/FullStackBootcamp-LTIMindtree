package com.mainservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.model.Bank;
import com.model.Employee;
import com.model.Insurance;
import com.service.BankService;
import com.service.EmployeeService;
import com.service.InsuranceService;
@Service
public class OrgImpl implements JoinOrganization {
	
	@Autowired
	EmployeeService empService;
	
	@Autowired
	InsuranceService insService;
	
	@Autowired
	BankService bankService;
	
	
	@Override
	@Transactional
	public void joinOrg(Employee employee, Insurance insurance, Bank bank) {
		
		empService.addEmployee(employee);
		
		if(employee.getEmpName().equals("samuel2")) {
			throw new RuntimeException("Something went wrong");
		}
		
		insService.registerEmpInsurance(insurance);
		bankService.addBankAccount(bank);
		System.out.println("Method works");
		
	}
	
	@Override
	public void leaveOrg(int empid) {
		
		empService.deleteEmployee(empid);
		insService.deleteInsurance(empid);
		bankService.deleteBankAccount(empid);
		//System.out.println("Method runs");
		
	}

}
