package E_함수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1065 {
	
	public static int getArithMeticSeqeuenceCnt(int n) {
		int cnt = 0;
		
		if(n < 100) {
			cnt = n;
		} else {
			cnt = 99;
			for(int i=100; i<= n; i++) {
				if(i==1000) break;
				
				int a = i%10;
				int b = i/10%10;
				int c = i/100;
				
				if((a-b) == (b-c)) {
					cnt++;
				}
			}
		}
		
		return cnt;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(getArithMeticSeqeuenceCnt(N));
		
		br.close();
		
	}

}
