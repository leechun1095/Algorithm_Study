package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1018_2 {
	
	public static boolean[][] arr;
	public static int min =64;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		
		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);
		
		//  W 일 때는 true, B 일때는 false
		arr = new boolean[N][M];
		
		for(int i=0; i<N; i++) {
			String str1 = br.readLine();
			
			for(int j=0; j<M; j++) {
				if(str1.charAt(j) == 'W') {
					arr[i][j] = true;
				} else {
					arr[i][j] = false;
				}
			}
		}
		
		// 이해 불가. . . .
		int N_row = N - 7;
		int M_col = M - 7;
		
		for(int i=0; i<N_row; i++) {
			for(int j=0; j<M_col; j++) {
				find(i, j);
			}
		}
		System.out.println(min);
		
	}
	public static void find(int x, int y) {
		int end_x = x + 8;
		int end_y = y + 8;
		int count = 0;
		
		boolean TF = arr[x][y]; // 첫번째 칸의 색 ? ? ? ?
		
		for(int i=x; i<end_x; i++) {
			
			for(int j=y; j<end_y; j++) {
				
				// 올바른 색이 아닐경우 cnt 1증가
				if(arr[i][j] != TF) {
					count++;
				}
				
				// 다음 칸은 색이 바뀌므로 true -> false, false -> true 변경
				TF = (!TF);
			}
			TF = (!TF);
		}
		/*
		 *  첫 번째 칸을 기준으로 할 때의 색칠 할 개수(count)와
		 *  첫 번째 칸의 색의 반대되는 색을 기준으로 할 때의
		 *  색칠 할 개수(64 - count) 중 최솟값을 count 에 저장 
		 */
		count = Math.min(count, 64 - count);
		
		/*
		 * 이전까지의 경우 중 최솟값보다 현재 count 값이
		 * 더 작을 경우 최솟값을 갱신 
		 */
		min = Math.min(min, count);		
	}
	
}












