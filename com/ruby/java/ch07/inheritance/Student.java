package com.ruby.java.ch07.inheritance;

public class Student extends Person {
	private String major;

	/*
	 * private int age; private String name;
	 * 
	 * public String getname() { return name; }
	 * 
	 * public void setname(String name) { this.name = name; }
	 * 
	 * public int getage() { return age; }
	 * 
	 * public void setage(int age) { this.age = age; }
	 */
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
/*	public String toString( ) {
		return "major =" +major;}*/
}
