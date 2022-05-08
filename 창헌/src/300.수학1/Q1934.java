package 수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1934 {

	public static void main(String[] args) throws IOException {
		// 최소공배수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			String[] str = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			
			sb.append(lcm(a, b)).append('\n');
		}
		br.close();
		System.out.println(sb);
	}
	public static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		} else {
			return gcd(b, a%b);
		}
	}
	
	public static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}
}
