package 그래프1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2146 {
	static int n;
	static int[][] map;
	static boolean[][] visited;
	static Queue<int[]> q;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	// https://loosie.tistory.com/224
	public static void main(String[] args) throws IOException {
		// 다리 만들기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		map = new int[n][n];
		visited = new boolean[n][n];
		q = new LinkedList<>();
		
		StringTokenizer st;
		// 입력 받기
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		IslandCount();
		
		
	}
	
	static void IslandCount() {

		int idx = 2; 
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(!visited[i][j] && map[i][j] != 0) {
					map[i][j] = idx;
					visited[i][j] =true;
					q.add(new int[] {j,i});
					
					while(!q.isEmpty()) {
						int[] pos = q.poll();
						int px = pos[0];
						int py = pos[1];
						
						for(int d=0; d<4; d++) {
							int nx = px + dx[d];
							int ny = py + dy[d];
							
							if(nx<0 || nx>n-1 || ny <0 || ny>n-1) continue;
							if(visited[ny][nx]) continue;
							
							if(map[ny][nx] == 1) {
								visited[ny][nx] = true;
								map[ny][nx] = idx;
								q.add(new int[] {nx,ny});
							}
						}
					}
					idx++;
				}
			}
			
		}
		
	}
}
