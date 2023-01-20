package edu.mission;

import java.util.Scanner;

public class Array_add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요");
		int num1 = scanner.nextInt();
		System.out.println("두번째 정수를 입력하세요");
		int num2 = scanner.nextInt();
		int max = 0;
		int min = 0;
		 if(num2 >= num1) {
				max =  num2;
				min =  num1;
		 }else if(num2 < num1) {	
			max = num1;
			min = num2;
		 }
		 int rem = max/min;
		 int a = 0;
		 int b = 0;
		 
	
}
}
		



