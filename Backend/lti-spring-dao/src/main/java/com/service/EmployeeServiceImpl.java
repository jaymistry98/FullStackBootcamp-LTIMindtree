package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeDao;
import com.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeDao dao;
	
	@Override
	public void addEmployee(Employee employee) {
		dao.addEmployee(employee);
		
	}

	@Override
	public List<Employee> loadEmployee() {
		// TODO Auto-generated method stub
		return dao.loadEmployee();
	}

	@Override
	public Employee findEmployee(String name) {
		// TODO Auto-generated method stub
		return dao.findEmployee(name);
	}

	@Override
	public int deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return dao.deleteEmployee(id);
	}
	/*
	@Override
	public int updateEmployee(int id, Employee employee) {
		// TODO Auto-generated method stub
		return dao.updateEmployee(id, employee);
	}
	*/
}
