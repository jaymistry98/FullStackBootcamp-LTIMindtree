package com.pack.ltispringcore;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.mainservice.JoinOrganization;
import com.model.Bank;
import com.model.Employee;
import com.model.Insurance;
import com.service.EmployeeService;

@SpringBootApplication
@ComponentScan("com")
//@EnableAspectJAutoProxy
public class LtiSpringCoreApplication {
	
	@Autowired
	EmployeeService employeeService;

	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(LtiSpringCoreApplication.class, args);
		JoinOrganization employeeService= ctx.getBean(JoinOrganization.class);
		
		
		//Employee emp1= new Employee(101, "sachin", "Delhi");
		Employee emp2 = new Employee(102, "samuel", "Delhi");
		//Employee emp3 = new Employee(103, "qa", "Mumbai");
		
		Insurance insurance = new Insurance(102,"family floater", 234567);
		
		Bank bank = new Bank(102, 929431, 1000, "savings");
		
		//employeeService.addEmployee(emp1);
		//employeeService.addEmployee(emp2);
		//employeeService.addEmployee(emp3);
		
		employeeService.joinOrg(emp2, insurance, bank);
		
		//employeeService.leaveOrg(102);
		
		/*
		List<Employee> lst = employeeService.loadEmployee();
		for(Employee em: lst) {
			System.out.println(em);
		}
		*/
		
		//Employee em = employeeService.findEmployee("qa");
		//System.out.println(em);
		
		//employeeService.deleteEmployee(101);
		
		//employeeService.updateEmployee(102, new Employee(102, "QA", "NYC"));
	}

}
