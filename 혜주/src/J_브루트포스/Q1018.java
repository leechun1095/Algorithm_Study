package J_브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Q1018 {
	
	public static boolean[][] arr;
	public static int min = 64;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		
		arr = new boolean[N][M];
		for(int i=0; i<N;i++) {
			char[] charArr= br.readLine().toCharArray();
			for(int k=0; k<M;k++) {
				arr[i][k] = charArr[k] == 'W';
			}
		}
		
		for(int i=0; i<N-7;i++) {
			for(int k=0; k<M-7;k++) {
				find(i, k);
			}
		}
		
		System.out.println(min);
		
		br.close();
	}

	private static void find(int x, int y) {
		int end_x = x+8;
		int end_y = y+8;
		int count = 0;
		
		boolean TF = arr[x][y]; // 첫 번째 칸의 색
		
		for(int i=x; i<end_x;i++) {
			for(int j=y; j<end_y;j++) {
				// 올바른 색이 아닐 경우 count++
				if(arr[i][j] != TF) {
					count++;
				}
				
				TF = !TF;
			}
			TF = !TF;
		}
		
		count = Math.min(count, 64-count);
		
		min = Math.min(min, count);
	}

}
