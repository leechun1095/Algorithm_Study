package J_브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Q2798_2 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int[] arr = new int[N];
		for(int i=0; i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int result = 0;
		for(int i=0; i<N-2; i++) {
			for(int k=i+1; k<N-1; k++) {
				for(int j=k+1; j<N; j++) {
					int sum = arr[i] + arr[k] + arr[j];
					if(sum > result && sum <= M) {
						result = sum;
					}
				}
			}
		}
		
		System.out.println(result);
		
		br.close();
	}

}
