package step.I_재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11729 {
	
	public static StringBuilder sb = new StringBuilder();
	public static int cnt;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		fnHanoi(n, 1, 2, 3);
		
		sb.insert(0, cnt + "\n");
		
		System.out.println(sb);
		
		br.close();
	}

	private static void fnHanoi(int n, int start, int mid, int to) {
		++cnt;
		
		if(n==1) {
			sb.append(start + " " + to + "\n");
			return;
		}
		
		fnHanoi(n-1, start, to, mid);
		
		sb.append(start + " " + to + "\n");
		
		fnHanoi(n-1, mid, start, to);
		
	}

}
