package edu.mission;

public class bank {

	public static void main(String[] args) {
		int tot = 292220;
		int Oman = 50000;
		int man = 10000;
		int ochen = 5000;
		int chen = 1000;
		
		int oman1 =	tot/Oman;
		int oman2 = tot%Oman;
		int change1 = (tot-Oman*oman1)+oman2;
		int man1 = change1/man;
		int man2 = change1%man;
		int change2 = (change1-man*man1)+man2;
		int ochen1 = change2/ochen;
		int ochen2 = change2%ochen;
		int change3 = (change2-ochen*ochen1)+ochen2;
		int chen1 = change3/chen;
		int chen2 = change3%chen;
		int change = (change3-chen*chen1)+chen2;
		
		System.out.println("오만원권"+oman1+"장"+"만원권"+man1+"장"+"오천원권"+ochen1+"장"+"천원권"+chen1+"장" );
		
		
		
		

	}

}
