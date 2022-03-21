package if문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2525 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		int C = Integer.parseInt(br.readLine());
		
		// C변수 정의
		A = A + (C / 60);
		B = B + (C % 60);
		
		// B변수 정의
		if(B > 59) {
			A = A + 1;
			B = B - 60;
		}
		
		// A변수 정의
		if(A > 23) {
			A = A - 24;
		}
		
		System.out.println(A + " " + B);
		
		/* 첫번째 풀이 (땡)
		if(B + C >= 61) {
			if((B + C) % 60 == 0) {
				if(A >= 23) {
					System.out.println((A+((B+C)/60)-24) + " " + 0);
				} else {
					System.out.println((A+((B+C)/60)) + " " + 0);				
				}
			} else {
				if(A >= 23) {
					System.out.println((A+((B+C)/60)-24) + " " + (B+C-60));
				} else {
					System.out.println((A+((B+C)/60)) + " " + (B+C-60));				
				}				
			}
		} else {
			System.out.println(A + " " + (B+C));
		}
		*/
	}
}
