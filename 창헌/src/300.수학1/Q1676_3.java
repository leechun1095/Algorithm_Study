package 수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1676_3 {

	public static void main(String[] args) throws IOException {
		// 팩토리얼 0의 개수 -> 소인수분해  풀이
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int cnt_5 = 0;
		
		for(int i=1; i<=N; i++) {
			
			int target = i;
			
			while(target % 5 == 0) {
				cnt_5++;
				target = target / 5;
			}
		}
		System.out.println(cnt_5);
	}

}
