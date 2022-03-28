package 기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1712 {

	public static void main(String[] args) throws IOException {
		/* A : 고정비용(만원)
		   B : 가변비용(만원)
		   C : 노트북 가격(만원)
		   X : 최초로 이익이 발생하는 판매량
		   
		   // 손익분기점 존재 (X가 양수일 때)
		   A=1000, B=70, C=170
		   170 * X = 1870 	>  1000 + (70 * X) = 1770
		   X = 11
		   
		   // 손익분기점 존재 X (X가 음수일 때)
		   A=3, B=2, C=1
		   1 * X > 3 + (2 * X)
		   X - 2X > 3
		   -X > 3
		   X > -3
		   
		   // 수식
		   CX > A+(B*X)
		   CX - BX > A
		   X(C-B) > A
		   X > A/(C-B)
		   
		   1. A, B, C 입력받기
		   2. 수식 구현
		   3. 손익분기점 & 손익분기점 존재X 분기처리
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		int C = Integer.parseInt(str[2]);
		
		int X;
		// 두번째 풀이
		if(B >= C) {
			// 손익분기점 X
			System.out.println(-1);
		} else {
			X = (A / (C-B))+1;
			System.out.println(X);
		}
		
		
		/* 첫번째 풀이 (틀림 : by zero error)
		X = A / (C-B);
		
		if(X < 0) {
			// 손익분기점 X
			System.out.println(-1);
		} else {
			X += 1;
			System.out.println(X);
		}
		*/
		br.close();
	}

}
