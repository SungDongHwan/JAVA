package edu;

public class Test38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= new int[3][3];
		int[][] b= new int[3][3];
		int[][] c= new int[3][3];
		int[][] d= new int[3][3];
			
		System.out.println();
		System.out.println("행렬 a");
		
			for(int i =0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					double rnum = Math.random();
					int num = (int) (rnum*10);
					a[i][j] = num++;
					System.out.print(a[i][j]);
					System.out.print("\t");
				}
				System.out.println("\n");
			}
			System.out.println();
			System.out.println("행렬 b");
			for(int i =0; i < b.length; i++) {
				for (int j = 0; j < b[i].length; j++) {
					double rnum = Math.random();
					int num = (int) (rnum*10);
					a[i][j] = num++;
					System.out.print(a[i][j]);
					System.out.print("\t");
				}
				System.out.println("\n");
			}
			//c = a+b 행렬 더하기
			System.out.println();
			System.out.println("행렬 c");
			
			for (int i=0; i < c.length; i++) {
				for(int j = 0; j<c[i].length; i++) {
					c[i][j]=a[i][j] + b[i][j];
					System.out.print(" " + c[i][j]);
					System.out.print("\t");
				}
				System.out.println("\n");
				}
			
			for (int i=0; i < a.length; i++) {
				for(int j = 0; j <a[i].length; i++) { 
						int sum=0;
						for (int k =0; k< a[i].length; k++)
							sum+= a[i][k] * b[i][k];
						d[i][j]	= sum;
						System.out.print(" " + d[i][j]);
						System.out.print("\t");
					}
					System.out.println("\n");
					}
				}
				
		
}


		
		

	


