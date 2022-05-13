package 수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1676 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 팩토리얼 0의 개수 -> 오답. 100! 은 Int에 안담김
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int result = factorial(N);
		String str = Integer.toString(result);
		
		
		int cnt=0;
		
		
		// 틀린 답 : 전체 0을 세고있는 for문임.. 뒤에서부터 0이 연속적인 갯수만 세야함.
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '0') {
				cnt++;
			}
		}
		br.close();
		System.out.println(cnt);
		
	}
	public static int factorial(int N) {
		if(N <= 1) {
			return 1;
		}
		return N * factorial(N-1);
	}
}
