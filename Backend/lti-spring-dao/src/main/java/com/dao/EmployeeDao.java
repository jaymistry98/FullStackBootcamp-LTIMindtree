package com.dao;

import java.util.List;

import com.model.Employee;

public interface EmployeeDao {

	public void addEmployee(Employee employee);
	public List<Employee> loadEmployee();
	public Employee findEmployee(String name);
	public int deleteEmployee(int id);
	//public int updateEmployee(int id, Employee employee);
}
