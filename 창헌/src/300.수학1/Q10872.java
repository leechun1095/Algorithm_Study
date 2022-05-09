package 수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10872 {

	public static void main(String[] args) throws IOException {
		// 팩토리얼 (복습)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int result = factorial(n);
		System.out.println(result);
	}
	public static int factorial(int N) {
		if(N <= 1) {
			return 1;
		}
		return N * factorial(N-1);
	}
}
