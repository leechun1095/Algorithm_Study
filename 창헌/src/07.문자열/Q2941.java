package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2941 {

	public static void main(String[] args) throws IOException {
		/* 1. 문자열 단어를 입력받는다.
		   2. 문자열에 대한 for문 생성
		   3. 변경된 문자에 대한 cnt 정의
		   4. switch-case문으로 변경하는 문자에 대한 cnt ++
		   ==> ljes=njak 답:3이 나와서 당황했지만, 로그보니 'e','a','k'와 같은 문자때문이었음. default 처리
		     예외처리 : https://st-lab.tistory.com/68
		 */
		
		
		// 14,188KB		128ms
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int cnt = 0; //총 소요시간
		
		for(int i=0; i<str.length(); i++) {
			switch(str.charAt(i)) {
			case 'c' :
				if(i<str.length()-1) {
					if(str.charAt(i+1) == '=') {	//c 다음 문자열 체크
						i++;	// 다음 문자열로 넘어감
					} else if(str.charAt(i+1) == '-') {
						i++;
					}
				}
				cnt++;
				break;
			case 'd' :
				if(i<str.length()-1) {
					if(str.charAt(i+1) == 'z') {
						if(i<str.length()-2) {
							if(str.charAt(i+2) == '=') {
								i += 2;
							}
						}
					} else if(str.charAt(i+1) == '-') {
						i++;
					}
				}
				cnt++;
				break;
			case 'l' :
				if(i<str.length()-1) {
					if(str.charAt(i+1) == 'j') {
						i++;
					}
				}
				cnt++;
				break;
			case 'n' :
				if(i<str.length()-1) {
					if(str.charAt(i+1) == 'j') {
						i++;
					}
				}
				cnt++;	
				break;
			case 's' : 
				if(i<str.length()-1) {
					if(str.charAt(i+1) == '=') {
						i++;
					}
				}
				cnt++;
				break;
			case 'z' :
				if(i<str.length()-1) {
					if(str.charAt(i+1) == '=') {
						i++;
					}
				}
				cnt++;
				break;
			default :
				cnt++;
				break;
			}
		}
		br.close();
		System.out.println(cnt);
	}

}
