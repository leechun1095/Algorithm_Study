package lecture.data_structure1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;
import java.util.StringTokenizer;
public class Q10866 {
	
	public static Deque<Integer> dequeue = new ArrayDeque<Integer>(); // Double Ended Queue
	
	public static StringBuilder sb = new StringBuilder();
	
	public static void switchCommand(String command) {
		int item = 0;
		if(command.startsWith("push")) {
			StringTokenizer st = new StringTokenizer(command, " ");
			command = st.nextToken();
			item = Integer.parseInt(st.nextToken());
		}
		
		switch(command) {
		case "push_front":
			push_front(item);
			return;
		case "push_back":
			push_back(item);
			return;
		case "pop_front":
			pop_front();
			return;
		case "pop_back":
			pop_back();
			return;
		case "size":
			size();
			return;
		case "empty":
			empty();
			return;
		case "front":
			front();
			return;
		case "back":
			back();
			return;
		}
	}

	private static void push_front(int item) {
		dequeue.offerFirst(item);
	}
	
	private static void push_back(int item) {
		dequeue.offerLast(item);
	}
	
	private static void pop_front() {
		if(dequeue.size() == 0) {
			sb.append(-1).append("\n");
		} else {
			sb.append(dequeue.pollFirst()).append("\n");
		}
	}
	
	private static void pop_back() {
		if(dequeue.size() == 0) {
			sb.append(-1).append("\n");
		} else {
			sb.append(dequeue.pollLast()).append("\n");
		}
	}
	
	private static void size() {
		sb.append(dequeue.size()).append("\n");
	}
	
	private static void empty() {
		sb.append(dequeue.size() == 0? 1 : 0).append("\n");
	}
	
	private static void front() {
		if(dequeue.size() == 0) {
			sb.append(-1).append("\n");
		} else {
			sb.append(dequeue.peekFirst()).append("\n");
		}
	}
	
	private static void back() {
		if(dequeue.size() == 0) {
			sb.append(-1).append("\n");
		} else {
			sb.append(dequeue.peekLast()).append("\n");
		}
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			switchCommand(br.readLine());
		}
		System.out.println(sb);
		
		br.close();
	}
}
