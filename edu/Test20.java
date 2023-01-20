package edu;

public class Test20 {
	public static void main(String[] args){
		int Score=90;
		char grade;
		
		if(Score>=90) {
			grade = 'A';
		}
		else if(Score>=80) {
			grade = 'B';
		}
		else if(Score>=70) {
			grade = 'C';
		}
		else if(Score>=60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		System.out.println(grade);
		
	}

}
