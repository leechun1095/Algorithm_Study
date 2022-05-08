import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader
		           (new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int num1 = Integer.parseInt(br.readLine());
		Deque<Integer> Deque = new ArrayDeque<>();
		String[] s;
		
		for (int i = 0; i < num1; i++) {
			 s = br.readLine().split(" ");
			 switch (s[0]) {
			 case "push_front" : 
				 Deque.addLast(Integer.parseInt(s[1]));
				 break;
			 case "push_back" : 
				 Deque.addFirst(Integer.parseInt(s[1]));
				 break;
			 case "pop_front" : 
				 if(Deque.size() == 0) {
					 sb.append(-1).append('\n');
				 } else {
					 sb.append(Deque.pollLast()).append('\n');
				 }
				 
				 break;
			 case "pop_back" : 
				 if(Deque.size() == 0) {
					 sb.append(-1).append('\n');
				 } else {
					 sb.append(Deque.pollFirst()).append('\n');
				 }
				 
				 break;
			 case "size" : 
				 sb.append(Deque.size()).append('\n');
				 break;
			 case "empty" : 
				 if(Deque.size() == 0) {
					 sb.append(1).append('\n');
				 } else {
					 sb.append(0).append('\n');
				 }
				 break;
			 case "front" : 
				 if(Deque.size() == 0) {
					 sb.append(-1).append('\n');
				 } else {
					 sb.append(Deque.peekLast()).append('\n');
				 }
				 break;
			 case "back" : 
				 if(Deque.size() == 0) {
					 sb.append(-1).append('\n');
				 } else {
					 sb.append(Deque.peek()).append('\n');
				 }
				 break;
			 }
			 
			 System.out.print(sb);
			 sb.setLength(0);
		}
	}
}