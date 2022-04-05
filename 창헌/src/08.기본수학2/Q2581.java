package 기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2581 {

	public static void main(String[] args) throws IOException {
		/* 기존 Q1978 소수 구하기 메소드 활용
		   int 배열을 만들어야되나 고민했음
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		int sum = 0;
		int min = N; // 최소값
		
		for(int i=M; i<=N; i++) {
			if(is_Prime(i) == true) {
				sum += i;
				if(min > i) {
					min = i;
				}
			}
		}
		br.close();

		if(sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum + "\n" + min);			
		}
		
	}
	static boolean is_Prime(int Number) {
		if(Number == 1) {
			return false;
		} 
		
		for(int i=2; i<Number; i++) {
			if(Number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
