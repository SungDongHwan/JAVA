package com.ruby.java.ch07.inheritance;

public class LMSTest {
	public static void main(String[] args) {
		Employee e = new Employee("성동환", 22, "코딩");

		e.setName("오정임");
		e.setAge(47);
		e.setDept("입학처");

		System.out.println(e.toString());

		Professor p = new Professor("성동환", 33, "자바");

		p.setName("김푸름");
		p.setAge(52);
		p.setSubject("빅데이터");

		System.out.println(p.toString());

		Student s = new Student();

		s.setName("김유빈");
		s.setAge(20);
		s.setMajor("컴퓨터과학");
		
		System.out.println(s.toString());


		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());
	}
}