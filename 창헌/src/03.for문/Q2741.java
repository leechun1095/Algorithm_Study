package for문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2741 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 두번째 풀이 : 18,352KB, 216ms
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=N; i++) {
			sb.append(i);
			sb.append('\n');
		}
		br.close();
		System.out.println(sb);
		
		/* 첫번째 풀이 : 29,368KB, 944ms
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int N = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=N; i++) {
			System.out.println(i);
		}
		br.close();
		*/
	}

}
