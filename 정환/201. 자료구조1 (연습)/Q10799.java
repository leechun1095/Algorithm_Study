import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader
		           (new InputStreamReader(System.in));
		Deque<Character> stack = new ArrayDeque<Character>();
		String s = br.readLine();
		char[] chars = s.toCharArray();
		int sum=0;
		
		for(int i=0; i<chars.length; i++) {
			switch(chars[i]) {
				case '(' : stack.push(chars[i]); break;
				case ')' : 
					if(chars[i-1] == '(') {
						stack.pop();
						sum += stack.size();
					} else if(chars[i-1] == ')') {
						stack.pop();
						sum++;
					}
					break;
			}
			//System.out.println(i+"번째 이상 무");
		}
		
		System.out.println(sum);
		
	}

}