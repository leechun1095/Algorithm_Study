package 수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2004 {

	public static void main(String[] args) throws IOException {
		// 조합 0의 개수 -> 시간 초과로 틀림
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		int cnt_2 = 0;
		int cnt_5 = 0;
		
		int result_N = 0;
		int result_NM = 0;
		int result_M = 0;
		
		// n!의 0의 개수
		for(int i=1; i<=n; i++) {
			int target = i;

			// 소인수 분해하며 2의 개수를 파악
			while(target % 2 ==  0) {
				cnt_2++;
				target = target / 2;
			}
			
			// 소인수 분해하여 5의 개수를 파악
			while(target % 5 == 0) {
				cnt_5++;
				target = target / 5;
			}
		}
		result_N = Math.min(cnt_2, cnt_5);
		
		
		cnt_2 = 0;
		cnt_5 = 0;
		// (n-m)!의 0의 개수
		for(int i=1; i<=n-m; i++) {
			int target = i;

			// 소인수 분해하며 2의 개수를 파악
			while(target % 2 ==  0) {
				cnt_2++;
				target = target / 2;
			}
			
			// 소인수 분해하여 5의 개수를 파악
			while(target % 5 == 0) {
				cnt_5++;
				target = target / 5;
			}
		}
		result_NM = Math.min(cnt_2, cnt_5);

		
		cnt_2 = 0;
		cnt_5 = 0;
		// m!의 0의 개수
		for(int i=1; i<=m; i++) {
			int target = i;

			// 소인수 분해하며 2의 개수를 파악
			while(target % 2 ==  0) {
				cnt_2++;
				target = target / 2;
			}
			
			// 소인수 분해하여 5의 개수를 파악
			while(target % 5 == 0) {
				cnt_5++;
				target = target / 5;
			}
		}
		result_M = Math.min(cnt_2, cnt_5);

		System.out.println(result_N - result_NM - result_M);
	}
}
