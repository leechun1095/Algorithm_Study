package 다이나믹프로그래밍1연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1932 {

	public static void main(String[] args) throws IOException {
		// 정수 삼각형
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
 
		int N = Integer.parseInt(br.readLine());
		
		int[][] dp = new int[N+1][N+1];
		int[][] cost = new int[N+1][N+1];
		
		for(int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			for(int j=1; j<=i; j++) {
				cost[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dp[1][1] = cost[1][1]; // 최상층 값 초기화
		
		for(int i=2; i<=N; i++) {
			for(int j=1; j<=i; j++) {
				if(j == 1) { // 왼쪽 위의 수가 없음 (j-1 이 없음)
					dp[i][j] = dp[i-1][j] + cost[i][j]; 
				} else { // 왼쪽 위, 오른쪽 위 중 max 값을 선택해야 함
					dp[i][j] = Math.max(dp[i-1][j-1] + cost[i][j], dp[i-1][j] + cost[i][j]); 
				}
			}
		}
		
		int max = Integer.MIN_VALUE;
		for(int i=1; i<=N; i++) {  // N층에 저장 된 값들 중 최대값을 찾으면 된다.
			if(dp[N][i] > max) {
				max = dp[N][i];
			}
		}
		System.out.println(max);
	}
}
