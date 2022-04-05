package 기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1929 {
	public static boolean[] prime;	// 소수를 체크할 배열
	public static void main(String[] args) throws IOException {
		// 첫번째 풀이 : 시간초과
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int M = Integer.parseInt(arr[0]);
		int N = Integer.parseInt(arr[1]);
		
		for(int i=M; i<=N; i++) {
			if(is_Prime(i) == true) {
				System.out.println(i);
			}
		}
	}
	static boolean is_Prime(int Number) {
		if(Number == 1) {
			return false;
		}
		for(int i=2; i<Number; i++) {
			if(Number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
