package 그래프1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q1707 {
	
	static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
	static int [] visited;
	
	public static void main(String[] args) throws IOException {
		// 이분 그래프
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        
        int T = Integer.parseInt(br.readLine()); // testCase
        
        while(T-- > 0) {
        	st = new StringTokenizer(br.readLine());
        	int N = Integer.parseInt(st.nextToken()); // 정점의 수
        	int M = Integer.parseInt(st.nextToken()); // 간선의 수
        	
        	for(int i=0; i<=N; i++) {
            	list.add(new ArrayList<>());
            }
            
        	// 0 : 방문 X,  1 : par1 방문,  2: part2 방문
            visited = new int[N+1];  // 정점의 방문 여부
                        
            // 인접 리스트 Insert
            for(int i=1; i<=M; i++) {
            	st = new StringTokenizer(br.readLine(), " ");
    			int from = Integer.parseInt(st.nextToken());
    			int to = Integer.parseInt(st.nextToken());
    			
    			list.get(from).add(to);
    			list.get(to).add(from);
            }
            
            // 정렬
            for(int i=0; i<list.size(); i++) {
            	Collections.sort(list.get(i));
            }
            
            for(int i=1; i<=N; i++) {
            	if(visited[i] == 0) { // 정점 i가 방문X인 상태라면
            		dfs(i, 1);
            	}
            }
            
            boolean ok = true;
            for(int i=1; i<=N; i++) {
            	for(int k=0; k<list.get(i).size(); k++) {
            		int j = list.get(i).get(k);
        			
            		if(visited[i] == visited[j]) {
        				ok = false;
        			}
            	}
            }
            
            if(ok) {
            	sb.append("YES").append("\n");
            } else {
            	sb.append("NO").append("\n");
            }
        }
        System.out.println(sb);
        
	}
	public static void dfs(int node, int color) {
		visited[node] = color;
		// System.out.print(node + " ");	// 방문했기 때문에 정점 출력
		
		// 바깥쪽 ArrayList의 인덱스인 정점과 연결된 정점을 탐색
		for(int i=0; i<list.get(node).size(); i++) {
			int next = list.get(node).get(i);
			
			if(visited[next] == 0) { // 연결된 정점이 방문한 적 없다면
				dfs(next, 3-color);
			}
		}
	}
}
