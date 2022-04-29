package lecture.data_structure1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
public class Q10845 {
	
	public static int[] queue;
	public static int begin = 0;
	public static int end = 0;
	public static StringBuilder sb = new StringBuilder();
	
	public static void switchCommand(String command) {
		int item = 0;
		if(command.startsWith("push")) {
			StringTokenizer st = new StringTokenizer(command, " ");
			command = st.nextToken();
			item = Integer.parseInt(st.nextToken());
		}
		
		switch(command) {
		case "push":
			push(item);
			return;
		case "pop":
			pop();
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

	private static void push(int item) {
		queue[end++] = item;
	}
	
	private static void pop() {
		if(begin == end) {
			sb.append(-1).append("\n");
		} else {
			sb.append(queue[begin++]).append("\n");
			queue[begin-1] = 0;
		}
	}
	
	private static void size() {
		sb.append(end-begin).append("\n");
	}
	
	private static void empty() {
		sb.append(begin == end? 1 : 0).append("\n");
	}
	
	private static void front() {
		if(begin == end) {
			sb.append(-1).append("\n");
		} else {
			sb.append(queue[begin]).append("\n");
		}
	}
	
	private static void back() {
		if(begin == end) {
			sb.append(-1).append("\n");
		} else {
			sb.append(queue[end-1]).append("\n");
		}
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		
		queue = new int[N];
		
		for(int i=0; i<N; i++) {
			switchCommand(br.readLine());
		}
		System.out.println(sb);
		
		br.close();
	}
}
