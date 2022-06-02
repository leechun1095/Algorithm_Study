package DP;
import java.util.*;
import java.io.*;

public class Q1932 {

	public static int[][] dp;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		dp = new int[n][n];
		
		int[][] inputArr = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				if (st.hasMoreTokens()) {
					inputArr[i][j] = Integer.parseInt(st.nextToken());
				} else {
					inputArr[i][j] = 0;
				}
			}
		}
		
		dp[0][0] = inputArr[0][0];
		for (int i = 1; i < n; i++) {
			dp[i][0] = dp[i-1][0] + inputArr[i][0];
		}
		
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n; j++) {
				dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + inputArr[i][j];
			}
		}
		
		int result = 0;
		for (int i = 0; i < n; i++) {
			result = dp[n-1][i] < result ? result : dp[n-1][i];
		}
		System.out.print(result);
	}

}
