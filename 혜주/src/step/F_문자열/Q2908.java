package step.F_문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2908 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		StringBuffer sb = new StringBuffer(st.nextToken());
		int a = Integer.parseInt(sb.reverse().toString());
		
		sb = new StringBuffer(st.nextToken());
		int b = Integer.parseInt(sb.reverse().toString());
		
		System.out.println(a > b? a : b);
		
		br.close();
	}

}
