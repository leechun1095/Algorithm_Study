package 자료구조1연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q17413 {
	
	static StringBuilder sb = new StringBuilder();
	static void print(Stack st) {
		while(!st.empty()) {
			sb.append(st.peek());
			st.pop();
		}
	}
	
	public static void main(String[] args) throws IOException {
		// 단어뒤집기2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Stack st = new Stack();
		boolean tag = false;
		
		String str = br.readLine();

		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i) == '<') {
				print(st);
				tag = true;
				sb.append(str.charAt(i));
				
			} else if(str.charAt(i) == '>') {
				tag = false;
				sb.append(str.charAt(i));
			} else if(tag) {
				sb.append(str.charAt(i));
			} else {
				if(str.charAt(i) == ' ') {
					print(st);
					sb.append(' ');
                    continue;
				} else {
					st.push(str.charAt(i));
				}
			}
			
			// 반복문이 마지막 횟수일 때, 스택이 비어있지 않다면 원소 추가
            if (i == str.length() - 1) {
                while (!st.isEmpty()) {
                    sb.append(st.pop());
                }
            }
			
		}
		br.close();
		System.out.println(sb);
	}

}
