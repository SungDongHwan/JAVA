package edu.mission;

import java.util.Scanner;

public class bank_answer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] exchange= {50000,10000,5000,1000};
		Scanner sc = new Scanner(System.in);
		int money;
		System.out.println("지불 금액을 입력하세요 : ");
		money=sc.nextInt();
		System.out.println(money+"원");
		
		for(int i=0; i<exchange.length; i++ ) {
			System.out.println(exchange[i]+"원" + "\t" + money/exchange[i]+"장");
			money %= exchange[i];		}
	}

}