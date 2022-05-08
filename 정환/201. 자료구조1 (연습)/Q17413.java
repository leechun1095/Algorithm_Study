import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Deque<Character> stack = new ArrayDeque<>();
		boolean sw = false; // < 일 경우 true, >일 경우 false 
		String s = br.readLine();
		char[] chars = s.toCharArray();
		
		for(int i=0; i<chars.length; i++) {
			if(chars[i] == '<') {
				while(!stack.isEmpty()) {
					sb.append(stack.pop());
				}
				sw = true;
				sb.append('<');
			} else if (chars[i] == '>') {
				sw = false;
				sb.append('>');
			} else if (sw) {
				sb.append(chars[i]);
			} else if (!sw) {
				if(chars[i]==' ') {
					while(!stack.isEmpty()) {
						sb.append(stack.pop());
					}
					sb.append(' ');
				} else if (i == chars.length-1) {
					stack.push(chars[i]);
					while(!stack.isEmpty()) {
						sb.append(stack.pop());
					}
				} else {
					stack.push(chars[i]);
				}
			}
		}
		System.out.println(sb);
	}
}