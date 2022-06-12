package 다이나믹프로그래밍1연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11055 {

	public static void main(String[] args) throws IOException {
		// 가장 큰 증가 부분 수열
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
 
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		
		int[] A = new int[N+1];
		int[] dp = new int[N+1];
		
		for(int i=1; i<=N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		dp[1] = A[1]; // 초기화
		
		for(int i=2; i<=N; i++) {
			dp[i] = A[i];
			
			for(int j=1; j<N; j++) {
				if(A[i] > A[j]) { 
					dp[i] = Math.max(dp[j] + A[i], dp[i]);
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
