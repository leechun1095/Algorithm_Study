package 다이나믹프로그래밍1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1463 {

	public static void main(String[] args) throws IOException {
		// 1로 만들기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[] dp = new int[N+1]; // dp 배열 생성
		dp[0] = 0; 
		dp[1] = 0;
		
		// DP Bottom-up 방식
		for(int i=2; i<=N; i++) {
			
			dp[i] = dp[i-1] + 1;
			
			if(i%2 == 0) {
				dp[i] = Math.min(dp[i], dp[i/2] + 1);
			}
			if(i%3 == 0) {
				dp[i] = Math.min(dp[i], dp[i/3] + 1);
			}
		}
		br.close();
		System.out.println(dp[N]);
	}
}
