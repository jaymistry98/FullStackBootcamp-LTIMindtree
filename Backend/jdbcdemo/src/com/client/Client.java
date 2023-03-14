package com.client;

import java.util.List;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;
import com.model.Employee;

public class Client {

	public static void main(String[] args) {

		Employee emp = new Employee(101, "admin", "Delhi");
		Employee emp2 = new Employee(102, "qa", "Mumbai");

		EmployeeDao ed = new EmployeeDaoImpl();

		ed.addEmployee(emp);
		ed.addEmployee(emp2);
		
		//Load the employee
		//List<Employee> data = ed.loadEmployee();
		
		//for (Employee em: data)
			//System.out.println(em);
		
		//Employee em = ed.findEmployee("qa");
		//System.out.println(em);
		
		//ed.deleteEmployee(102);
		
		//ed.updateEmployee(101, new Employee(101, "QA", "NYC"));

	}

}
