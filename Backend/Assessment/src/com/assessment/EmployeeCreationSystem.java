package com.assessment;

public class EmployeeCreationSystem {

	public static void main(String[] args) {
		
		PermanentEmployee emp1 = new ProjectManagers(101, "Jay", 4);
		PermanentEmployee emp2 = new TechnicalAssociate(102, "Sam", 2, 4);
		TechincalAssociateContractEmployee emp3 = new TechincalAssociateContractEmployee(103, "Will", 50, 45);
		
		System.out.println(emp1.getSalary());
		System.out.println(emp2.getSalary());
		System.out.println(emp3.getSalary());
		
		System.out.println();
		
		emp1.getMedicalCoverage();
		emp2.getMedicalCoverage();
		emp3.getMedicalCoverage();
	}
}
