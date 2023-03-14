package com.day3.assignment7;

public class Student {
	
	private int studentId;
	private char studentType;
	private String studentName;
	private String residentialStatus;
	private long feesPerMonth;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public char getStudentType() {
		return studentType;
	}
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	public void setStudentName(String firstName, String lastName) {
		this.studentName = firstName + lastName;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setResidentialStatus(String residentialStatus) {
		this.residentialStatus = residentialStatus;
	}
	public String getResidentialStatus() {
		return residentialStatus;
	}
	public long getFees() {
		return feesPerMonth;
	}
	public Student(int studentId, String firstName, String lastName, String residentialStatus, long feesPerMonth) {
		super();
		this.studentId = studentId;
		this.residentialStatus = residentialStatus;
		this.studentName = firstName + lastName;
		this.feesPerMonth = feesPerMonth;
	}
	
	public Student() {
		super();
		this.studentId = 10;
		this.studentType = 'F';
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentType=" + studentType + "]";
	}
	
	public static void main(String[] args) {
		Student student = new Student();
		Student student2 = new Student(Integer.parseInt(args[0]),args[1],args[2],args[3], Long.parseLong(args[4]));
		
		int id = 102;
		char type = 'F';
		String fname = "Joel";
		String lname = "Gaikwad";
		
		student.setStudentId(id);
		student.setStudentName(fname, lname);
		student.setStudentType(type);
		
		System.out.println(student.getStudentId());
		System.out.println(student.getStudentType());
		System.out.println(student.getStudentName());
	
		System.out.println(student2.getStudentId());
		System.out.println(student2.getStudentName());
		System.out.println(student2.getResidentialStatus());
		System.out.println(student2.getFees());
	}
	
}
