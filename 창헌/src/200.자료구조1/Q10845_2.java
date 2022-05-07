package 자료구조1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


public class Q10845_2 {

	public static void main(String[] args) throws IOException {
		// 큐 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Queue<Integer> queue = new LinkedList<>();
		int N  = Integer.parseInt(br.readLine());
        
		int x = 0;
		
        for(int i=0; i<N; i++) {
        	
        	String[] cmd = br.readLine().split(" ");
        	
        	switch(cmd[0]) {
        		case "push":
        			x = Integer.parseInt(cmd[1]);
        			queue.add(x);
        			break;
        		case "pop":
        			if(queue.isEmpty()) {
        				sb.append(-1).append('\n');
        			} else {
        				sb.append(queue.poll()).append('\n');
        			}
        			break;
        		case "empty":
        			if(queue.isEmpty()) {
        				sb.append(1).append('\n');
        			} else {
        				sb.append(0).append('\n');
        			}
        			break;
        		case "front":
        			if(queue.isEmpty()) {
        				sb.append(-1).append('\n');
        			} else {
        				sb.append(queue.peek()).append('\n');        				
        			}
        			break;
        		case "back":
        			if(queue.isEmpty()) {
        				sb.append(-1).append('\n');
        			} else {
        				sb.append(x).append('\n');        				
        			}
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