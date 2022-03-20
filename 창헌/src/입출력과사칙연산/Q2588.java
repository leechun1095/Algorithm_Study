package 입출력과사칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2588 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		
		int a = Integer.parseInt(str[0]); // 472
		String b = str[1];
		
		char[] c = b.toCharArray();
		
		System.out.println(a * (c[2]-'0'));
		System.out.println(a * (c[1]-'0'));
		System.out.println(a * (c[0]-'0'));
		System.out.println(a * Integer.parseInt(b));
		
//		System.out.println(c[2]-'0'); // 5
//		System.out.println(c[1]-'0'); // 8
//		System.out.println(c[0]-'0'); // 3
		
		
		/* 제출시 runtime 에러남...
		int a = Integer.parseInt(str[0]); // 472
		int b = Integer.parseInt(str[1]); // 385
		
		int c = Integer.parseInt(str[1].substring(0, 1)); // 3
		int d = Integer.parseInt(str[1].substring(1, 2)); // 8
		int e = Integer.parseInt(str[1].substring(2, 3)); // 5

		System.out.println(a * e); // 472*5 = 2360
		System.out.println(a * d); // 472*8 = 3776
		System.out.println(a * c); // 472*3 = 1416
		System.out.println(a * b);
		*/
	}

}
