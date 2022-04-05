package 기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4948 {
	public static boolean[] prime = new boolean[246912 + 1];
	public static void main(String[] args) throws IOException {
		// 베르트랑 공준 : 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		get_prime();
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int n  = Integer.parseInt(br.readLine());
			
			if(n == 0) { // n=0일 경우 종료
				break;
			}
			
			int cnt = 0;
			
			for(int i=n+1; i<=2*n; i++) { // n보다 크고 2n 사이의 소수를 찾아야하므로
				if(prime[i] == false) {
					cnt++;
				}
			}
			sb.append(cnt).append('\n');
		}
		br.close();
		
		System.out.println(sb);
	}
	public static void get_prime() {
		prime[0] = prime[1] = true;
		
		for(int i=2; i<=Math.sqrt(prime.length); i++) {
			if(prime[i]) {
				continue;
			}
			
			for(int j=i*i; j<prime.length; j+=i) {
				prime[j] = true;
			}
		}
	}
}
