package 다이나믹프로그래밍1연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q15988 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 1, 2, 3 더하기 3
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		long dp[] = new long[1_000_001];
		dp[0] = 1; // 1, 2, 3을 하나도 사용하지 않는 방법이 1개이기 때문에
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		for(int i = 4; i <= 1_000_000; i++) {
        	dp[i] = (dp[i-1] + dp[i-2] + dp[i-3]) % 1_000_000_009;
		}
		
		for(int i=0; i<T; i++) {
			int N = Integer.parseInt(br.readLine());
			sb.append(dp[N]).append('\n');
		}
		br.close();
		System.out.println(sb);

	}

}
