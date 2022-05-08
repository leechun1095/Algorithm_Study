package 수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2609 {

	public static void main(String[] args) throws IOException {
		// 최대공약수와 최소공배수
		/* 최대공약수(GCD : Greatest Common Divisor)
		     최소공배수(LCM : Least Common Multiple)
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		
		// a=24, b=18
		
		// 최대공약수
		int g = 1;
		for(int i=2; i<Math.min(a, b); i++) {
			if(a % i == 0 && b % i == 0) {
				g = i;
			}
		}
		/* i=2, 24%2 == 0, 18%2 == 0, g=2;
		   i=3  24%3 == 0, 18%3 == 0, g=3;
		   i=4  24%4 == 0, 18%4 != 0;
		   ...
		   i=6  24%6 == 0, 18%6 == 0; g=6;
		   ...
		   ...
		 */
		System.out.println(g);
		
		// 최소공배수
		// a=24, b=18
		// LCM = a * b / g
		int lcm = a * b / g;
		System.out.println(lcm);
		
	}
}
