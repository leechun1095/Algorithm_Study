package DP;

import java.io.*;
import java.util.*;

public class Q11052 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n+1];
		int[] dp = new int[n+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; i++) {
			if (st.hasMoreTokens()) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
		}
		
		dp[0] = 0;
		dp[1] = arr[1];
		
		for (int i = 2; i <= n; i++) {
			int max = arr[i];
			for (int j = 1; j <= i/2; j++) {
				max = Math.max(dp[j] + dp[i-j], max);
				dp[i] = max;
				
			}
		}
		
		System.out.print(dp[n]);
	}

}
