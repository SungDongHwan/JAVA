package com.ruby.java.ch09;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "한국,일본,중국,미국,독일,프랑스";
		String[] list = s.split(",");
		String[] list2 = s.split(",",3);
		
		for (String item : list) {
			System.out.println(item);
		}
		System.out.println("====================");
		for (String item : list2) {
			System.out.println(item);
		}
		/*System.out.println("====================");*/
		String r="=".repeat(15);
		System.out.println(r);
		
		String email = "himmysky@pusan.ac.kr";
		int e = email.indexOf("@");
		
		String id = email.substring(0,e);
		String company = email.substring(e+1);
		System.out.println(id);
		System.out.println(company);
	}

}
