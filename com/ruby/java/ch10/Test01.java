package com.ruby.java.ch10;

import java.util.ArrayList;

public class Test01 {
	public static void main(String[] args){
		ArrayList<String> as = new ArrayList<String>();
		as.add("서울"); as.add("북경"); as.add("상해");
		as.add("서울"); as.add("도쿄"); as.add("뉴욕");
		
		for(int i=0; i<as.size(); i++) {
			System.out.println(as.get(i));
		}
		as.add("런던"); as.add("로마"); as.add("방콕");
		as.add("북경"); as.add("도쿄"); as.add("서울");
		System.out.println("1:"+as);
	}
}
	