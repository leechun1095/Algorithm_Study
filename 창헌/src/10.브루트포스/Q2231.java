package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2231 {

	public static void main(String[] args) throws IOException {
		/* N = 분해합
		   M = 생성자
		 
		   N = 256 = 245 + 2 + 4 + 5 
		   M = 245 
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		for(int i=1; i<=N; i++) {
			String temp = Integer.toString(i);
//			System.out.println(temp);
			int sum = 0;
			
			// 각 자리수의 합
			for(int j=0; j<temp.length(); j++) {
//				sum += Integer.parseInt(temp.charAt(j));  -- 에러 발생
				
				// int로 받으면 아키스코드 값이 되고, char로 받으면 문자가 된다. 따라서 48을 빼주면 숫자가 됨.
				sum += (temp.charAt(j)-48);
//				System.out.println(temp.charAt(j)-48);
			}
//			System.out.println("sum = "+sum);
			// sum + temp
			sum += Integer.parseInt(temp);
//			System.out.println("sum2 = "+sum);
			
			if(N == sum) {
				System.out.println(temp);
				break; // for문에서도 break가 있네요.
			} else if(i == N) {
				System.out.println(0);
			}
			
		}
	}

}
