package edu;

public class Test37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = { 80, 52, 77, 23, 100 };
		int sum = 0;
		double avg = 0.0;
		int max = 0;
		int min = 999;

		for (int i = 0; i < score.length; i++) {
			sum += score[i];
			if (max < score[i])
				;
			max = score[i];
			if (min > score[i])
				min = score[i];
		}
		avg = sum / score.length;
		System.out.println("총점 :" + sum);
		System.out.println("평균 :" + avg);
		System.out.println("최댓값 :" + max);
		System.out.println("최솟값 :" + min);
		
		
		
	}

}
