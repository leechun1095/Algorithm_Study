package DP;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11057 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] bp = new int[n][10]; // 0값으로 초기화
		for(int i = 0; i < 10; i++) {
			bp[0][i] = 1;
		}
		
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 0) {
					bp[i][j] = 1;
				} else {
					bp[i][j] = (bp[i-1][j] + bp[i][j-1])%10007;	
				}
			}
		}
		long total = 0;
		for (int i = 0; i < 10; i++) {
			total += bp[n-1][i];
		}
		System.out.print(total%10007);
	}

}
