package 기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4153 {

	public static void main(String[] args) throws IOException {
		// 직삼각형 공식 : a² = b² + c²
		// 1) a + b = c
		// 2) a + c = b
		// 3) b + c = a
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = new String[3];
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			str = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			int c = Integer.parseInt(str[2]);
			
			if(a == 0 && b == 0 && c == 0) {
				break;
			}
			
			if((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2)) {
				sb.append("right" + "\n");
			} else if((Math.pow(a, 2) + Math.pow(c, 2)) == Math.pow(b, 2)) {
				sb.append("right" + "\n");
			} else if((Math.pow(b, 2) + Math.pow(c, 2)) == Math.pow(a, 2)) {
				sb.append("right" + "\n");
			} else {
				sb.append("wrong" + "\n");
			}
		}
		br.close();
		System.out.println(sb);
	}
}
