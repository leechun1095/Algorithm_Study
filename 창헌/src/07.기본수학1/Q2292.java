package 기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2292 {

	public static void main(String[] args) throws IOException {
		/* N : 1 <= N <= 1,000,000,000
		   
		   1. 수식 구현
		   
		   1개         -> 6개(2~7)  -> 12개(8~19)     -> 18개(20~37)          -> 24개(38~61)
		   1       -> 7(= 1+6) -> 19(= 1+6+12)   -> 37(= 1+6+12+18)     -> 61(= 1+6+12+18+24)
		   1       -> 1+(6*1)   -> 1+(6*1)+(6*2) -> 1+(6*1)+(6*2)+(6*3) -> 1+(6*1)+(6*2)+(6*3)+(6*4)
		   1+(6*0) -> 1+(6*1)   -> 1+ 6(1+2)     -> 1+6(1+2+3)          -> 1+6(1+2+3+4)
		   
		   6*0       -> 6*1       -> 6*3           -> 6*6                 -> 6*10
		   6*(0)     -> 6*(0+1)   -> 6*(0+1+2)     -> 6*(0+1+2+3)         -> 6*(0+1+2+3+4) 
		   
		   N		벌집 개수		cnt
		   ==========================
		   1		1			1
		   2~7		6			2
		   8~19		12			3
		   20~37	18			4
		   38~61	24			5
		   
		   X // 6*X 
		   N=1+(6*X)
		   N=1+6X
		   6X = N-1
		   X = (N-1) /6
		   
		   // 해당 구간의 최소값(2번쨰 줄부터)
		   range = range + 6 * cnt(=1)
		   cnt ++; 
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int cnt = 1; // 지나가는 최소 개수의 방
		int range = 2; // 범위 중 최소값
		
		if(N == 1) {
			System.out.println(1);
		} else {
			while(range <= N) {
				range = range + (6 * cnt); // 다음 최소값 구하기
				cnt++;
			}
			System.out.println(cnt);
		}
	}
}
