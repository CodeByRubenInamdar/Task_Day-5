package com.demo.clas;

public class Teacher {
	private String techer_name;
	private String techer_city;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(String techer_name, String techer_city) {
		super();
		this.techer_name = techer_name;
		this.techer_city = techer_city;
	}

	public String getTecher_name() {
		return techer_name;
	}

	public void setTecher_name(String techer_name) {
		this.techer_name = techer_name;
	}

	public String getTecher_city() {
		return techer_city;
	}

	public void setTecher_city(String techer_city) {
		this.techer_city = techer_city;
	}

	@Override
	public String toString() {
		return "Teacher [techer_name=" + techer_name + ", techer_city=" + techer_city + "]";
	}

}
