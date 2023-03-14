package com.dao;

import java.util.List;

import com.model.Employee;

public interface EmployeeDao {

	public void addEmployee(Employee employee);
	public List<Employee> loadEmployee();
	public Employee findEmployee(String name);
	public void deleteEmployee(int id);
	public void updateEmployee(int id, Employee employee);
}
