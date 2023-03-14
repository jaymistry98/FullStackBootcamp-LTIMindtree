package com.day2.assignment7;
import com.day2.assignment4.Student;

public class passByVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student sId = new Student();
		sId.setStudentId(25);
		passByVal val = new passByVal();
		val.passTheValueMethod(sId);
		System.out.println(sId.getStudentId());
		System.out.println("The sId are " + sId.getStudentId());
	}
	
	public void passTheValueMethod(Student sId) {
		sId.setStudentId(10);
		System.out.println("The sId are " + sId.getStudentId());
	}

}
