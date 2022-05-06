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
 * 오큰수: i 보다 오른쪽에 있는 수 중  i보다 큰 수
 * 
 * 백준 풀이
 * 배열과 stack 사용
 */
public class Q17298_3 {
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] arr = new int[N]; // 주어진 수의 배열
		int[] answerArr = new int[N]; // 결과값 오큰수 배열
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Stack<Integer> stack = new Stack<Integer>(); // 오큰수를 찾기위한 스택
		// 1. 첫번째 수의 index push
		// answerArr 저장을 위해 수가 아닌 index를 push한다.
		stack.push(0);
		
		for(int i=1; i<N; i++) {
			/* 불필요한 로직으로 보여 주석처리함
			 * if (stack.isEmpty()) { stack.push(i); }
			 */
			
			// 2. 스택에 남은 index가 존재하고 && 스택 최상단 index의 수 보다 현재 수가 크면,
			// 스택 최상단 index에 해당하는 숫자의 오큰수는 현재 수가 된다.
			// 오큰수를 찾았다면 해당 index는 스택에서 pop한다.
			while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
				answerArr[stack.pop()] = arr[i];
			}
			stack.push(i);
		}
		
		// 3. 오큰수를 찾지 못한 index가 남아있다면,
		// 오큰수 대신 -1을 결과값 배열에 넣는다.
		while(!stack.isEmpty()) {
			
			answerArr[stack.pop()] = -1;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			sb.append(answerArr[i] + " ");
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
