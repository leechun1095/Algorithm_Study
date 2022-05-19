package 다이나믹프로그래밍1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9095 {

	public static void main(String[] args) throws IOException {
		// 1, 2, 3 더하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] dp = new int[11];
		dp[0] = 1; // 1, 2, 3을 하나도 사용하지 않는 방법이 1개이기 때문에
		dp[1] = 1;
		dp[2] = 2;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			int N = Integer.parseInt(br.readLine());
			
			for(int k=3; k<=N; k++) {
				dp[k] = dp[k-1] + dp[k-2] + dp[k-3];
			}
			sb.append(dp[N]).append('\n');
			
		}
		br.close();
		System.out.println(sb);
	}
}
