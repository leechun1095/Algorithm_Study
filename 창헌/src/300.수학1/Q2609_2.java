package 수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2609_2 {
	public static void main(String[] args) throws IOException {
		// 최대공약수와 최소공배수 - 재귀함수를 이용한 유클리드 호제법 (Euclidean algorithm)
		/* 최대공약수(GCD : Greatest Common Divisor)
		     최소공배수(LCM : Least Common Multiple)
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		
		System.out.println(gcd(a, b));
		System.out.println(lcm(a, b));
	}
	public static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		} else {
			return gcd(b, a%b);
		}
	}
	
	// 재귀함수를 사용하지 않고 구현한 유클리드 호제법
	public static int gcd1(int a, int b) {
		while(b != 0) {
			int r = a % b;
			a = b;
			b = r;	
		}
		return a;
	}
	
	public static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}
}
