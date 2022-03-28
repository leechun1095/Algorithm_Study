package while문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1110 {

	public static void main(String[] args) throws IOException {
		// 어렵다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 주어진 수
		
		int cnt = 0;
		int copy = N;
		
		do {
			//N=26, 2+6=8,   ==> 60 + 8
			N = ((N % 10) * 10) + (((N/10)+(N%10))%10); 
			cnt++;
		} while(copy != N); // copy 값이 N이 아닐 경우에는 계속 반복한다.
		br.close();
		System.out.println(cnt);
	}

}
