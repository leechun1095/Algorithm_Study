package lecture.data_structure1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;
/*
 * 백준 풀이
 */
public class Q1918 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		char[] charArr = br.readLine().toCharArray(); // 주어진 중위표기식
		
		Stack<Character> ops = new Stack<Character>();
		
		String answer = "";
		for(char ch: charArr) {
			if(ch >= 'A' && ch <= 'Z') {
				answer += ch;
			} else if(ch == '(') {
				ops.push(ch);
			} else if(ch == ')') {
				while(!ops.isEmpty()) {
					char op = ops.pop();
					if(op == '(') {
						break;
					}
					answer += op; // 연산자
				}
			} else {
				// 연산자
				while(!ops.isEmpty() && getPrecedence(ops.peek()) >= getPrecedence(ch)) {
					answer += ops.pop();
				}
				ops.push(ch);
			}
		}
		
		while(!ops.isEmpty()) {
			answer += ops.pop();
		}
		
		System.out.println(answer);
		
		br.close();
	}

	// 연산 우선순위 구하기
	private static int getPrecedence(Character ch) {
		if(ch == '(') return 0;
		else if(ch == '+' || ch == '-') return 1;
		else return 2; // '*', '/'
	}

}
