package 다이나믹프로그래밍1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2193 {

	public static void main(String[] args) throws IOException {
		// 이친수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		
		int N = Integer.parseInt(br.readLine());
		
		long[][] dp = new long[N+1][2];
		
		// 초기화
		dp[1][0] = 0;  
		dp[1][1] = 1;  

		for(int i=2; i<=N; i++) {
			
			for(int l=0; l<=1; l++) {
				
				if(l == 0) {
					dp[i][l] = dp[i-1][0] + dp[i-1][1];
				} else {
					dp[i][l] = dp[i-1][0];
				}
			}
		}
		
		long result = 0;
		for(int i=0; i<=1; i++) {
			result += dp[N][i];
		}
		
		System.out.println(result);
	}
}
