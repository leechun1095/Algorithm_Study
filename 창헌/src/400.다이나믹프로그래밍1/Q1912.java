package 다이나믹프로그래밍1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1912 {

	public static void main(String[] args) throws IOException {
		// 연속합
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		int[] dp = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		// 입력받은 숫자 배열에 셋팅
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		/*
		 * dp[0]은 첫 원소로 이전에 더이상 탐색할 것이 없기 때문에
		 * arr[0] 자체 값이 되므로 arr[0]으로 초기화 해준다.
		 * max또한 첫 번째 원소로 초기화 해준다.
		 */
		dp[0] = arr[0];
		int max = arr[0];
		
		for(int i=1; i<N; i++) {
			// 점화식
			dp[i] = Math.max(dp[i-1] + arr[i], arr[i]);
			
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
	}

}
