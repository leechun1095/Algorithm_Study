package DP;

import java.io.*;
import java.util.*;

public class Q2225 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[][] dp = new int[n+1][k+1];
		
		for (int j = 1; j <= k; j++) {
			for (int i = 0; i <= n; i++) {
				if (j == 1 || i == 0) dp[i][j] = 1;
				else {
					dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % 1000000000;
				}			
			}
		}
		
		System.out.print(dp[n][k]);
	}
}
