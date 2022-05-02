package 자료구조1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Queue {
	private int[] queue;
	private int startIndex = 0;
	private int endIndex = 0;
	
	Queue(){
		
	}
	
	Queue(int number){
		queue = new int[number];
	}
	
	public void push(int x) {
		queue[endIndex] = x;
		endIndex += 1;
	}
	
	// empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
	public boolean isEmpty() {
		if(startIndex == endIndex) {
			return true;
		} else {
			return false;
		}
	}
	
	public int size() {
		return endIndex - startIndex;
	}
	
	// front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	public int front() {
		if(isEmpty()) {
			return -1;
		} else {
			return queue[startIndex];
		}
	}
	
	// back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	public int back() {
		if(isEmpty()) {
			return -1;
		} else {
			return queue[endIndex -1];
		}
	}
	
	// pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	public int pop() {
		if(isEmpty()) {
			return -1;
		} else {
			startIndex += 1;
			return queue[startIndex -1];
		}
	}
}
public class Q10845 {

	public static void main(String[] args) throws IOException {
		// 큐 구현 문제
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N  = Integer.parseInt(br.readLine());
        Queue queue = new Queue(N);
		
        for(int i=0; i<N; i++) {
        	String cmd = br.readLine();
        	
        	switch(cmd) {
        		case "push":
        			int x = Integer.parseInt(br.readLine());
        			queue.push(x);
        			break;
        		case "pop":
        			sb.append(queue.pop()).append('\n');
        			break;
        		case "empty":
        			if(queue.isEmpty()) {
        				sb.append(1).append('\n');
        			} else {
        				sb.append(0).append('\n');
        			}
        			break;
        		case "front":
        			sb.append(queue.front()).append('\n');
        			break;
        		case "back":
        			sb.append(queue.back()).append('\n');
        			break;
        		case "size":
        			sb.append(queue.size()).append('\n');
        			break;
        	}
        }
        br.close();
        System.out.println(sb);
	}
}






























