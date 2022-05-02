package 자료구조1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q9012 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<T; i++) {
			stack.clear();
			char[] arr = br.readLine().toCharArray();
			
			int temp = 0;
			
			for(char c : arr) {
				if(c == '(') {
					stack.push('(');
				} else {
					// ')' 만나면
					if(stack.empty()) {
						stack.push(')');
						break;
					} else {
						stack.pop();												
					}
				}
			}
			
			if(!stack.empty()) {
				sb.append("NO").append('\n');
			} else {
				sb.append("YES").append('\n'); 
			}
		}
		br.close();
		System.out.println(sb);
	}
}
