package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q14500 {

	public static void main(String[] args) throws IOException {
		// 테트로미노
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		String[] str = br.readLine().split(" ");

		int N = Integer.parseInt(str[0]); // 세로 (4 ≤ N)
		int M = Integer.parseInt(str[1]); // 가로 (M ≤ 500)
		
		int[][] a = new int[500][500];
		
		// i = 세로 (N)
		// j = 가로 (M)
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<M; j++) {
				a[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		/*
		for(int i=0; i<N; i++) {
			System.out.println();
			for(int j=0; j<M; j++) {
				System.out.print(arr[i][j] + " ");
			}
		}
		*/
		
		int result = 0;
		
		// i = 세로 (N)
		// j = 가로 (M)
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {  
				// ㅡ : 1가지
				if(j+3 < M) {   // N * (M-3) => [ j < M-3 ] = [ j+3 < M ] 
					int temp = a[i][j] + a[i][j+1] + a[i][j+2] + a[i][j+3];
					if(result < temp) {
						result = temp;
					}
				}
				// | : 1가지
				if(i+3 < N) {	// (N-3) * M => [ i < N-3 ] = [ i+3 < N ]
					int temp = a[i][j] + a[i+1][j] + a[i+2][j] + a[i+3][j];
					if(result < temp) {
						result = temp;
					}
				}
				// ㅁ : 1가지
				if(i+1 < N && j+1 < M) { // (N-1) * (M-1) => [ i < N-1 ], [ j < M-1 ]
					int temp = a[i][j] + a[i][j+1] + a[i+1][j] + a[i+1][j+1];
					if(result < temp) {
						result = temp;
					}
				}
				// ㅁ 
				// ㅁ
				// ㅁ ㅁ     3 * 2  => i+2, j+1  (= 자기자신이 1)
				if(i+2 < N && j+1 < M) {
					int temp = a[i][j] + a[i+1][j] + a[i+2][j] + a[i+2][j+1];
					if(result < temp) {
						result = temp;
					}
				}
				// *** 마이너스 
				//  ㅁ
				//  ㅁ
				// ㅁㅁ
				if(i+2 < N && j-1 >= 0) {
					int temp = a[i][j] + a[i+1][j] + a[i+2][j] + a[i+2][j-1];
					if(result < temp) {
						result = temp;
					}
				}
				// ㅁㅁ
				// ㅁ
				// ㅁ
				if(i+2 < N && j+1 < M) {
					int temp = a[i][j] + a[i][j+1] + a[i+1][j] + a[i+2][j];
					if(result < temp) {
						result = temp;
					}
				}
				// ㅁㅁ
				//   ㅁ
				//   ㅁ
				if(i+2 < N && j+1 < M) {
					int temp = a[i][j] + a[i][j+1] + a[i+1][j+1] + a[i+2][j+1];
					if(result < temp) {
						result = temp;
					}
				}
				// ㅁ
				// ㅁㅁㅁ
				if(i+1 < N && j+2 < M) {
					int temp = a[i][j] + a[i+1][j] + a[i+1][j+1] + a[i+1][j+2];
					if(result < temp) {
						result = temp;
					}
				}
				
				// ㅁㅁㅁ
				// ㅁ
				if(i+1 < N && j+2 < M) {
					int temp = a[i][j] + a[i][j+1] + a[i][j+2] + a[i+1][j];
					if(result < temp) {
						result = temp;
					}
				}
				
				// ㅁㅁㅁ
				//    ㅁ
				if(i+1 < N && j+2 < M) {
					int temp = a[i][j] + a[i][j+1] + a[i][j+2] + a[i+1][j+2];
					if(result < temp) {
						result = temp;
					}
				}
				// *** 마이너스 
				//    ㅁ
				// ㅁㅁㅁ
				if(i-1 >= 0 && j+2 < M) {
					int temp = a[i][j] + a[i][j+1] + a[i][j+2] + a[i-1][j+2];
					if(result < temp) {
						result = temp;
					}
				}
				// ㅁ  
				// ㅁㅁ 
				//  ㅁ 
				if(i+2 < N && j+1 < M) {
					int temp = a[i][j] + a[i+1][j] + a[i+1][j+1] + a[i+2][j+1];
					if(result < temp) {
						result = temp;
					}
				}
				//  ㅁ
				// ㅁㅁ
				// ㅁ
				if(i+2 < N && j-1 >= 0) {
					int temp = a[i][j] + a[i+1][j] + a[i+1][j-1] + a[i+2][j-1];
					if(result < temp) {
						result = temp;
					}
				}
				// ㅁㅁ
				//   ㅁㅁ
				if(i+1 < N && j+2 < M) {
					int temp = a[i][j] + a[i][j+1] + a[i+1][j+1] + a[i+1][j+2];
					if(result < temp) {
						result = temp;
					}
				}
				//  ㅁㅁ
				// ㅁㅁ
				if(i-1 >= 0 && j+2 < M ) {
					int temp = a[i][j] + a[i][j+1] + a[i-1][j+1] + a[i-1][j+2]; 
					if(result < temp) {
						result = temp;
					}
				}
				if(j+2 < M) {
					int temp = a[i][j] + a[i][j+1] + a[i][j+2];
					//  ㅁ
					// ㅁㅁㅁ
					if(i-1 >= 0) {
						int temp2 = temp + a[i-1][j+1];
						if(result < temp2) {
							result = temp2;
						}
					}
					// ㅁㅁㅁ
					//  ㅁ
					if(i+1 < N) {
						int temp2 = temp + a[i+1][j+1];
						if(result < temp2) {
							result = temp2;
						}
					}
				}
				
				if(i+2 < N) {
					int temp = a[i][j] + a[i+1][j] + a[i+2][j];
					// ㅁ
					// ㅁㅁ
					// ㅁ
					if(j+1 < M) {
						int temp2 = temp + a[i+1][j+1];
						if(result < temp2) {
							result = temp2;
						}
					}
					//  ㅁ
					// ㅁㅁ
					//  ㅁ
					if(j-1 >= 0) {
						int temp2 = temp + a[i+1][j-1];
						if(result < temp2) {
							result = temp2;
						}
					}
				}
			}
		}
		br.close();
		System.out.println(result);
	}
}
