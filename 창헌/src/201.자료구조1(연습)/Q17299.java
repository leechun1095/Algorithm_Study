package 자료구조1연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q17299 {

	public static void main(String[] args) throws IOException {
		// 오등큰수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] arr = new int[N]; // 주어진 수의 배열
		Map<Integer, Integer> cntMap = new HashMap<Integer, Integer>(); // 주어진 수의 등장횟수 Map
		int[] answerArr = new int[N]; // 결과값 오등큰수 배열
		
		/* N=7
		   [ 1 1 2 3 4 2 1 ]
		 
		   cntMap.key   = [1, 2, 3, 4]
		   cntMap.value = [3, 2, 1, 1]
		 */
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			cntMap.put(arr[i], cntMap.getOrDefault(arr[i], 0) + 1);
		}
		
		Stack<Integer> stack = new Stack<>(); // 오등큰수를 찾기위한 스택
		// 1. 첫번째 수의 index push
		// answerArr 저장을 위해 수가 아닌 index를 push한다.
		stack.push(0);
		
		for(int i=1; i<N; i++) {
			// 2. 스택에 남은 index가 존재하고 && 스택 최상단 index의 등장횟수 보다 현재 수의 등장횟수가 크면,
			// 스택 최상단 index에 해당하는 숫자의 오등큰수는 현재 수의 등장횟수가 된다.
			// 오등큰수를 찾았다면 해당 index는 스택에서 pop한다.
			while(!stack.isEmpty() && cntMap.get(arr[stack.peek()]) < cntMap.get(arr[i])) {
				answerArr[stack.pop()] = arr[i];
			}
			stack.push(i);
		}
		
		// 3. 오등큰수를 찾지 못한 index가 남아있다면,
		// 오등큰수 대신 -1을 결과값 배열에 넣는다.
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