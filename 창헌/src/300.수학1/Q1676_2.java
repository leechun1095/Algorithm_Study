package 수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Q1676_2 {

	public static void main(String[] args) throws IOException {
		// 팩토리얼 0의 개수 -> BigInteger로 풀기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = factorial(N).toString();
		
		int cnt = 0;
		
		for(int i=str.length()-1; i>1; i--) {
			if(str.charAt(i) == '0') {
				cnt++;
			} else {
				break;
			}
		}
		br.close();
		System.out.println(cnt);
	}
	
	public static BigInteger factorial(int N) {
		BigInteger big = new BigInteger("1");
		
		for(int i=1; i<=N; i++) {
			big = big.multiply(BigInteger.valueOf(i));
		}
		return big;
	}
}
