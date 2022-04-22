package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1436 {

	public static void main(String[] args) throws IOException {
		/* 1    2     3     4     5     6     7     8     9     10    11
		   666, 1666, 2666, 3666, 4666, 5666, 6666, 7666, 8666, 9666, 10666
		 
		   -> 숫자(num)를 1씩 증가시켜서 해당 문자열에 '666'이 포함되어 있으면 몇번째인지(cnt++) 체크한다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int num = 666;
		int cnt = 1;
		
		// true, false 값으로 나옴
//		System.out.println(Integer.toString(num).contains("666"));
//		String.valueOf(num).contains("666") 과 동일 표현
		
		while(cnt != N) {
			num++;
			
//			// num을 String으로 변환하여 "666" 이 포함되어 있는지 검사
			if(Integer.toString(num).contains("666")) {
				cnt++;
			}	
		}
		System.out.println(num);
	}
}