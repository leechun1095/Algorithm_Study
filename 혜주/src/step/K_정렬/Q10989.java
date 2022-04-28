package step.K_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
// 수의 범위가 작다면 카운팅 정렬을 사용하여 더욱 빠르게 정렬할 수 있습니다.
public class Q10989 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[2000001];
		for(int i=0; i<N; i++) {
			arr[Integer.parseInt(br.readLine()) + 1000000]++;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<2000001; i++) {
			if(arr[i] > 0) {
				for(int k=0; k<arr[i]; k++) {
					sb.append(i - 1000000).append('\n');
				}
			}
		}
		System.out.println(sb);
		
		br.close();
	}
}
