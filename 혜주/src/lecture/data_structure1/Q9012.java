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
public class Q9012 {
	
	public static String checkValidParenthesisString(String str) {
		Stack stack = new Stack();
		String result = "YES";
		
		for(char chr: str.toCharArray()) {
			if(chr == '(') {
				stack.push(chr);
			} else {
				if(stack.isEmpty()) {
					result = "NO";
					break;
				} else {
					stack.pop();
				}
			}
		}
		
		if(!stack.isEmpty()) {
			result = "NO";
		}
		
		return result;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
	
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			sb.append(checkValidParenthesisString(br.readLine())).append("\n");
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
