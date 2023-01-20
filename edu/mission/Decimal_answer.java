package edu.mission;

public class Decimal_answer {
	public static Boolean prime(int num) {
		for (int i = 2; i<num ; i++) {
			if(num%1 == 0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(args[0]);
		if (prime(num) == true) System.out.println("Prime");
		else					System.out.println("Not Prime")
		;
		System.out.println("Done");
	}

}
