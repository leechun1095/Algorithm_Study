package 그래프1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q7576 {
	
	static int[][] map;
	static int N;
	static int M;
	// static boolean[][] visited;
	static int[] dx = { -1, 1, 0, 0 }; //x방향배열-상하
	static int[] dy = { 0, 0, -1, 1 }; //y방향배열-좌우
	static Queue<int[]> q = new LinkedList<>();
	
	public static void main(String[] args) throws IOException {
		// 토마토
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        
        
        
        // 입력받기
        map = new int[N][M];              
        for(int i=0; i<N; i++) {
        	st = new StringTokenizer(br.readLine());
        	
        	for(int j=0; j<M; j++) {
        		map[i][j] = Integer.parseInt(st.nextToken());
        		if(map[i][j] == 1) {
        			q.offer(new int[] {i,j});
        		}
        	}
        }

        System.out.println(bfs());
	}
	public static int bfs() {
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
				}
				if(map[nextX][nextY] == 0) {
					map[nextX][nextY] = map[nowX][nowY] + 1;
					q.offer(new int[] {nextX, nextY});				
				}
			}
		}
		
		int result = Integer.MIN_VALUE;
		if(checkZero()) {
			return -1;
		} else {
			for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (result < map[i][j]) {
                    	result = map[i][j];
                    }
                }
            }
			return result - 1; 
		}
	}
	
	public static boolean checkZero() {
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(map[i][j] == 0) {
					return true;
				}
			}
		}
		return false;
	}
}
