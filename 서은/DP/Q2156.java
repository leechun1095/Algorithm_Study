package DP;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2156 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] input = new int[n];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			if (st.hasMoreTokens()) {
				input[i] = Integer.parseInt(st.nextToken());
			}			
		}
		
		int[] dp = new int[n];
		dp[0] = input[0];
		dp[1] = input[0] + input[1];
		dp[2] = Math.max(input[0]+input[2], input[1]+input[2]);
		dp[3] = Math.max(input[0]+input[2]+input[3], input[1]+input[2]);
		
		for (int i = 4; i < n; i++) {
			dp[i] = Math.max(Math.max(dp[i-3]+input[i-1], dp[i-2]+input[i]), 
					dp[i-4]+input[i-1]+input[i-2]);
		}
		System.out.print(dp[n-1]);
	}
}
