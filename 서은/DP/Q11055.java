package DP;
import java.io.*;
import java.util.*;

public class Q11055 {

	public static void main(String[] args) throws IOException {
		int[] dp;
		int[] input;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		dp = new int[n];
		input = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			if (st.hasMoreTokens()) {
				input[i] = Integer.parseInt(st.nextToken());
			}
		}
		
		dp[0] = input[0];
		
		// 오류 : ex. 4 2 7 90 144 의 경우 7에서 4를 안보고 2까지만 감
		for (int i = 1; i < n; i++) {
			dp[i] = input[i];
			for (int j = 0; j < i; j++) {
				if (input[j] < input[i] && dp[i] < input[i] + dp[j]) {
					dp[i] = input[i] + dp[j];
				}
			}
		}
		
		int max = 0;
		for (int i = 0; i < n; i++) {
			max = Math.max(max, dp[i]);
		}
		
		System.out.print(max);
	}
}
