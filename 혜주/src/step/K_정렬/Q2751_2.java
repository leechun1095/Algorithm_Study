package step.K_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
// 시간 복잡도가 O(nlogn)인 정렬 알고리즘으로 풀 수 있습니다. 
// 예를 들면 병합 정렬, 힙 정렬 등이 있지만, 어려운 알고리즘이므로 지금은 언어에 내장된 정렬 함수를 쓰는 것을 추천드립니다.
public class Q2751_2 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		
		boolean[] arr = new boolean[2000001];
		for(int i=0; i<N; i++) {
			arr[Integer.parseInt(br.readLine()) + 1000000] = true;
		}
		
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<2000001; i++) {
			if(arr[i]) {
				sb.append(i - 1000000).append('\n');
			}
		}
		System.out.println(sb);
		
		br.close();
	}
}
