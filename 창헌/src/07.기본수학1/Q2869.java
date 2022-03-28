package 기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2869 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/* 수식
		   A : 올라간 미터
		   B : 미끄러진 미터
		   V : 높이(미터)
		   
		   A=2, B=1, C=5
		   1일 : 2-1 = 1일
		   2일 : 1+2-1 = 2일
		   3일 : 2+2-1 = 3일
		   4일 : 3+2 = 4일
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		int V = Integer.parseInt(str[2]);
		

		int date = 1;	// 정상에 오르는데 걸린 일수
		
		/*		sum	A=2 B=1 V=5	
		 *  1일	0	2	1	5	
		 *  2일	1	2	1	5
		 *  3일	2	2	1	5
		 *  4일	3	2	1	5
		 *  
		 *  	sum A=5 B=1 V=6 
		 *  1일 	0	5	1	6
		 *  2일		5	1	6
		 */ 
		
		// 두번째 풀이 : 14,148KB		120ms
		date = (V - B) / (A - B);
		
		if((V - B) % (A - B) != 0) {
			date ++;
			System.out.println(date);
		} else {
			System.out.println(date);
		}
		
		
		/* 첫번째 풀이 : 시간 초과
		int sum = 0;
		while(true) {
			if(sum >= V) {
//				System.out.println("@@1");
				System.out.println(date);
				break;
			}
			
			if(sum + A >= V) {
//				System.out.println("@@2");
				System.out.println(date);
				break;
			} else if(sum + (A - B) >= V) {
//				System.out.println("@@3");
				System.out.println(date);
				break;
			} else {
				date ++;
				sum += (A - B);
			}
		}
		*/
	}
}
