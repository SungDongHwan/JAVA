package com.ruby.java.ch09;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		//메모리 상의 주소가 아니라 객체의 대표값을 만들어서 메모리에 접근할떄 써먹는값 //
		
		Class c = obj1.getClass();
		
		System.out.println(c.getName());
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
	
		MyObject obj4 = new MyObject(123);
		MyObject obj5 = new MyObject(123);

		System.out.println(obj4);
		
		if(obj4.equals(obj5)) {
			System.out.println("동일 객체이다.");
		}
		else {
			System.out.println("다른 객체이다.");
		}
		
		if (obj4 == obj5) {
			System.out.println("동일 객체이다.");
		}else {
			System.out.println("다른 객체이다.");
		}
	}

}
