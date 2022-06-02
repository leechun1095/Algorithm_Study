package DP;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q9465 {
	public static void main (String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine()); // 테스트케이스 횟수
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < num; i++) {
			int n = Integer.parseInt(br.readLine());
			int[][] stiker = new int[2][n];
			int[][] dp = new int[2][n];
			for (int x = 0; x < 2; x++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				for (int y = 0; y < n; y++) {
					if (st.hasMoreTokens()) {
						stiker[x][y] = Integer.parseInt(st.nextToken());
					}	
				}
			}
			
			dp[0][0] = stiker[0][0];
			dp[1][0] = stiker[1][0];
			dp[0][1] = stiker[1][0] + stiker[0][1];
			dp[1][1] = stiker[0][0] + stiker[1][1];
			
			
			for (int x = 2; x < n; x++) {
				dp[0][x] = Math.max(dp[1][x-1], dp[1][x-2]) + stiker[0][x];
				dp[1][x] = Math.max(dp[0][x-1], dp[0][x-2]) + stiker[1][x];
			}
			
			sb.append(Math.max(dp[0][n-1], dp[1][n-1])).append('\n');
		}
		System.out.print(sb);
	}
}
