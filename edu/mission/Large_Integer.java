package edu.mission;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;


public class Large_Integer {

	public static void main(String[] args) {
		// input 에서 숫자들을 문자열로 가져오기 
		BufferedReader br;
		try {br = new BufferedReader(new FileReader("input.txt"));
		//배열을 만들기
		ArrayList<String> list = new ArrayList<String>();
		//큰 정수를 줄별로 자르기
			String str;
			while((str = br.readLine()) !=null) {
		// 어레이 리스트 에다가 자른것을 집어넣기
				list.add(str);
				System.out.println(str);}
		// 어레이리스트에다가 자른것들을 순서와 int 형으로 바꾸기
			
		// 두개를 더하고 10이 넘어가는것으로 다음 배열로 넘겨서 +1로 작성
			
		// 정리된 배열을 output data로 정리 
			
			
			return;
		
		}catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		
		
	}

}
