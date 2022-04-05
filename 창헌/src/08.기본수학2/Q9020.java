package 기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9020 {
	public static boolean[] prime = new boolean[10000 + 1];
	public static void main(String[] args) throws IOException {
		/* 골드바흐의 추측 : 
		   - 2보다 큰 모든 짝수는 두 소수의 합으로 나타낼 수 있다는 것
		   - 짝수를 두 소수의 합으로 나타내는 표현을 그 수의 골드바흐 파티션이라고 한다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수
		
		get_prime();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<T; i++) {
			int n = Integer.parseInt(br.readLine());
			int p = n / 2;	// 앞의 숫자
			int q = n / 2;	// 뒤의 숫자
			
			if(n % 2 != 0) { // 짝수 아닐 때 예외처리
				return;
			}
			
			while(true) {
				if(prime[p] == false && prime[q] == false) {
					sb.append(p + " " + q);
					break;
				}
				p--;
				q++;
			}
			sb.append('\n');
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
