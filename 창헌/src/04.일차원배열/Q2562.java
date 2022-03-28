package 일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2562 {

	public static void main(String[] args) throws IOException {
		// 세번째 풀이(배열 사용, for문 1번) : 15,980KB		152ms
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		
		int maxVal = 0;
		int index = 0;
		
		for(int i=0; i<9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(maxVal < arr[i]) {
				maxVal = arr[i];
				index = i+1;
			}
		}
		br.close();
		System.out.println(maxVal + "\n" + index);
		
		/* 두번째 풀이(배열 사용) : 16,032KB	152ms
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		
		for(int i=0; i<9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
				
		int maxVal = 0;
		int index = 0;
		
		for(int i=0; i<9; i++) {
			if(maxVal < arr[i]) {
				maxVal = arr[i];
				index = i+1;
			}
		}
		br.close();
		System.out.println(maxVal + "\n" + index);
		*/
		
		/* 첫번째 풀이(배열 사용 X) : 15,924KB		148ms
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int maxVal = 0;
		int index = 0;
		
		for(int i=0; i<9; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(maxVal < num) {
				maxVal = num;
				index = i+1;
			}
		}
		br.close();
		System.out.println(maxVal + "\n" + index);
		*/
	}
}
