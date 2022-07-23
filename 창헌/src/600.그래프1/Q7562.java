package 그래프1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q7562 {
	
	static int[] dx = {-2,-1,2,1,-2,-1,1,2};
    static int[] dy = {1,2,1,2,-1,-2,-2,-1};
    static int[][] map;
    static boolean[][] visited;
    static int x,y,gx,gy,N;
    static int answer = 0;
    
	public static void main(String[] args) throws IOException {
		// 나이트의 이동
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
		StringTokenizer st;
        
        int T = Integer.parseInt(br.readLine()); // testCase
        
        while(T-- > 0) {
        	N = Integer.parseInt(br.readLine()); // 체스판 길이
        	
        	map = new int[N][N];
        	visited = new boolean[N][N];
        	
        	st = new StringTokenizer(br.readLine()); // 나이트 시작 좌표
        	x = Integer.parseInt(st.nextToken());
        	y = Integer.parseInt(st.nextToken());
        	
        	st = new StringTokenizer(br.readLine()); // 나이트 종료 좌표
        	gx = Integer.parseInt(st.nextToken());
        	gy = Integer.parseInt(st.nextToken());

        	bfs();
        	sb.append(map[gx][gy]).append("\n");
        }
        System.out.println(sb);
        
	}
	public static void bfs() {
        if(x == gx && y == gy){
            return;
        }

        Queue<Integer> queuex = new LinkedList<>();
        Queue<Integer> queuey = new LinkedList<>();

        queuex.add(x);
        queuey.add(y);
        visited[x][y] = true;

        while(!queuex.isEmpty()){
            int a = queuex.poll();
            int b = queuey.poll();

            for(int i = 0; i<dx.length;i++){
                int x1 = a + dx[i];
                int y1 = b + dy[i];

                if(x1>=0 && x1<N && y1>=0 && y1<N && !visited[x1][y1]){
                    queuex.add(x1);
                    queuey.add(y1);

                    visited[x1][y1] = true;

                    map[x1][y1] = map[a][b] + 1;
                }
            }
        }
    }
}
