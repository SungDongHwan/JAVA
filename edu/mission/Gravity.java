package edu.mission;

public class Gravity {

//	public static void main(String[] args) {
//	
//		double a = 9.81;
//		int t = 5;
//		int v0 = 0;
//		int x0 = 0;
//		System.out.println(1000-gravity(a,t,v0,x0));
//	}
//	
//	
//	 public static double gravity(double a,int t,int v0,int x0) {
//		return 0.5*a*t*t+v0*t+x0;
//	 }

	public static void main(String[] args) {

		Gravity gg = new Gravity();
		
		double a = 9.81;
		double t = 10;
		
		int v0 = 0;
		int x0 = 0;
		if(t==0)
		 {
			 return;
		 }
		 
		else
		{
			t -= 0.5;
			System.out.println(t+"초후"+(1000-gg.gravity(a,t,v0,x0)));
		}

		System.out.println(1000-gg.gravity(a,t,v0,x0));
	}
	
	
	 public double gravity(double a,double t,int v0,int x0) {
		return 0.5*a*t*t+v0*t+x0;
	 }

}

		


