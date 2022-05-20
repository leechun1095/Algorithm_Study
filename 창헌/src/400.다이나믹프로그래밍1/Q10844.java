package 다이나믹프로그래밍1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10844 {
	final static long mod = 1000000000;
	public static void main(String[] args) throws IOException {
		// 쉬운 계단 수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		long[][] dp = new long[N + 1][10];
		
		// 초기화
		// 첫 번째 자릿수는 오른쪽 맨 끝의 자릿수이므로 경우의 수가 1개밖에 없음 
		for(int i=1; i<=9; i++) {
			dp[1][i] = 1;
		}
		
		// 두 번째 자릿수부터 N까지 탐색 
		for(int i=2; i<=N; i++) {
			
			// i번째 자릿수의 자릿값들을 탐색(0~9)
			for(int l=0; l<=9; l++) {
				
				// l=0, 즉 자릿값이 0이라면 이전 자릿수의 첫번째 자릿수만 가능 
				if(l == 0) {
					dp[i][0] = dp[i-1][1] % mod;
				}
				
				// l=9라면 이전 자릿수는 8만 가능
				else if(l == 9) {
					dp[i][9] =dp[i-1][8] % mod;
				}
				
				// 그 외의 경우 이전 자리수의 자릿값 +1, -1의 합이 됨.
				else {
					dp[i][l] = ( dp[i-1][l-1] + dp[i-1][l+1] ) % mod;
				}
			}
		}
		
		long result = 0;
		
		// 각 자릿값마다의 경우의 수를 모두 더해준다.
		for(int i=0; i<=9; i++) {
			result += dp[N][i];
		}
		System.out.println(result % mod);
	}
}
