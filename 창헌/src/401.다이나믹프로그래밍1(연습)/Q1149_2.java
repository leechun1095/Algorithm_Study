package 다이나믹프로그래밍1연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1149_2 {

	public static void main(String[] args) throws IOException {
		// RGB거리
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
 
		int N = Integer.parseInt(br.readLine());
		int[][] dp = new int[N+1][3];
		
		for(int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int Red = Integer.parseInt(st.nextToken());
			int Green = Integer.parseInt(st.nextToken());
			int Blue = Integer.parseInt(st.nextToken());
			
			dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + Red;
			dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + Green;
			dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + Blue;
		}
		br.close();
		int result = Math.min(dp[N][0], Math.min(dp[N][1], dp[N][2]));
		System.out.println(result);
	}
}
