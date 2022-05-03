package lecture.data_structure1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;
public class Q10799 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		char[] inputArr = br.readLine().toCharArray();
		
		int resultCnt = 0;
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i<inputArr.length; i++) {
			char chr = inputArr[i];
			if(chr == '(') {
				stack.add(chr);
			} else { // ')'
				stack.pop();
				if(i > 0 && inputArr[i-1] == '(') {
					resultCnt += stack.size();
				} else {
					resultCnt ++;
				}
			}
		}
		
		System.out.println(resultCnt);
		
		br.close();
	}
}
