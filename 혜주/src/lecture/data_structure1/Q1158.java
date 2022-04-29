package lecture.data_structure1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class Q1158 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i=1; i<=N; i++) {
			queue.add(i);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		int cnt = 1;
		
		while(!queue.isEmpty()) {
			if(cnt == K) {
				sb.append(queue.poll());
				cnt = 1;
				if(queue.size() > 0) {
					sb.append(", ");
				} else {
					sb.append(">");
				}
			} else {
				queue.add(queue.poll());
				cnt++;
			}
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
