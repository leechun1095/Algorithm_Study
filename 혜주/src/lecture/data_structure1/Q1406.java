package lecture.data_structure1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;
public class Q1406 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
	
		String str = br.readLine();
		int N = Integer.parseInt(br.readLine());
		
		Stack<Character> left = new Stack<Character>();
		Stack<Character> right = new Stack<Character>();
		
		// init stack
		for(int i=0; i<str.length(); i++) {
			left.push(str.charAt(i));
		}
				
		// command
		String command;
		StringTokenizer st;
		for(int i=0; i<N; i++) {
			command = br.readLine();
			
			if("L".equals(command)) {
				if(!left.isEmpty()) {
					right.push(left.pop());
				}
			} else if("D".equals(command)) {
				if(!right.isEmpty()) {
					left.push(right.pop());
				}
			} else if("B".equals(command)) {
				if(!left.isEmpty()) {
					left.pop();
				}
			} else {
				st = new StringTokenizer(command, " ");
				command = st.nextToken();
				if("P".equals(command)) {
					left.push(st.nextToken().charAt(0));
				}
			}
		}
		
		while(!left.isEmpty()) {
			right.push(left.pop());
		}
		
		while(!right.isEmpty()) {
			sb.append(right.pop());
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
