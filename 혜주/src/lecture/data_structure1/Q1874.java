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
public class Q1874 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
	
		int N = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<Integer>();
		int lastNum = 0;
				
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(num > lastNum) {
				while(num > lastNum) {
					stack.push(++lastNum);
					sb.append("+\n");
				}
				
			} else  {
				if(num != stack.peek()) {
					sb = new StringBuilder();
					sb.append("NO");
					break;
				}

			}
			stack.pop();
			sb.append("-\n");
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
