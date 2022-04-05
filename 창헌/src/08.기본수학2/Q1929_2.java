package 기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1929_2 {
	public static boolean[] prime;	// 소수를 체크할 배열
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int M = Integer.parseInt(arr[0]);
		int N = Integer.parseInt(arr[1]);
		
		prime = new boolean[N + 1]; // 0 ~ N
		get_prime();

		for(int i=M; i<=N; i++) {
			// false = 소수
			if(prime[i] == false) {
				System.out.println(i);
			}
		}
		br.close();
	}
	// 에라토스테네스의 체
	public static void get_prime() {
		// 소수가 아닌 index = true
		// 소수인 index = false		
		prime[0] = prime[1] = true;

		for(int i=2; i<=Math.sqrt(prime.length); i++) { // Math.sqrt(N) : 루트N
			if(prime[i]) {
				continue;
			}
			// N = 16
			// i=2, j=4; j<17; 4+2=6    4 6 8 10 12 14 16 = true  
			// i=3, j=9; j<17; 9+3=12	9 12 15 = true
			// i=4, j=16; j<17 			16 = true
			// 정석대로라면 j = i * 2 부터 시작이지만 이미 2의 배수가 걸러졌기때문에 i 의 제곱수부터 시작해도 된다.
			for(int j=i*i; j<prime.length; j=j+i) {
				prime[j] = true;
			}
		}
		// 배열 index 가 소수라면 false 로, 아니라면 true 로 완성됨		
	}
}
