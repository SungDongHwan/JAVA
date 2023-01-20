package com.ruby.java.ch07.inheritance;

public class Professor extends Person {
	
	private String subject;
	public Professor (String name, int age, String subject) {
		super (name, age);

		this.subject = subject;

				}

	/*
	 * private int age; private String name;
	 *//*
		 * public String getname() { return name; }
		 * 
		 * public void setname(String name) { this.name = name; }
		 * 
		 * public int getage() { return age; }
		 * 
		 * public void setage(int age) { this.age = age; }
		 */
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
}