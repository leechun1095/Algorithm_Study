package 기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1978 {

	public static void main(String[] args) throws IOException {
		/* 1. 소수 구하는 수식
		   2. 구현
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");

		int cnt = 0;
		
		for(int i=0; i<str.length; i++) {
			if(is_Prime(Integer.parseInt(str[i])) == true) {
				cnt++;
			}
		}
		br.close();
		System.out.println(cnt);
	}
	static boolean is_Prime(int Number) {
		// 1은 소수가 아니다.
		if(Number == 1) {
			return false;
		}
		
		// 2 ~ Number-1 까지 나누어 떨어지는 약수가 있는지 판별
		for(int i=2; i<Number; i++) {
//			System.out.println(Number + " % " + i +" 결과 :" + Number % i);
			
			if(Number % i == 0) {
				return false;
			}
		}
		
		// 위 두 조건에 걸리지 않으면 소수다.
		return true;
	}
}
