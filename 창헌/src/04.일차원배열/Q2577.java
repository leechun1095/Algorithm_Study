package 일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2577 {

	public static void main(String[] args) throws IOException {
		// 두번째 풀이(배열 사용) : 14,128KB	128ms
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int[] arr = new int[10];
		
		int result = a*b*c;
		String strResult = String.valueOf(result);
		
		for(int i=0; i<strResult.length(); i++) {
			arr[(strResult.charAt(i) - 48)]++;
		}
		
		for(int val : arr) {
			System.out.println(val);
		}
		
		/* 첫번째 풀이(생각보다 오래 걸림) : 14,092KB		128ms
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());

		int result = a*b*c;
		String strResult = Integer.toString(result);
		
		// str.charAt(0) 은 문자가 출력된다.
		// 문자 '1'은 int형으로 형변환을 하면 아스키코드 값으로 변환되는데 49이다.
		// 문자형을 숫자로 변환 방법
		// 1) -'0'을 빼준다. ('0'은 아스키코드 48)
		// 2) -48 을 빼준다
		for(int i=0; i<10; i++) {
			int count = 0;
			for(int k=0; k<strResult.length(); k++) {
				if((strResult.charAt(k) -'0') == i) {
					count++;
				}				
			}
			System.out.println(count);
		}
		br.close();
		*/
	}

}
