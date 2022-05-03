package lecture.data_structure1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;
public class Q17413 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		char[] inputArr = br.readLine().toCharArray();
		
		Stack<Character> stack = new Stack<Character>();
		
		boolean isTag = false;
		StringBuilder sb = new StringBuilder();
		for(char chr: inputArr) {
			if(chr == '<') {
				isTag = true;
				
				while(!stack.isEmpty()) {
					sb.append(stack.pop());
				}
				sb.append(chr);
			} else if(chr == '>') {
				isTag = false;
				sb.append(chr);
			} else if(isTag) {
				sb.append(chr);
			} else if(!isTag) {
				if(chr != ' ') {
					stack.add(chr);
				} else {
					while(!stack.isEmpty()) {
						sb.append(stack.pop());
					}
					sb.append(chr);
				}
			}
		}
		
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
