package 다이나믹프로그래밍1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q15990 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 1, 2, 3 더하기 5
		// dp[i][j] = i를 1,2,3의 합으로 나타내는 방법의 수, 마지막에 사용한 수는 j
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		long[][] dp = new long[100001][4];
		dp[1][1] = 1; // 1
		dp[2][2] = 1; // 2
		dp[3][1] = 1; // 2+1
		dp[3][2] = 1; // 1+2
		dp[3][3] = 1; // 3
		
		for(int i=4; i<=100000; i++) {
			dp[i][1] = (dp[i-1][2] + dp[i-1][3]) % 1000000009;
			dp[i][2] = (dp[i-2][1] + dp[i-2][3]) % 1000000009;
			dp[i][3] = (dp[i-3][1] + dp[i-3][2]) % 1000000009;		
		}
		
		for(int i=0; i<T; i++) {
			int N = Integer.parseInt(br.readLine());
			sb.append((dp[N][1] + dp[N][2] + dp[N][3]) % 1000000009).append('\n');
		}
		System.out.println(sb);
	}
}
