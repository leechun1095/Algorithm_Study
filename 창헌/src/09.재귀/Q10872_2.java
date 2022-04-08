package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10872_2 {

	public static void main(String[] args) throws IOException {
		// 재귀로 풀기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int result = factorial(n);
		System.out.println(result);
	}
	public static int factorial(int N) {
		if(N <= 1) {
			return 1; // 재귀 종료
		}
		return N * factorial(N-1);
	}
}
