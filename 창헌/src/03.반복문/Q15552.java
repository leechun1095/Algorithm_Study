package for문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q15552 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 두번째 풀이 방식
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=T; i++) {
			String[] str = br.readLine().split(" ");
			bw.write((Integer.parseInt(str[0]) + Integer.parseInt(str[1])) + "\n");
		}
		br.close();
		
		bw.flush();
		bw.close();
		
		
		/* 첫번째 풀이 방식
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=T; i++) {
			String[] str = br.readLine().split(" ");
			sb.append(Integer.parseInt(str[0]) + Integer.parseInt(str[1]));
			sb.append('\n');
		}
		br.close();
		System.out.println(sb);
		*/
	}

}
