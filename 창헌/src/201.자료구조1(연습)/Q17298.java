package 자료구조1연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q17298 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 오큰수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		String[] str = br.readLine().split(" ");
		
		// 입력받은 숫자를 배열에 넣어준다.
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		/* N=0
		   arr = [3, 5, 2, 7]
		   st  = [0 ]
		   
		   N=1
		   arr = [5, 5, 2, 7]
		   st  = [ ]
		
		   N=2
		   arr = [5, 5, 2, 7]
		   st  = [1, 2]
		   
		   N=3
		   arr = [5, 7, 7, 7]
		   st  = [3]
		 
		 */
		for(int i=0; i<N; i++) {
		
			while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
				arr[stack.pop()] = arr[i];
			}
			
			stack.push(i);	
		}
		br.close();
		
		
		// 배열에 마지막 수 처리
		/* arr = [5, 7, 7, -1]
		   st  = []
		  
		 */
		while(!stack.isEmpty()) {
			arr[stack.pop()] = -1;
		}
		
		for(int val : arr) {
			sb.append(val).append(' ');
		}
		System.out.println(sb);
		
	}
}
