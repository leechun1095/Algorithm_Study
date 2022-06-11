package DP;

import java.io.*;
import java.util.*;

public class Q14002 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n+1];
		int[][] dp = new int[2][n+1];
		dp[0][1] = 1;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; i++) {
			if (st.hasMoreTokens()) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 2; i <= n; i++) {
			int maxIdx = 0;
			dp[0][i] = 1; // 배열 수 초기화
			for (int j = 1; j < i; j++) {
				if (arr[j] < arr[i] && dp[0][j]+1 > dp[0][i]) {
					dp[0][i] = dp[0][j]+1;
					maxIdx = j;
				}
			}
			dp[1][i] = maxIdx;
		}
		int max = 1;
		for (int i = 1; i <= n; i++) {
			max = dp[0][max] > dp[0][i] ? max : i; 
		}
		
		List<Integer> list = new ArrayList<>();
		int Idx = max;
		while(Idx != 0) {
			list.add(arr[Idx]);
			Idx = dp[1][Idx];
		}
		Collections.sort(list);	
		
		System.out.println(dp[0][max]);
		
		for (int k : list) {
			System.out.print(k + " ");
		}
	}
}
