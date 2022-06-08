package 다이나믹프로그래밍1연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11722 {

	public static void main(String[] args) throws IOException {
		// 가장 긴 감소하는 부분 수열
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
 
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		
		int[] A = new int[N+1];
		int[] dp = new int[N+1];
		
		for(int i=1; i<=N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		dp[1] = 1; // 초기화
		
		// A = {10, 30, 10, 20, 20, 10}
		for(int i=2; i<=N; i++) {
			dp[i] = 1;
			
			for(int j=1; j<i; j++) {
				if(A[j] > A[i] && dp[i] < dp[j]+1) {
					dp[i] = dp[j]+1;
				}
			}
		}
		br.close();
		
		int max = Integer.MIN_VALUE;
		for(int i=1; i<=N; i++) {
			if(dp[i] > max) {
				max = dp[i];
			}
		}
		System.out.println(max);
	}
}
