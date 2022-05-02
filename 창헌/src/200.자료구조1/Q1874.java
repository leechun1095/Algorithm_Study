package 자료구조1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q1874 {

	public static void main(String[] args) throws IOException {
		// 스택 수열
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();	// 출력할 결과물 저장
		
		Stack<Integer> stack = new Stack<>();
		
		int N = Integer.parseInt(br.readLine());
		
		int start = 0;	// push는 오름차순으므로 push한 숫자 기억하기 위한 변수
		
		// N = 8
		// 4, 3, 6, 8, 7, 5, 2, 1
		
		// 1, 2, 5, 3, 4
		while(N-- > 0) {
			int value = Integer.parseInt(br.readLine());
			
			if(value > start) {
				// start + 1부터 입력받은 value까지 push 한다.
				for(int i=start+1; i<=value; i++) {
					stack.push(i);
					sb.append('+').append('\n'); // push 할때 '+'를 표현하기 위해 담는다.
				}
				start = value; // 다음 push 할때 오름차순을 유지하기 위해 변수 초기화
			
			// top에 있는 원소가 입력받은 값과 같지 않는 경우
			} else if(stack.peek() != value) {
				System.out.println("NO");
				return;
			}
			
			stack.pop();
			sb.append('-').append('\n');

		}
		System.out.println(sb);
	}
}
