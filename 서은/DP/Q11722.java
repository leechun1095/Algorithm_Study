package DP;
import java.io.*;
import java.util.*;

public class Q11722 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			if (st.hasMoreTokens()) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[] len = new int[n];
		int[] dp = new int[n];
		
		for (int i = n-2; i >= 0; i--) {
			for (int j = i+1; j < n; j++) {
				int length = j-i;
				if (arr[j] < arr[i] ) {
					len[i] = length;
				}
			}	
		}
		// len[[i] 값을 불러와 i~i+4까지 돌면서 arr[i]~[i+4] 사이 값의 갯수 구하기
	}

}
