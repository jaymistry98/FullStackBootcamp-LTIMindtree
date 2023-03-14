package com.day4.assignment5;

public class PostGradStudent extends Student{
	
	private int postCourseId;
	private String postCourseName;
	private int postCoursefees;
	public int getPostCourseId() {
		return postCourseId;
	}
	public void setPostCourseId(int postCourseId) {
		this.postCourseId = postCourseId;
	}
	public String getPostCourseName() {
		return postCourseName;
	}
	public void setPostCourseName(String postCourseName) {
		this.postCourseName = postCourseName;
	}
	public int getPostCoursefees() {
		return postCoursefees;
	}
	public void setPostCoursefees(int postCoursefees) {
		this.postCoursefees = postCoursefees;
	}
	public PostGradStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PostGradStudent(int studentId, char studentType, String studentName) {
		super(studentId, studentType, studentName);
		// TODO Auto-generated constructor stub
	}
	public PostGradStudent(int studentId, char studentType, String studentName, int postCourseId, String postCourseName,
			int postCoursefees) {
		super(studentId, studentType, studentName);
		this.postCourseId = postCourseId;
		this.postCourseName = postCourseName;
		this.postCoursefees = postCoursefees;
	}
	@Override
	public String toString() {
		return "PostGradStudent [postCourseId=" + postCourseId + ", postCourseName=" + postCourseName
				+ ", postCoursefees=" + postCoursefees + "]";
	}
	
	
	
	
}
