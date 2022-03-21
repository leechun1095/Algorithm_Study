package for문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2438 {

	public static void main(String[] args) throws IOException {
		// 두번째 풀이 : 14,216KB	136ms
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=N; i++) {
			for(int k=1; k<=i; k++) {
				sb.append("*");
			}
			sb.append('\n');
		}
		br.close();
		System.out.println(sb);
		
		/* 첫번째 풀이 : 14,912KB	224ms
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int N = Integer.parseInt(br.readLine());
		
//		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=N; i++) {
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		br.close();
		*/
	}
}
