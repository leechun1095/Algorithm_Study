package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Q2675 {

	public static void main(String[] args) throws IOException {
		// 14,044KB		124ms
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수
		
		StringBuilder sb = new StringBuilder(); 
		
		String[] str;
		for(int i=0; i<T; i++) {
			str = br.readLine().split(" "); //T만큼 readLine()으로 str배열로 받는다.
			
			int R = Integer.parseInt(str[0]); // 반복 횟수
			
			for(int k=0; k<str[1].length(); k++){ //문자열 수 만큼
				for(int j=0; j<R; j++) {
					sb.append(str[1].charAt(k)); // ABC 인경우 A, B, C 순으로 R(반복횟수)만큼 담는다
				}
			}
			sb.append("\n");
		}
		br.close();
		System.out.println(sb);	
	}
}
