package edu.mission;

import java.util.Scanner;


public class Decimal {
	public static void Discrim(int num) {
		System.out.println("입력숫자:"+num);
		int i =2;
			if( i<num && num%i != 0 ) {
				System.out.println("숫자가 소수입니다.");
			}else{ 
				System.out.println("숫자가 소수가 아닙니다."+i);
				
			}
			i++;
		}
	
		

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("number :");
			int num;
			while ((num = sc.nextInt()) !=0) {
				Discrim(num);
				num--;
				System.out.println("Number = " + num);
			}
		}
		System.out.println("프로그램을 종료합니다.");

	}

}
