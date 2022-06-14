package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1476 {

	public static void main(String[] args) throws IOException {
		// 날짜 계산
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		
		int e=1;
		int s=1;
		int m=1;
		
		int E = Integer.parseInt(str[0]);
		int S = Integer.parseInt(str[1]);
		int M = Integer.parseInt(str[2]);
		
		for(int i=1; ; i++) {
			if(e==E && s==S && m==M) {
				System.out.println(i);
				break;
			}
			
			e+=1;
			s+=1;
			m+=1;
			
			if(e == 16) {
				e=1;
			}
			if(s == 29) {
				s=1;
			}
			if(m == 20) {
				m=1;
			}
		}
	}
}
