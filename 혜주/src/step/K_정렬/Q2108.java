package step.K_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
public class Q2108 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[8001];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[num + 4000]++;
			sum += num;
			if(num < min) {
				min = num;
			}
			if(num > max) {
				max = num;
			}
		}
		
		
		int count = 0;
		int mid = 0;
		int mode = 0;
		int mode_max = 0;
		boolean flag = false;

		for(int i=min+4000; i<=max+4000; i++) {
			if(arr[i] > 0) {
				int num = i-4000;
				
				if(count < (N+1)/2) {
					count += arr[i];
					mid = num;
				}
				if(mode_max < arr[i]) {
					mode_max = arr[i];
					mode = i - 4000;
					flag = true;	// 첫 등장이므로 true 로 변경 
				}
				// 이전 최빈값 최댓값과 동일한 경우면서 한 번만 중복되는 경우 
				else if(mode_max == arr[i] && flag == true) {
					mode = i - 4000;
					flag = false;					
				}
			}
		}
		
		// 산술평균
//		System.out.println(Math.round(sum / (float)N));
		System.out.println((int)Math.round((double)sum / N));
		// 중앙값
		System.out.println(mid);
		// 최빈값
		System.out.println(mode);
		// 범위
		System.out.println(max-min);
		
		br.close();
	}
}
