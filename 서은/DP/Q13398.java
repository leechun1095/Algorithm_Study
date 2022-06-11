package DP;
import java.io.*;
import java.util.*;
public class Q13398 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n]; // input
		
		int[] dp1 = new int[n]; // - 포함
		int[] dp2 = new int[n]; // - 안포함
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			if (st.hasMoreTokens()) {
				arr[i] = Integer.parseInt(st.nextToken());	
			}
		}
		
		dp1[0] = arr[0];
		for (int i = 1; i < n; i++) {
			dp1[i] = Math.max(arr[i], dp1[i-1] + arr[i]);
		}
		dp2[0] = arr[0];
		int max = arr[0];
		
		// 무조건 특수 값을 제거하는 경우로 생각
		for (int i = 1; i < n; i++) {
			dp2[i] = Math.max(dp1[i-1], dp2[i-1] + arr[i]);
			max = Math.max(max, Math.max(dp1[i], dp2[i]));
		}
		System.out.print(max);
		
		
	}

}
