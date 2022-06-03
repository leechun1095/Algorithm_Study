package 다이나믹프로그래밍1연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q9465 {

	public static void main(String[] args) throws IOException {
		// 스티커
		// dp[i][j] = 2 X i 에서 얻을 수 있는 최대 점수, i번 열에서 뜯는 스티커는 j
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		// T=2
        int T = Integer.parseInt(br.readLine());
                 
        while(T-- > 0) {
        	int N = Integer.parseInt(br.readLine());
        	long[][] score = new long[N+1][2];
        	
        	st = new StringTokenizer(br.readLine(), " ");
        	for(int i=1; i<=N; i++) {
        		score[i][0] = Long.valueOf(st.nextToken());
        	}
        	
        	st = new StringTokenizer(br.readLine(), " ");
        	for(int i=1; i<=N; i++) {
        		score[i][1] = Long.valueOf(st.nextToken());
        	}
        	
        	long[][] dp = new long[N+1][3];
        	
        	for(int i=1; i<=N; i++) {		
				dp[i][0] = Math.max(Math.max(dp[i-1][0], dp[i-1][1]), dp[i-1][2]);         				
				dp[i][1] = Math.max(dp[i-1][0], dp[i-1][2]) + score[i][0]; 
				dp[i][2] = Math.max(dp[i-1][0], dp[i-1][1]) + score[i][1];
        	}
        	
        	long result = Math.max(Math.max(dp[N][0], dp[N][1]), dp[N][2]);
        	sb.append(result).append('\n');
        }
        br.close();
        System.out.println(sb);
	}
}
