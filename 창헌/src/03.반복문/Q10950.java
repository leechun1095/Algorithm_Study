package for문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10950 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 세번째 풀이
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<T; i++) {
			String[] str = br.readLine().split(" ");
			sb.append(Integer.parseInt(str[0]) + Integer.parseInt(str[1]));
			sb.append('\n');
		}
		System.out.println(sb);
		
		/* 두번째 풀이
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] arr = new int[T];
		
		for(int i=0; i<T; i++) {
			String[] str = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			arr[i] = a + b;
		}
		
		for(int i=0; i<T; i++) {
			System.out.println(arr[i]);
		}
		*/
		
		
		/* 첫번째 풀이
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=T; i++) {
			String[] str = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			
			System.out.println(a + b);
		}
		*/

	}

}
