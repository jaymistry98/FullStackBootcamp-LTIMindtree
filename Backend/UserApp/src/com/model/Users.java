package com.model;

public class Users {
	private String uname;
	private String email;
	private String city;
	private String project;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public Users(String uname, String email, String city, String project) {
		super();
		this.uname = uname;
		this.email = email;
		this.city = city;
		this.project = project;
	}

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Users [uname=" + uname + ", email=" + email + ", city=" + city + ", project=" + project + "]";
	}

}
