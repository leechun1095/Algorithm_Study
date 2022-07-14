package lecture.graph;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1260 {
	
	static ArrayList<Integer>[] a; // 인접리스트
	static boolean[] c; // check
	
	public static void dfs(int x) {
		if(c[x]) {
			// 정점 x 이미 사용함
			return;
		}
		c[x] = true; // 사용한다
		
		System.out.print(x + " ");
		for(int y: a[x]) { // 정점 x와 연결된 정점들..
			if(!c[y]) {
				// 정점 y 아직 사용안함
				dfs(y);
			}
		}
	}
	
	public static void bfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(start); // 큐에 정점 start를 넣는다.
		
		c[start] = true; // 사용한다
		
		while(!q.isEmpty()) { // 큐 비울 때 까지 돌린다.
			int x = q.remove();
			System.out.print(x + " ");
			
			for(int y: a[x]) { // 정점 x와 연결된 정점들..
				if(!c[y]) {
					// 정점 y 아직 사용안함
					c[y] = true;
					q.add(y);
				}
			}
		}
	}
	
    public static void main(String args[]) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
    	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());
		
		// 인접리스트
		a = (ArrayList<Integer>[])new ArrayList[n+1];
		
		// 인접리스트 초기화
		for(int i=1; i<=n; i++) {
			a[i] = new ArrayList<Integer>();
		}
		
		// 인접리스트 채우기
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			a[u].add(v);
			a[v].add(u);
		}
		
		// 인접리스트 정렬
		for(int i=1; i<=n; i++) {
			Collections.sort(a[i]);
		}
		
		c = new boolean[n+1];
		dfs(start);
		
		System.out.println();
		
		c = new boolean[n+1];
		bfs(start);
    }
}
