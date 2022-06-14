package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3085 {
    public static char[][] arr;
    public static int N;
    public static int max = 0;

	public static void main(String[] args) throws IOException {
		// 사탕 게임
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		arr = new char[N][N];
		int maxA = 0;
		int maxB = 0;
		
		String str = "";
		for(int i=0; i<N; i++) {
			str = br.readLine();
			arr[i] = str.toCharArray();
		}
		
		/*
		for(int i=0; i<N; i++) {
			System.out.println();
			for(int j=0; j<N; j++) {
				System.out.print(arr[i][j] + " ");
			}
		}
		*/
		
        // 행
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N-1; j++) {
                char temp = arr[i][j];
                arr[i][j] = arr[i][j+1];
                arr[i][j+1] = temp;
                // max값 찾으러
                maxA = search();
                // 원상 복구
                temp = arr[i][j];
                arr[i][j] = arr[i][j+1];
                arr[i][j+1] = temp;
            }
        }
        
        // 열
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N-1; j++) {
                char temp = arr[j][i];
                arr[j][i] = arr[j+1][i];
                arr[j+1][i] = temp;
                // max값 찾으러
                maxB = search();
                // 원상 복구
                temp = arr[j][i];
                arr[j][i] = arr[j+1][i];
                arr[j+1][i] = temp;
            }
        }
        br.close();
        System.out.println(Math.max(maxA, maxB));

	}
	private static int search() {
        // 가로
        for(int i = 0; i < N; i++) {
            int cnt = 1;
            for(int j = 0; j < N-1; j++) {
                if(arr[i][j] == arr[i][j+1]) {
                    cnt++;
                } else {
                    cnt = 1;
                }
                max = Math.max(max, cnt);
            }
        }
        
        // 세로
        for(int i = 0; i < N; i++) {
            int cnt = 1;
            for(int j = 0; j < N-1; j++) {
                if(arr[j][i] == arr[j+1][i]) {
                    cnt++;
                } else {
                    cnt = 1;
                }
                max = Math.max(max, cnt);
            }
        }
        
        return max;
    }
}
