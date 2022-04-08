package 기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3009 {

	public static void main(String[] args) throws IOException {
		/* x축 값 비교 : 1 2,	1 3,	2 3		3번
		   y축 값 비교 : 1 2,	1 3, 	2 3		3번
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[8];
		
		String[] str = new String[2];
		int j = 0;
		
		for(int i=0; i<3; i++) {
			str = br.readLine().split(" ");
			arr[j] = Integer.parseInt(str[0]);
			j ++;
			arr[j] = Integer.parseInt(str[1]);
			j ++;
		}
		
		/*
		for(int val : arr) {
			System.out.println(val);
		}
		*/
		
		// x축 비교 : 0 2 4 6
		if(arr[0] == arr[2]) {
			arr[6] = arr[4];
		} else if(arr[0] == arr[4]) {
			arr[6] = arr[2];
		} else {
			arr[6] = arr[0];
		}
		
		// y축 비교 : 1 3 5 7
		if(arr[1] == arr[3]) {
			arr[7] = arr[5];
		} else if(arr[1] == arr[5]) {
			arr[7] = arr[3];
		} else {
			arr[7] = arr[1];
		}
		
		System.out.println(arr[6] + " " + arr[7]);	
	}
}
