package for문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11021 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 15,956KB		156ms
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=N; i++) {
			String[] str = br.readLine().split(" ");
			sb.append("Case #" + i + ": ");
			sb.append(Integer.parseInt(str[0]) + Integer.parseInt(str[1]));
			sb.append('\n');
		}
		br.close();
		System.out.println(sb);
	}

}
