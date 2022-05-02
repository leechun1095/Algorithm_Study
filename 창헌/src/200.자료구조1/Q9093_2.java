package 자료구조1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q9093_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<T; i++) {
			String[] str = br.readLine().split(" ");
			
			// str[0], str[1], str[2] ... ... ...
			for(int k=0; k<str.length; k++) {
				
				for(int j=0; j<str[k].length(); j++) {
					stack.push(str[k].charAt(j));
				}
				
				for(int q=0; q<str[k].length(); q++) {
					sb.append(stack.pop());
				}
				sb.append(" ");
			}
			sb.append('\n');
		}
		br.close();
		System.out.println(sb);
	}

}
