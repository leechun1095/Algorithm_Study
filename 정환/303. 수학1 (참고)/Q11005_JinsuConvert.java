package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11005_JinsuConvert {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader
		           (new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] s = br.readLine().split(" ");
		int input = Integer.parseInt(s[0]);
		int jinsu = Integer.parseInt(s[1]);
		
		//진수변환이 끝날때까지 반복
		while(input!=0) {
			int num = input%jinsu;
			
			//B진수 자릿수마다 10을 넘으면 A~Z로 변환
			if(num>9) {
				num-=10;
				num+='A';
				sb.append((char)num);
			} else {
				sb.append(num);
			}
			
			input/=jinsu;
		}
		
		//차례대로 입력했으니 거꾸로 출력
		System.out.println(sb.reverse().toString());
	}

}
