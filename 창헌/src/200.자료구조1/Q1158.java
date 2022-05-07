package 자료구조1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Q1158 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Queue<Integer> queue = new LinkedList<>();
		
		String[] str = br.readLine().split(" ");
		int N = Integer.parseInt(str[0]);
		int K = Integer.parseInt(str[1]);
		
		int num = 0;
		sb.append("<");
		
		for(int i=1; i<=N; i++) {
			queue.add(i);
		}
		
		while(queue.size() != 1) {
		
			for(int i=1; i<=K; i++) {
				
				if(i == K) {
					// pop
					num = queue.poll();
					sb.append(num).append(", ");
				} else {
					// pop
					num = queue.poll();
					queue.add(num);
				}
			}
		}
		br.close();
		sb.append(queue.poll()).append(">");
		System.out.println(sb);
	}
}
