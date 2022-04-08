package 기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3053 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int r = Integer.parseInt(br.readLine());
		
		System.out.println(Math.pow(r, 2) * Math.PI);
		System.out.println(Math.pow(r, 2) * 2);
	}
}
