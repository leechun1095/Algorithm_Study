package step.I_재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2447 {
	
	public static char[][] astChr;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		astChr = new char[n][n];
		fnAsterisk(n);
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n;i++) {
			for(int k=0; k<n; k++) {
				sb.append(String.valueOf(astChr[i][k]));
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
		
		br.close();
	}

	private static char[][] fnAsterisk(int n) {
		if(n == 1) return astChr;
		
		for(int i=0; i<n; i++) {
			for(int k=0; k<n; k++) {
				if(i >= n/3 && i < n-n/3 && k >= n/3 && k < n-n/3) {
					astChr[i][k] = ' ';
				} else {
					astChr[i][k] = '*';
				}
			}
		}
		
		return fnAsterisk(n/3);
	}

}
