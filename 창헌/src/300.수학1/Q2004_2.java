package 수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2004_2 {

	public static void main(String[] args) throws IOException {
		// 조합 0의 개수 -> 시간 초과로 틀림, -> long 변환 후 걍 틀림..
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		long n = Integer.parseInt(str[0]);
		long m = Integer.parseInt(str[1]);
		
		long cnt_2 = 0;
		long cnt_5 = 0;
		
		if(n<2 || m<5) {
			cnt_2 = 0;
			cnt_5 = 0;
		} else {
			// 2가 총 몇개인지 종합하여 구하기
			for(long i=2; i<=n; i*=2) {
				cnt_2 += n/i;
			}
			for(long i=2; i<=n-m; i*=2) {
				cnt_2 -= (n-m)/i;
			}
			for(long i=2; i<=m; i*=2) {
				cnt_2 -= m/i;
			}
			
			// 5가 총 몇개인지 종합하여 구하기
			for(long i=5; i<=n; i*=5) {
				cnt_5 += n/i;
			}
			for(long i=5; i<=n-m; i*=5) {
				cnt_5 -= (n-m)/i;
			}
			for(long i=5; i<=m; i*=5) {
				cnt_5 -= m/i;
			}			
		}

		// 2의 총개수, 5의 총개수 중 작은 수가 답
		System.out.println(Math.min(cnt_2, cnt_5));
	}

}
