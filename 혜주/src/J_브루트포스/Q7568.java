package J_브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Q7568 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		int[][] arr = new int[N][2];
		for(int i=0; i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			int cnt = 1;
			for(int k=0; k<N; k++) {
				if(i==k) {
					continue;
				}
				
				if(arr[i][0] < arr[k][0] && arr[i][1] < arr[k][1]) {
					cnt++;
				}
			}
			sb.append(String.valueOf(cnt)).append(" ");
		}
		
		System.out.println(sb.toString());
		
		br.close();
	}

}
