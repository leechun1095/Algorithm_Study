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
 * stack 사용
 * left / right
 * 
 * --> 시간초과 발생
 */
public class Q17298_2 {
	
	static Stack<Integer> left = new Stack<Integer>();
	static Stack<Integer> right = new Stack<Integer>();
	static int num = 0;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
	
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		

		for(int i=0; i<N; i++) {
			left.add(Integer.parseInt(st.nextToken()));
		}
		
		
		while(N > 1) {
			// 왼쪽 -> 오른쪽 옮기기
			setAllRight(N-1);
			num = left.peek();
			int NGE = getNGE();
			sb.append(NGE + " ");
			N--;
		}
		
		sb.append(-1);
		
		System.out.println(sb);
		
		br.close();
	}

	// 오큰수 찾기
	private static int getNGE() {

		while(!right.isEmpty()) {
			int rightNum = right.pop();
			left.add(rightNum);
			if(rightNum > num) {
				return rightNum;
			}
		}
		
		return -1;
	}

	// 왼쪽 -> 오른쪽 전부 옮기기
	private static void setAllRight(int size) {
		while(right.size()+1 <= size) {
			right.add(left.pop());
		}
	}
}
