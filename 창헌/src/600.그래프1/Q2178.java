package 그래프1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2178 {
	
	static int[][] map;
	static int N;
	static int M;
	static boolean[][] visited;
	static int[] dx = { -1, 1, 0, 0 }; //x방향배열-상하
	static int[] dy = { 0, 0, -1, 1 }; //y방향배열-좌우
	
	public static void main(String[] args) throws IOException {
		// 미로 탐색
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        // 입력받기
        map = new int[N][M];
        for(int i=0; i<N; i++) {
        	String[] line = br.readLine().split("");
        	
        	for(int j=0; j<M; j++) {
        		map[i][j] = Integer.parseInt(line[j]);
        	}
        }
        
        visited = new boolean[N][M];
        
        bfs(0, 0);
        System.out.println(map[N-1][M-1]); 
	}
	public static void bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		
		q.offer(new int[] {x,y});  // 맨 뒤에 node add
		visited[x][y] = true; 
		
		while(!q.isEmpty()) {
			int now[] = q.poll(); // 큐 맨 앞에 있는 값 반환 후 삭제
			int nowX = now[0];
			int nowY = now[1];
			
			// 상하좌우 4번만 돌려야함
			for(int i=0; i<4; i++) {
				int nextX = nowX + dx[i];
				int nextY = nowY + dy[i];
				
				if(nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) {  // 범위 체크
					continue;
				} else if(visited[nextX][nextY] == true || map[nextX][nextY] == 0) { // 방문 체크
					continue;
				}
				// 1, 0
				q.offer(new int[] {nextX, nextY});
				map[nextX][nextY] = map[nowX][nowY] + 1;
				visited[nextX][nextY] = true;
			}
		}
	}
}
