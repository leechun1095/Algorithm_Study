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
 * float으로 풀었더니 틀려서
 * double로 바꿈 -> 통과
 */
public class Q1935 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		char[] charArr = br.readLine().toCharArray(); // 주어진 후위표기식
		
		double[] doubleArr = new double[26];
		
		for(int i=0; i<n; i++) {
			doubleArr[i] = Double.parseDouble(br.readLine());
		}
		Stack<Double> stack = new Stack<Double>();
		
		for(int i=0; i<charArr.length; i++) {
			char chr = charArr[i];
			if(chr >= 'A' && chr <= 'Z') {
				 // 피연산자만 스택에 담는다.
				stack.push(doubleArr[chr-65]); // 'A': 65 -> chr-'A'도 가능
			} else {
				// 연산자가 나오면,
				// 스택에서 두 수를 꺼내 계산한 후
				// 그 결과값을 다시 스택에 넣는다.
				double num2 = stack.pop();
				double num1 = stack.pop();
				
				double result = getCalculateResult(num1, num2, chr);
				stack.push(result);
			}
		}
		
		System.out.println(String.format("%.2f", stack.pop()));
		
		br.close();
	}

	// 계산
	private static double getCalculateResult(double num1, double num2, char calc) {
		double result = 0;
		
		switch(calc) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
		}
		
		return result;
	}
}
