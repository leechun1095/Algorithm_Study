package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11720 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 주어진 수
		String str = br.readLine();
		
		int sum = 0;
		
		for(int i=0; i<N; i++) {
//			System.out.println(str.charAt(i));
			sum += str.charAt(i) -48; // 아스키코드값으로 출력되기 때문에 48을 빼서 숫자로 변환한다.
		}
		br.close();
		System.out.println(sum);

	}

}
