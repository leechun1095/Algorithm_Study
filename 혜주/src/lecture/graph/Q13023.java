package lecture.graph;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

class Edge {
	int from, to;
	Edge(int from, int to){
		this.from = from;
		this.to = to;
	}
}
// A-B-C-D-E
public class Q13023 {
    public static void main(String args[]) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
    	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		// 인접행렬
		boolean[][] a = new boolean[n][n];
		
		// 인접리스트
		ArrayList<Integer>[] g = (ArrayList<Integer>[])new ArrayList[n];
		//  g[0] = [1, 3]
		//, g[1] = [0, 2, 4]
		//, g[2] = [1, 3]
		//, g[3] = [2, 0]
		//, g[4] = [1] 
		
		// 간선리스트
		ArrayList<Edge> edges = new ArrayList<Edge>();
//		0 1
//		1 0
//		1 2
//		2 1
//		2 3
//		3 2
//		3 0
//		0 3
//		1 4
//		4 1
		
		for(int i=0; i<n; i++) {
			g[i] = new ArrayList<Integer>();
		}
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			
			// 1. 인접행렬
			a[from][to] = a[to][from] = true;
			
			// 2. 인접리스트
			g[from].add(to);
			g[to].add(from);
			
			// 3. 간선리스트
			// 방향 없는 그래프(양방향 그래프) 이므로 양방향 저장
			edges.add(new Edge(from, to));
			edges.add(new Edge(to, from));
		}
		
		m *= 2; // 양방향: edges(간선리스트) 길이 만큼
		for(int i=0; i<m; i++) {
			for(int k=0; k<m; k++) {
				
				// A-B <-> C-D
				
				// A -> B
				int A = edges.get(i).from;
				int B = edges.get(i).to;
				// C -> D
				int C = edges.get(k).from;
				int D = edges.get(k).to;
				
				if (A == B || A == C || A == D || B == C || B == D || C == D) {
					// A,B,C,D가 다 다른 정점이어야 됨
                    continue;
                }
				
				// B -> C
				if(!a[B][C]) {
					// B-C 연결안됨
					continue;
				}
				
				// D -> E
				for(int E: g[D]) {
					if (A == E || B == E || C == E || D == E) {
						// D와 연결된 E는 A,B,C,D 가 아닌 다른 정점이어야 됨
                        continue;
                    }
					
					System.out.println(1); // 찾았다
					System.exit(0);
				}
			}
			
		}
		System.out.println(0);
    }

//4-1-2-3-0    
    
}
