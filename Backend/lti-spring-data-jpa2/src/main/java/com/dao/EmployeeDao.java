package com.dao;

import java.util.List;

import com.model.Employee;

public interface EmployeeDao {

	public void addEmployee(Employee employee);
	public List<Employee> loadEmployee();
	public Employee findEmployee(int empid);
	public void deleteEmployee(int empid);
	//public int updateEmployee(int id, Employee employee);
}
