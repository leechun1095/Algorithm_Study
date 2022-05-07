package 자료구조1연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q10799 {

	public static void main(String[] args) throws IOException {
		// 쇠막대기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<String> stack = new Stack<>();
				
		String[] str = br.readLine().split("");
		
		int result = 0;
		for (int i = 0; i < str.length; i++) {
			
			String now = str[i];
			
			if(now.equals("(")) {
				stack.push(now);
			} else {
				// ")" 인 경우
				if(str[i-1].equals("(")) {
					// 레이저인 경우 (괄호가 바로 인접한 경우가 레이저)
					stack.pop();
					result += stack.size();
				} else {
					// 레이저가 아닌 쇠막대기인 경우
					result++;
					stack.pop();
				}
			}
		}
		br.close();
		System.out.println(result);
	}

}
