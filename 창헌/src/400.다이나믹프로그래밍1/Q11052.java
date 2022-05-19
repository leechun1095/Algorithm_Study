package 다이나믹프로그래밍1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11052 {

	public static void main(String[] args) throws IOException {
		// 카드 구매하기
		//돈을 최대한 많이 지불해 N개 구매
		
		//4가지 종류, 1 5 6 7
		
		//P : N개의 카드팩을 사기 위한 비용
		//dp : N개의 파드팩을 사기 위한 최대 비용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[] P = new int[N+1];
		int[] dp = new int[N+1];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=1; i<=N; i++) {
			P[i] = Integer.parseInt(st.nextToken());
//			System.out.println(P[i]);
		}
		
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=i; j++) {
//				System.out.println("dp[1] = "+dp[1]);
				dp[i] = Math.max(dp[i], dp[i-j] + P[j]);
//				System.out.println("dp["+i+"]"+ "="+ +dp[i]);
			}
		}
		br.close();
		System.out.println(dp[N]);
	}
}
