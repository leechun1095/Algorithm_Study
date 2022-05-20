package 다이나믹프로그래밍1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11053 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 가장 긴 증가하는 부분 수열 (LIS)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		
		int N = Integer.parseInt(br.readLine());
		
		int[] seq = new int[N];
		int[] dp = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		// 입력받은 수열값 셋팅
		for(int i=0; i<N; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<N; i++) {
			dp[i] = 1;
			
			// 0 ~ i 이전 원소들 탐색
			for(int j = 0; j < i; j++) {
		    
				// j번째 원소가 i번째 원소보다 작으면서 i번째 dp가 j번째 dp+1 값보다 작은경우
				if(seq[j] < seq[i] && dp[i] < dp[j] + 1) {
					dp[i] = dp[j] + 1;	// j번째 원소의 +1 값이 i번째 dp가 된다.
				}
			}
		}
		// 최댓값(최대 길이) 탐색 
		int max = -1;
		for(int i = 0; i < N; i++) {
			if(dp[i] > max) {
				max = dp[i]; 
			} 
		}
		System.out.println(max);
	}
}
