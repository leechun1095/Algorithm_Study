package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5622 {

	public static void main(String[] args) throws IOException {
		/* 1. 문자열을 받는다.(필요 x)
		   2. 알파벳 배열 생성, 초기화
		   3. 해당 문자열이 의미하는 숫자를 구한다.
		   4. 해당 숫자에 대한 소요시간을 구한다.
		 */
		//14,124KB	128ms
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int cnt = 0; //총 소요시간
		
		// , , , , 
		for(int i=0; i<str.length(); i++) {
			switch(str.charAt(i)) {
			case 'A' : case 'B' : case 'C' : // 2번:3초
				cnt += 3;
				break;
			case 'D' : case 'E' : case 'F' : // 3번:4초
				cnt += 4;
				break;
			case 'G' : case 'H' : case 'I' : // 4번:5초
				cnt += 5;
				break;
			case 'J' : case 'K' : case 'L' : // 5번:6초
				cnt += 6;
				break;
			case 'M' : case 'N' : case 'O' : // 6번:7초
				cnt += 7;
				break;
			case 'P' : case 'Q' : case 'R' : case 'S' : // 7번:8초
				cnt += 8;
				break;
			case 'T' : case 'U' : case 'V' : // 8번:9초
				cnt += 9;
				break;
			case 'W' : case 'X' : case 'Y' : case 'Z' : // 9번:10초
				cnt += 10;
				break;
			}
		}
		System.out.println(cnt);
	}

}
