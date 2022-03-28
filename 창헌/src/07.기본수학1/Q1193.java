package 기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1193 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/* 수식
		   1/1
		   1/2	2/1					: +1, -1
		   3/1	2/2	 1/3			: -1, +1
		   1/4	2/3	 3/2  4/1		: +1, -1
		   5/1	4/2	 3/3  2/4  1/5	: -1, +1
		 	
		   1/1						: T(분자+분모)=2, 대각선 칸의 개수 : T-1
		   1/2	2/1					: 분자+분모=3
		   3/1	2/2	 1/3			: 분자+분모=4
		   1/4	2/3	 3/2  4/1		: 분자+분모=5
		   5/1	4/2	 3/3  2/4  1/5	: 분자+분모=6
		   
		   T 짝수, 칸의 개수 홀수 : 왼쪽 아래에서 오른쪽 위 방향 -> T % 2 == 0
		   T 홀수, 칸의 개수 짝수 : 오른쪽 위에서 왼쪽 아래 방향 -> T % 2 == 1
		   
		   X = 5 일 때,
		   cross_cnt = 1
		   prev_cnt_sum = 0
		   
		   5 <= 1
		   prev_cnt_sum = 1
		   cross_cnt = 2
		   
		   5 <= 3
		   prev_cnt_sum = 3
		   cross_cnt = 3
		   
		   5 <= 6, cross_cnt = 3, -> 대각선 칸 3개 = 분모가 큰 수부터 시작 
		   
		   
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		
		int cross_cnt = 1;		// 해당 범위의 대각선 칸 개수
		int prev_cnt_sum = 0;	// 해당 대각선의 직전 대각선까지의 칸의 누적 합
		
		while(true) {
			// 직전 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
			if (X <= prev_cnt_sum + cross_cnt) {	
				
				if (cross_cnt % 2 == 1) {	// 대각선의 개수가 홀수라면 
					// 분모가 큰 수부터 시작
					// 분모는 대각선 개수 - (X 번째 - 직전 대각선까지의 누적합 - 1) 
					// 분자는 X 번째 - 직전 대각선까지의 누적합 
					System.out.print((cross_cnt - (X - prev_cnt_sum - 1)) + "/" + (X - prev_cnt_sum));
					break;
				} 
				
				else {	// 대각선의 개수가 짝수라면 
					// 홀수일 때의 출력을 반대로 
					System.out.print((X - prev_cnt_sum) + "/" + (cross_cnt - (X - prev_cnt_sum - 1)));
					break;
				}
 
			} else {
				prev_cnt_sum += cross_cnt;
				cross_cnt++;
			}
		}
	}
}
