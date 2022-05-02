package 자료구조1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10828 {
	
	public static int[] stackArr;
	public static int size = -1;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		stackArr = new int[N];
		
		for(int i=0; i<N; i++) {
			String[] str = br.readLine().split(" ");
			
			if(str[0].equals("push")) {
				push(Integer.parseInt(str[1]));
				
			} else if(str[0].equals("pop")) {
				sb.append(pop()).append('\n');
			} else if(str[0].equals("size")) {
				sb.append(size()).append('\n');
			} else if(str[0].equals("empty")) {
				sb.append(empty()).append('\n');
			} else if(str[0].equals("top")) {
				sb.append(peak()).append('\n');
			}
		}
		System.out.println(sb);
	}
	public static void push(int item) {
		stackArr[++size] = item;
	}
	
	public static int pop() {
		if(size == -1) {
			return -1;
		} else {
			int temp = stackArr[size];
			size--;
			return temp;
		}
	}
	
	public static int size() {
		return size+1;
	}
	
	public static int empty() {
		if(size == -1) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public static int peak() {
		if(size == -1) {
			return -1;
		} else {
			return stackArr[size];
		}
	}
}
















