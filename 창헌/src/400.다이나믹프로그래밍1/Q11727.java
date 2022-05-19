package 다이나믹프로그래밍1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11727 {

	public static void main(String[] args) throws IOException {
		// 2×n 타일링 2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] dp = new int[1001];
		
		// dp[0] = 0;
		// dp[1] = 1;
		// dp[2] = 2;
		// dp[3] = 3;
		// dp[4] = 5;
		// dp[5] = 8;
		
		// DP Bottom-up	
		dp[1] = 1;
		dp[2] = 3;
		for(int i=3; i<=N; i++) {
			dp[i] = dp[i-1] + dp[i-2] + dp[i-2];
			dp[i] = dp[i] % 10007;
		}
		br.close();
		System.out.println(dp[N]);
	}
}
