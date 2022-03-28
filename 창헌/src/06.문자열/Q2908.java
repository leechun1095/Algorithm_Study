package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2908 {

	public static void main(String[] args) throws IOException {
		/* 1. 입력값을 받는다  
		   2. str[0] 의 순서를 바꾸는 로직 구현한다. (key)
		   	- 숫자의 순서를 접근하기 위해 문자열로 받아야 함
		   3. str[0], str[1] 크기를 비교한다.
		   4. 큰 수를 print 한다.
		 */
		
		// 두번째 풀이(BufferedReader + StringBuilder.reverse();) : 14,132KB	128ms
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		
		int A = Integer.parseInt(new StringBuilder(str[0]).reverse().toString());
		int B = Integer.parseInt(new StringBuilder(str[1]).reverse().toString());
		
		System.out.print(A > B ? A : B);
		
		
		/* 첫번째 풀이(생각나는 대로) : 16,252KB	160ms
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		
		// 첫번째 숫자 순서 변경
		char temp; // 임시 변수
		char A = str[0].charAt(0);
		char B = str[0].charAt(1);
		char C = str[0].charAt(2);
		
		temp = A;
		A = C;
		C = temp;
		str[0] = Integer.toString((A-48))+Integer.toString((B-48))+Integer.toString((C-48));
		
		// 두번째 숫자 순서 변경
		A = str[1].charAt(0);
		B = str[1].charAt(1);
		C = str[1].charAt(2);
		
		temp = A;
		A = C;
		C = temp;
		str[1] = Integer.toString((A-48))+Integer.toString((B-48))+Integer.toString((C-48));
		
		int result = Math.max(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
		System.out.println(result);
		
//		System.out.println(Integer.toString((A-48))+Integer.toString((B-48))+Integer.toString((C-48)));
		*/
	}
}
