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
public class Q9093 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
	
		int N = Integer.parseInt(br.readLine());
		
		Stack stack = new Stack();
		for(int i=0; i<N; i++) {
			char[] st = br.readLine().toCharArray();
			for(char chr: st) {
				if(chr != ' ') {
					stack.push(chr);
				} else {
					while(!stack.isEmpty()) {
						sb.append(stack.pop());
					}
					sb.append(chr);
				}
			}
			
			while(!stack.isEmpty()) {
				sb.append(stack.pop());
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
