package 그래프1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1260 {
	
	// static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
	static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException {
		// DFS와 BFS
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        
        for(int i=0; i<=N; i++) {
        	list.add(new ArrayList<>());
        }
        
        visited = new boolean[N+1];
        
        for(int i=1; i<=M; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			
			list.get(from).add(to);
			list.get(to).add(from);
        }
        
        // 인접 리스트 출력
    	// list
    	// []
    	// [2, 3, 4]
    	// [1, 4]
    	// [1, 4]
    	// [1, 2, 3]
        for(int i=0; i<list.size(); i++) {
        	Collections.sort(list.get(i));
        }
        
        /*
        for(ArrayList<Integer> result : list) {
			System.out.println(result);
		}
		*/
        
        dfs(V);
        visited = new boolean[N+1];
        System.out.println();
        bfs(V);
	}
	
	public static void dfs(int node) {
		visited[node] = true;
		System.out.print(node + " ");	// 방문했기 때문에 정점 출력
		
		// 바깥쪽 ArrayList의 인덱스인 정점과 연결된 정점을 탐색
		for(int i=0; i<list.get(node).size(); i++) {
			if(!visited[list.get(node).get(i)]) { 	// 연결된 정점이 방문한 적 없다면
				dfs(list.get(node).get(i));
			}
		}
		/*
		for(int value : map.get(v)){
            if(!visited[value]){
                dfs(value);
            }
        }
		 */
	}
	
	public static void bfs(int node) {
		Queue<Integer> q = new LinkedList<>();
		
		q.offer(node);  // 맨 뒤에 node add
		visited[node] = true;
		
		while(!q.isEmpty()) {
			int value = q.poll(); // 큐 맨 앞에 있는 값 반환 후 삭제
			System.out.print(value + " ");
			
			for(int i=0; i<list.get(value).size(); i++) {
				if(!visited[list.get(value).get(i)]) {
					visited[list.get(value).get(i)] = true;
					q.offer(list.get(value).get(i));
				}
			}
			
			
			/*
			for(int e : map.get(value)){
                if(!visited[e]){
                    visited[e] = true;
                    q.offer(e);
                }
            }
			*/
		}
	}
}