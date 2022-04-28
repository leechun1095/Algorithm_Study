package step.I_재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2447_2 {
	
	public static char[][] astChr;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		astChr = new char[n][n];
		for(int i=0; i<n;i++) {
			for(int k=0; k<n; k++) {
				astChr[i][k] = ' ';
			}
		}
		fnAsterisk(0,0,n);
		
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

	private static void fnAsterisk(int x, int y, int n) {
		if(n == 1) {
			astChr[x][y] = '*';
			return;
		}
		
		for(int i=0; i<3; i++) {
			for(int k=0; k<3; k++) {
				if(!(i==1 && k==1)) {
					fnAsterisk(x + i*(n/3), y+ k*(n/3), n/3);
				} 
			}
		}
	}

}
