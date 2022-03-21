package if문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2480 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		int C = Integer.parseInt(str[2]);
		
		// 3개가 모두 같은 눈이 나온 경우
		if(A == B && B == C && A == C) {
			System.out.println(10000 + (A * 1000));
		} else if(A == B || A == C) {
			// 2개가 같은 눈이 나온 경우 AB AC BC
			System.out.println(1000 + (A * 100));							
		} else if(B == C) {
			System.out.println(1000 + (B * 100));			
		} else {
			// 모두 다른 경우
			System.out.println(Math.max(A, Math.max(B, C)) * 100);
		}
	}
}
