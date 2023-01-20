package com.ruby.java.ch09;

import java.util.Calendar;
import java.util.Date;

public class Test17 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d);

		for (int i = 0; i<10 ; i++) {
		Calendar c = Calendar.getInstance();
		
		
		 System.out.print(c.get(Calendar.YEAR)+"년");
		 System.out.print(c.get(Calendar.MONTH)+1+"월");
		 System.out.print(c.get(Calendar.DAY_OF_MONTH)+"일");
		 System.out.print(c.get(Calendar.HOUR)+"시");
		 System.out.print(c.get(Calendar.MINUTE)+"분");
		 System.out.print(c.get(Calendar.SECOND)+"초");
		 System.out.println("");
			
			Thread.sleep(1000);
			 		}
		
	}

}
