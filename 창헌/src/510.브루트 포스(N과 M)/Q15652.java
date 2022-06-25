package 브루트포스N과M;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q15652 {

	static int[] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		
		System.out.println(pick(N, M, 0, 1));
	}
	
	static StringBuilder pick(int N, int M, int index, int current) {
		if(index == M) {
			StringBuilder sb = new StringBuilder();
			for(int num: arr) {
				sb.append(num).append(" ");
			}
			return sb.append("\n");
		}
		
		StringBuilder ans = new StringBuilder();

		for(int i=current; i<= N; i++) {
			arr[index] = i; 
			ans.append(pick(N, M, index+1, i));
		}
		
		return ans;
	}
}