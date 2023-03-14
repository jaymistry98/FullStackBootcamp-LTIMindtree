package com.service;

import java.util.List;

import com.model.Employee;

public interface EmployeeService {
	public void addEmployee(Employee employee);
	public List<Employee> loadEmployee();
	public Employee findEmployee(String name);
	public int deleteEmployee(int id);
	//public int updateEmployee(int id, Employee employee);
}
