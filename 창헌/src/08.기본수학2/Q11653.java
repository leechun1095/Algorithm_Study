package 기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11653 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		// N = 12
		for(int i=2; i<=N; i++) {
//			System.out.println("$$$$$" + N);
			while(N % i == 0) {
				N = N / i;
//				System.out.println(i + ", " + N);
				System.out.println(i);
			}
		}
	}

}
