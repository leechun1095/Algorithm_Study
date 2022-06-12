package DP;

import java.io.*;
import java.util.*;

public class Q15990 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			int x = Integer.parseInt(br.readLine());
			int[][] dp = new int[x+1][4];
			dp[1][1] = 1;
			dp[2][2] = 1;
			dp[3][1] = 1;
			dp[3][2] = 1;
			dp[3][3] = 1;
			
			for (int a = 4; a <= x; a++) {
				dp[a][1] = (dp[a-1][2] + dp[a-1][3]) % 1000000009;
				dp[a][2] = (dp[a-2][1] + dp[a-2][3]) % 1000000009;
				dp[a][3] = (dp[a-3][1] + dp[a-3][2]) % 1000000009;
			}
			
			int total = (dp[x][1] + dp[x][2] + dp[x][3]) % 1000000009;
			
			sb.append(total).append('\n');
		}
		System.out.print(sb);
	}

}
