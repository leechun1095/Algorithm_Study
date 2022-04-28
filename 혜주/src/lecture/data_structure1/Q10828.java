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
public class Q10828 {
	
	public static int[] stack = new int[10000];
	public static int size = 0;
	
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
		case "top":
			top();
			return;
		}
	}
	
	private static void push(int item) {
		stack[size++] = item;
	}
	
	private static void pop() {
		if(size == 0) {
			System.out.println(-1);
		} else {
			System.out.println(stack[size-1]);
			stack[size-1] = 0;
			size--;
		}
	}
	
	private static void size() {
		System.out.println(size);
	}
	
	private static void empty() {
		System.out.println(size == 0? 1 : 0);
	}
	
	private static void top() {
		if(size == 0) {
			System.out.println(-1);
		} else {
			System.out.println(stack[size-1]);
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		
		
		for(int i=0; i<N; i++) {
			switchCommand(br.readLine());
		}
		
		br.close();
	}
}
