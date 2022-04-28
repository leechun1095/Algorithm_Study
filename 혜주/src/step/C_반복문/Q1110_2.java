package step.C_반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1110_2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			// 주어진 수
			int N = Integer.parseInt(br.readLine());
			// 사이클 수
			int cnt = 0;
			// 더해질 수
			int sum = N;
			
			while(true) {
				sum = (sum%10)*10 + (sum/10 + sum%10)%10;
				cnt++;
				
				// 주어진 수와 새로운 수가 같다면, 사이클 종료
				if(N == sum) {
					break;
				}
			}
			
			System.out.println(cnt);
		} catch (Exception e) {
			
		} finally {
			br.close();
		}
	}
}
