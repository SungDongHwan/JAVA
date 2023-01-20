package edu.mission;

import java.util.Scanner;

public class googoodan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  Gugudan gg = new Gugudan(); gg printGugudan(2);
		 */	
		int col;

		try(Scanner scanner= new Scanner(System.in)){
			System.out.println("Column: ");
			col = scanner.nextInt();
		}catch (Exception e) {
			return;
		}
		
		System.out.println("-".repeat(30));
		
		if (col <1 || 9<col) {
			System.out.println("col is not valid");
			return;
		}
		
		  for(int i=2; i <= 10; i+=col) {
			  System.out.println("\t");
			  for(int j=1; j<10;j++) {
				  for (int k =0 ; k< col; k++) {
					  
					  if(10<= i+k) {
						  System.out.println("\n");
						  break;
					  }
					  System.out.printf("%d*%d=%2d", (i+k),j,(i+k)*j);/*칸 맞춰주는 거*/
					 if (k < col-1) System.out.print("\t");
					 else		  System.out.print("\n");
					  
		/* int a = j;
		  int c = a*i;
		  System.out.println(a+"*"+i+"="+c);}*/
		 
		}}
	}
}
}


