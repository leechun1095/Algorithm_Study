package 다이나믹프로그래밍1연습;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q11057 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int dp[][] = new int[N + 1][10];
		for (int i = 0; i < 10; i++) {
			dp[1][i] = 1;
		}
		for (int i = 2; i <= N; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k <= j; k++) {
					dp[i][j] += dp[i - 1][k];
					dp[i][j] %= 10007;
				}
			}
		}
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += dp[N][i];
		}
		System.out.println(sum % 10007);
	}
}

