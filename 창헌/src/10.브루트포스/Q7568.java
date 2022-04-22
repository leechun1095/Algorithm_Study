package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q7568 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[N][2];
		String[] str = new String[N];
		
		for(int i=0; i<N; i++) {
			str = br.readLine().split(" ");
			arr[i][0] = Integer.parseInt(str[0]);
			arr[i][1] = Integer.parseInt(str[1]);
		}
		
		for(int i=0; i<N; i++) {
			int rank = 1;
			
			for(int j=0; j<N; j++) {
				// 자기 자신 pass
				if(i == j) {
					continue;
				}
				
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					rank++;
				}
			}
			System.out.print(rank + " ");
		}	
		
		
		// input 데이터 확인
//		for(int i=0; i<N; i++) {
//		for(int j=0; j<2; j++) {	
//				System.out.println(arr[i][j]);
//			}
//		}
	}

}
