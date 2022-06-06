package 다이나믹프로그래밍1연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2156 {

	public static void main(String[] args) throws IOException {
		// 포도주 시식
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
 
		int N = Integer.parseInt(br.readLine());
		
		int[] wine = new int[N+1];
		
		for(int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());
			wine[i] = Integer.parseInt(st.nextToken()); 
		}
		
		int[] dp = new int[N+1];
		
		dp[0] = wine[0] = 0;
		dp[1] = wine[1];
		
		if(N > 1) { // 예외처리 : N이 1인 경우 ArrayIndexOutOfBounds 
			dp[2] = wine[1] + wine[2];
	
			for(int i=3; i<=N; i++) {
				dp[i] = Math.max(dp[i-1], Math.max(dp[i-2] + wine[i], dp[i-3] + wine[i-1] + wine[i]));
			}
		}
		br.close();
		System.out.println(dp[N]);
	}
}
