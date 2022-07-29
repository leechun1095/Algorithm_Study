package 그래프1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q16947 {
	static List<Integer>[] list = new ArrayList[3001];
    static int[] visited = new int[3001];
    static int[] dist = new int[3001];

	public static void main(String[] args) throws IOException {
		// 서울 지하철 2호선
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        for(int i=1; i<=n; i++) {
            list[i] = new ArrayList<>();
        }
/*
입력 :
4
1 3
4 3
4 2
1 2

출력 :
list[1] = [3, 2]
list[2] = [4, 1]
list[3] = [1, 4]
list[4] = [3, 2] 
 */
        // 인접 리스트
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int home = Integer.parseInt(st.nextToken());
            int target = Integer.parseInt(st.nextToken());

            list[home].add(target);
            list[target].add(home);
        }
			
         DFS(1, 0);
         
         for(int i=1; i<=n; i++)
             if(visited[i] == 2)
                 BFS(i);

         StringBuilder sb = new StringBuilder();
         for(int i=1; i<=n; i++)
             sb.append(dist[i]).append(' ');

         System.out.println(sb);
	}
	
	
	
	/*
    visited
    0 : 방문하지 않음
    1 : 방문, 사이클 X
    2 : 방문, 사이클 O
    */
    /*
    DFS
    -1 : 사이클을 못 찾음
    -2 : 사이클을 찾음 but, 사이클에 포함 X
    1 ~ n : 사이클을 찾음, 사이클에 포함 O
      결과적으로 visit는 0, 1, 2중 하나를 갖게 된다. 이때 0과 1은 중요치 않고 2가 중요하다.
      찾은 사이클에서 BFS를 실행해 지선으로 뻗어나갈 것 이기 때문
    */
	
    // before -> x
	static int DFS(int x, int before){
		// x는 이미 방문한 곳이라면, 해당 정점을 리턴한다.
		if(visited[x] == 1) {
			return x;
		}
		
		visited[x] = 1; // 방문 표시
		
		for(int next:list[x]) {
			if(next == before) {	// before -> x -> next(=before) 인 경우 pass
				continue;
			}
			
			int result = DFS(next, x);  // 사이클을 찾은 경우 처음 시작한 정점을 리턴하게 된다.
			
			if(result == -2) {
				return -2;
			} 
			
			if(result > 0) {
				visited[x] = 2; // 방문 + 사이클 O
				
				// 이부분 이해 안됨..
				if(x == result) {
					return -2;
				} else {
					return result;
				}
			}
		}
		return -1;
	}
	     
    
    static boolean[] check = new boolean[3001];
    static void BFS(int x){
    	Queue<Integer> Q = new LinkedList<>();

        check[x] = true;
        Q.add(x);

        while(!Q.isEmpty()){
            int cur = Q.poll();

            for(int next:list[cur])
                if(visited[next] != 2 && !check[next]){

                    check[next] = true;
                    dist[next] = dist[cur] + 1;
                    Q.add(next);
                }
        }
    }
}
