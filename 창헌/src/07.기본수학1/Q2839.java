package 기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2839 {

	public static void main(String[] args) throws IOException {
/* N : 설탕 무게(kg)
     봉지 : 3kg, 5kg

	1. n 이 4 또는 7 인 경우
	2. n 이 5의 배수인경우 ( 5로 나눈 나머지가 0 인 경우 )
	3. n 이 5의 배수 + 1 또는 5의 배수 + 3 인 경우 ( 5로 나눈 나머지가 1 또는 3 인 경우 )
	4. n 이 5의 배수 + 2 또는 5의 배수 + 4 인 경우 ( 5로 나눈 나머지가 2 또는 4 인 경우 )

    N      3   4   5   6   7   8   9   10   11   12   13   14   15   16   17   18   19 		
=======================================================================================
   봉지개수      1  -1   1   2  -1   2   3    2    3    4    3    4    3    4    5    4    5      
  N / 5    0   0   1   1   1   1   1    2    2    2    2    2    3    3    3    3    3  
  N % 5    3   4   0   1   2   3   4    0    1    2    3    4    0    1    2    3    4
   
	if(N == 4 || N == 7) {
		return -1;
	} else if (N % 5 == 0){
		return (N / 5);
	} else if (N % 5 == 1 || N % 5 == 3){
		return (N / 5) + 1;
	} else if(N % 5 == 2 || N % 5 == 4){
		return (N / 5) + 2;
	}

 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		// 두번째 풀이 : 14,320KB	124ms
		if(N == 4 || N == 7) {
			System.out.println(-1);
		} else if (N % 5 == 0){
			System.out.println(N / 5);
		} else if (N % 5 == 1 || N % 5 == 3){
			System.out.println((N / 5) + 1);
		} else if(N % 5 == 2 || N % 5 == 4){
			System.out.println((N / 5) + 2);
		}
		
		/* 첫번째 풀이 : 11 입력했을 때 틀림
		if(N < 5) {
			if(N == 3) {
				System.out.println("@@ 1");
				System.out.println(1);
			} else {
				System.out.println("@@ 2");
				System.out.println(-1);				
			}
		} else if(5 <= N) {
			System.out.println("@@ 3");
			if(N % 5 == 0) {
				System.out.println("@@ 4");
				// 5kg 봉지로 해결
				System.out.println(N / 5);
			} else if(N % 3 == 0) {
				System.out.println("@@ 5");
				if((N % 5) % 3 == 0) {
					System.out.println("@@ 6");
					System.out.println((N / 5) + ((N % 5) / 3) );
				} else if(N % 3 == 0){
					// 3kg 봉지로 해결
					System.out.println(N / 3);					
				} else {
					System.out.println("@@ 7");
					System.out.println(-1);
				}
			} else {
				System.out.println("@@ 8");
				// 5kg 봉지 + 3kg
				if((N % 5) % 3 == 0) {
					System.out.println("@@ 9");
					System.out.println((N / 5) + ((N % 5) / 3) );
				} else {
					System.out.println("@@ 10");
					System.out.println(-1);
				}
			}
		}
		*/
	}
}
