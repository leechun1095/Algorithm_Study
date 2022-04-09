package F_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Q10809 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String str = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		for(int i='a'; i<='z';i++) {
			sb.append(str.indexOf(i)).append(" ");
		}
		
		System.out.println(sb);
		br.close();
		
	}

}
