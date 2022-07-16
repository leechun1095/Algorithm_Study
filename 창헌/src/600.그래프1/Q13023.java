package 그래프1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

class Edge{
	int from, to;
	Edge(int from, int to){
		this.from = from;
		this.to = to;
	}
	public String getEdges() {
		return from + ", " + to;
	}

	public int getTo() {
		return to;
	}
}

public class Q13023 {
	
	public static void main(String[] args) throws IOException {
		// ABCDE
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken()); // 사람 수
		int M = Integer.parseInt(st.nextToken()); // 관계(간선) 수
		
		// 인접행렬을 저장하기 위한 공간
		boolean[][] a = new boolean[N][N];

		// 인접리스트를 저장하기 위한 배열
		ArrayList<Integer>[] list = new ArrayList[N];
		
		// 간선 리스트
		ArrayList<Edge> edges = new ArrayList<Edge>();
		
		// 인접리스트 N개 생성
		for(int i=0; i<N; i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		/*
		for(ArrayList<Integer> result : list) {
			System.out.println(result);
		}
		System.out.println(list.length);
		*/
		
		// 
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());

			// 인접행렬
			a[from][to] = a[to][from] = true;
			
			// 인접 리스트
			list[from].add(to);
			list[to].add(from);
			
			// 간선리스트
			edges.add(new Edge(from, to));
			edges.add(new Edge(to, from));
		}
		
		/* 인접행렬 출력
		for(int i=0; i<N; i++) {
			System.out.println();
			for(int j=0; j<N; j++) {
				System.out.print(a[i][j] + ", ");
			}
		}
		*/
		/* 인접 리스트 출력
		for(ArrayList<Integer> result : list) {
			System.out.println(result);
		}
		*/
		/* 간선리스트 출력
		for(int i=0; i<edges.size(); i++) {
			System.out.println(edges.get(i).getEdges());
		}
		*/
		
		
		// 간선은 양방향이므로 곱하기 2
		M = M*2;
		// A <-> B,  C <-> D  친구인지 확인 [ 간선리스트 사용 ] 
		for(int i=0; i<M; i++) {
			for(int j=0; j<M; j++) {
				// A -> B
				int A = edges.get(i).from;
				int B = edges.get(i).to;
				
				// C -> D
				int C = edges.get(j).from;
				int D = edges.get(j).to;
				
				if(A==B || A==C || A==D || B==C || B==D || C==D) {
					continue;
				}
				
				// B <-> C 친구인지 확인 [ 인접행렬 사용 ]
				if(!a[B][C]) {
					continue;
				}
				
				// D <-> E 친구인지 확인 [ 인접리스트 사용 ]
				for(int E : list[D]) {
					if(A==E || B==E || C==E || D==E) {
						continue;
					}
					
					System.out.println(1);
					System.exit(0);
				}
				// System.out.println("["+i+", "+j+"] : " + A +", " + B +", " + C +", " + D );
			}
		}
		System.out.println(0);
	}
}
