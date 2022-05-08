package 수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10430 {

	public static void main(String[] args) throws IOException {
		// 나머지
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int c = Integer.parseInt(str[2]);
		
		System.out.println( (a+b) % c );
		System.out.println( ((a%c) + (b%c)) % c );
		System.out.println( (a*b) % c );
		System.out.println( ((a%c) * (b%c)) % c );
	}

}
