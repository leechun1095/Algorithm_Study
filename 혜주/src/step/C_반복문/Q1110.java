package step.C_반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q1110 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			// 주어진 수
			String N = br.readLine();
			
			// 더해질 수
			int A, B;
			if(N.length() < 2) { // 한 자리 수
				N = "0" + N;
				A = 0;
				B = Integer.parseInt(N);
			} else { // 두 자리 수
				A = Integer.parseInt(N.substring(0,1));
				B = Integer.parseInt(N.substring(1));
			}
			
			// 새로운 수(문자)
			String newStr = N;
			
			int cnt = 0;
			int sum;
			while(true) {
				sum = A + B;
				A = B;
				if(sum < 10) {
					B = sum;
				} else {
					B = Integer.parseInt(Integer.toString(sum).substring(1));
				}
				
				newStr = "" + A + B;
				
				cnt++;
				
				// 주어진 수와 새로운 수가 같다면, 사이클 종료
				if(N.equals(newStr)) {
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
