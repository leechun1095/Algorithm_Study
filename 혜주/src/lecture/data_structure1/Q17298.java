package lecture.data_structure1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;
/*
 * 오큰수: i 보다 오른쪽에 있는 수 중  i보다 큰 수
 * 
 * 최초풀이 
 * 2중 for문 사용
 * 
 * --> 시간초과 발생
 */
public class Q17298 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
	
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		// 배열 init
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int NGE; // 오큰수 찾기
		for(int i=0; i<N; i++) {
			NGE = -1;
			for(int k=i+1; k<N; k++) {
				if(arr[i] < arr[k]) {
					NGE = arr[k];
					break;
				}
			}
			
			sb.append(NGE + " ");
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
