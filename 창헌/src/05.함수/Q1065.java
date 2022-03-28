package 함수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1065 {
	public static void main(String[] args) throws IOException {
		// 등차수열 : 인접한 수의 차이가 같은 수
		// 수열A : 5, 7, 9, 11, 수열B : 6, 1, -4, -9, 수열C : 7, 7, 7, 7
		// 1~99 는 모두 등차수열임
		// 1<= N <= 1000
		// 1) 100보다 작은 수
		// 2) 100보다 큰 수
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 입력받은 수
		int result = hansu(N);
		System.out.println(result);
		
	}
	// 14,228KB		128ms
	public static int hansu(int n) {
		int cnt = 0; // 한수 count
		
		if(n < 100) {
			return n;
		} else {
			cnt = 99;
			if(n == 1000) { // 예외처리, 1000은 등차수열이 아니고, 1000 이상의 수를 입력받지 않기 때문에 999로 변경
				n = 999;
			}

			for(int i=100; i<=n; i++) {
				int A = i/100; 	 // 백의 자리수
				int B = i/10%10; // 십의 자리수
				int C = i%10;	 // 일의 자리수
				
				if((A - B) == (B - C)) {
					cnt++;
				}
			}
		}
		return cnt;
	}
	
}
