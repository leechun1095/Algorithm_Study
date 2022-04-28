package step.K_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
// 시간 복잡도가 O(n²)인 정렬 알고리즘으로 풀 수 있습니다. 예를 들면 삽입 정렬, 거품 정렬 등이 있습니다.
public class Q2750_2 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		
		boolean[] arr = new boolean[2001];
		/*
		  range : -1000 ~ 1000
		  0 은 index[1000] 을 의미
		*/
		for(int i=0; i<N; i++) {
			arr[Integer.parseInt(br.readLine()) + 1000] = true;
		}
		
		for(int i=0; i<2001; i++) {
			if(arr[i]) {
				System.out.println(i-1000);
			}
		}
		
		br.close();
	}
}
