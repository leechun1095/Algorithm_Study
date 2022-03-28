package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1157 {

	public static void main(String[] args) throws IOException {	
		// 21,048KB	292ms
		// 알파벳 배열 생성 -> 문자열 체크
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(); // 입력받은 문자열
		
		// 대문자 소문자 아스키코드값이 다르다.
		// "a" = 97, "z" = 122
		// "A" = 65, "Z" = 90
		str = str.toUpperCase();
		
		
		int[] arr = new int[26]; // arr[0] = "A"자리 
		// 배열 초기화
		for(int i=0; i<arr.length; i++) {
			arr[i] = 0;
		}
		
		int strLen = str.length();

		// 알파벳 배열 루프 먼저? 문자열 루프 먼저? -> 문자열 루프
		// str = "Mississipi"
		for(int i=0; i<strLen; i++) {
			int val = str.charAt(i);
			
			arr[val - 65] += 1; // 알파벳 배열 해당에 위치 +1 씩 해준다.
		}

		// 가장 많이 사용된 알파벳 수가 동일하면 어떻게 찾지?..
		int maxVal = -1;
		char result ='?';
		
		for (int i=0; i<arr.length; i++) {
			if(maxVal < arr[i]) {
				maxVal = arr[i];
				result = (char)(i+65);	// 해당 문자를 형변환하여 문자로 담는다
				
			} else if(maxVal == arr[i]) {
				result = '?';
				// char result = "?"; 은 왜 에러남?
			}			
		}
		br.close();
		System.out.println(result);
	}

}
