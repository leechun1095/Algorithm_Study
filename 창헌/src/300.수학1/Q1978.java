package 수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1978 {

	public static void main(String[] args) throws IOException {
		// 소수 찾기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		while(st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			if(prime(num)) {
				cnt++;
			}
		}
		br.close();
		System.out.println(cnt);

	}
	public static boolean prime(int n) {
		if(n < 2) {
			return false;
		} 
		for(int i=2; i*i<=n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
