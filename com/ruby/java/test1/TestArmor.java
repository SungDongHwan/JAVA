package com.ruby.java.test1;
	class Armor2{
		private String name;
		private int height;
		public int takeoff(int value) {
			System.out.println("엔진 시동: value =  "+ value);
			return value -50;
		}
	}
public class TestArmor {
	static void Test(int ... v) {
		System.out.print(v.length+ " : ");
		for (int x : v)
			System.out.print(x + " "); 
		System.out.println();
	}
	double speed;
	public void speedup(double value){
		double speed = value;
	}
	public void speedup(double value, int maxValue) {
		double speed = value;
		int maxSpeed = maxValue;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Armor2 a = new Armor2();
		n = a.takeoff(100);
		System.out.println("n= "+ n);
		
		Test(1);
		Test(1,2,3,4);
		
	}

}
