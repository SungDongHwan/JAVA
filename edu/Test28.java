package edu;
//실행 멈추고 반복문 탎출하기; break문을 사용
public class Test28 {
	public static void main(String[]args) {
		int cnt	=0;
		while(true) {
			System.out.println("OK");
			cnt = cnt+2;
			if(cnt ==10) {
				break;
			}
		}
	}

}
