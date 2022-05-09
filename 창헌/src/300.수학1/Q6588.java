package 수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q6588 {
	public static boolean[] prime;	// 소수를 체크할 배열
	
	public static void main(String[] args) throws IOException {
		// 골드바흐의 추측
		// : 4보다 큰 모든 짝수는 두 홀수 소수의 합으로 나타낼 수 있다.
		// 만약, n을 만들 수 있는 방법이 여러 가지라면, b-a가 가장 큰 것을 출력한다.
		// 두 홀수 소수의 합으로 n을 나타낼 수 없는 경우에는 "Goldbach's conjecture is wrong."을 출력한다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		prime = new boolean[1000001];
		get_prime();
		
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			boolean result = false;			
			
			if(n == 0) {
				break;
			}
			
			// i 몇부터 시작해야하지..?
			for(int i=1; i<=n/2; i++) {
				int a = i;
				int b = n - i;
				
				if(prime[a] == false && prime[b] == false) {
					sb.append(n + " = " + i + " + " + (n - i)).append('\n');
					result = true;
					break;
				}
			}
			if(!result) {
				sb.append("Goldbach's conjecture is wrong.");
			}
		}
		br.close();
		System.out.println(sb);
	}
	
	
	// 에라토스테네스의 체
	public static void get_prime() {
		// 소수가 아닌 index = true
		// 소수인 index = false
		prime[0] = prime[1] = true;
		
		for(int i=2; i<Math.sqrt(prime.length); i++) {	// Math.sqrt(N) : 루트N
			if(prime[i]) {
				continue;
			}
			
			for(int j=i*i; j<prime.length; j=j+i) {
				prime[j] = true;
			}
		}
	}
}
