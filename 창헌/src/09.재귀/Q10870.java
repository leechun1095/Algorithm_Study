package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10870 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int result = pibo(n);
		br.close();
		
		System.out.println(result);
	}
	public static int pibo(int N) {
		if(N == 0) {
			return 0;
		}
		if(N == 1) {
			return 1;
		}
		return pibo(N - 1) + pibo(N - 2);
	}
}
