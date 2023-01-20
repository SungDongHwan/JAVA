package com.ruby.java.ch07.inheritance;

public class Employee extends Person {
	/*
	 * private String name; private int age;
	 */
	private String dept;

	public Employee(String name, int age, String dept) {
		/*
		 * super.setName(name); super.setAge(age);
		 */		
		super(name,age);

		this.dept = dept;

		System.out.println("Employee(name, age, dept) 생성자 실행! ");
	}

	/*
	 * public String getname() { return name; }
	 * 
	 * public void setname(String name) { this.name = name; }
	 * 
	 * public int getage() { return age; }
	 * 
	 * public void setage(int age) { this.age = age; }
	 */
	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	public String toStrinng() {
		/*
		 * return name+":"+dept+age;//
		 */	
		return super.toString()+dept;/* 상위객체의 toString을 호출하는것으로, 오버라이딩된 toString 과는 다르다. */
	}
}