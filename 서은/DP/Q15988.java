package DP;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q15988 {

	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int n = Integer.parseInt(br.readLine());
//		
//		int[][] arr = new int[n][3];
//		
//		for (int i = 0; i < n; i++) {
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			
//			int tempSmallIdx = 0;
//			for (int j = 0; j < 3; j++) {
//				if (st.hasMoreTokens()) {
//					arr[i][j] = Integer.parseInt(st.nextToken());
//				}
//			}
//		}
//		
//		int total = 0;
//		int preIdx = 0;
//		
//		for (int j = 0; j < 3; j++) {
//			preIdx = arr[0][j] > arr[0][preIdx] ? preIdx : j;
//		}
//		total += arr[0][preIdx];
//		
//		for (int i = 1; i < n; i++) {
//			int smallIdx = 0;
//			if (preIdx == 0) smallIdx = 1;
//			
//			for (int j = 0; j < 3; j++) {
//				if (j == preIdx) continue;
//				smallIdx = arr[i][j] > arr[i][smallIdx] ? smallIdx : j;
//			}
//			preIdx = smallIdx;
//			total += arr[i][smallIdx];
//		}
//		System.out.println(total);	
		//------------------------greedy로 잘못 품--------------------
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[][] dp = new int[n][3];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 3; j++) {
				if (st.hasMoreTokens()) {
					if (i == 0) {
						dp[i][j] = Integer.parseInt(st.nextToken());
					} else if (j == 0) {
						dp[i][j] = Math.min(dp[i-1][1], dp[i-1][2]) + Integer.parseInt(st.nextToken());;
					} else if (j == 1) {
						dp[i][j] = Math.min(dp[i-1][0], dp[i-1][2]) + Integer.parseInt(st.nextToken());;
					} else if (j == 2) {
						dp[i][j] = Math.min(dp[i-1][0], dp[i-1][1]) + Integer.parseInt(st.nextToken());;
					}
				}
			}
		}
		int min = Math.min(Math.min(dp[n-1][0], dp[n-1][1]),dp[n-1][2]);
		System.out.print(min);
	}	
}
