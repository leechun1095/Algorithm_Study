package 그래프1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q16929 {
	
	static int N, M;
	static char[][] map = new char[50][50];
	static boolean[][] visited = new boolean[50][50];
	static int[][] dist = new int[50][50];
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	
    static boolean DFS(int x, int y, int cnt){
    	
    	// 이미 왔던 곳을 방문한 경우
        if(visited[x][y]) {
        	// 4개의 점 이상을 이동하여 제자리로 온 경우 한 사이클을 돌았다고 본다. 
        	return cnt - dist[x][y] >= 4;  
        }

        visited[x][y] = true;
        dist[x][y] = cnt;
        
        for(int i=0; i<4; i++) {
        	int nx = x + dx[i];
            int ny = y + dy[i];
            
            if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
            	continue;            	
            }
            
            // color 같은지 체크
            if (map[nx][ny] != map[x][y]) {
            	continue;            	
            }
            
            if(DFS(nx, ny, cnt+1)) {
            	return true;
            }
        }
        return false;
    }
    
	public static void main(String[] args) throws IOException {
		// Two Dots
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        // 입력 받기
        for(int i=0; i<N; i++) {
        	String str = br.readLine();
        	
        	for(int j=0; j<M; j++) {
        		map[i][j] = str.charAt(j); 
        	}
        }
        
        String result = "No";
        
        for(int i=0; i<N; i++) {
        	for(int j=0; j<M; j++) {
        		// 0, 0부터 시작
        		if(!visited[i][j]) {
        			if(DFS(i, j, 0)) {
        				result = "Yes";
        			}
        		}
        	}
        }
        System.out.println(result);
	}
}
