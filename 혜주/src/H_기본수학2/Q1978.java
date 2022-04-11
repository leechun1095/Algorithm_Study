package H_기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Q1978 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int cnt = 0;
		for(int i=0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(num != 1 && isPrimeNumber(num)) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
		br.close();
	}

	private static boolean isPrimeNumber(int num) {
		Boolean result = true;
		
		for(int i=2; i<num; i++) {
			if(num % i ==0) {
				result = false;
				break;
			}
		}
		
		return result;
	}

}
