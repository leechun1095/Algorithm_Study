package while문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10952 {
	
	public static void main(String[] args) throws IOException {
		// 14,256KB		136ms
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String[] str = br.readLine().split(" ");
			int A = Integer.parseInt(str[0]);
			int B = Integer.parseInt(str[1]);
			
			if(A==0 && B==0) {
				break;
			}
			sb.append(A+B).append('\n');
		}
		br.close();
		System.out.println(sb);
	}

}
