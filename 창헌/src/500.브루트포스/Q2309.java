package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2309 {

	public static void main(String[] args) throws IOException {
		// 일곱 난쟁이
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
 		
		int[] arr = new int[9];
		int sum = 0;
		int spyA = 0;
		int spyB = 0;
		
		for(int i=0; i<arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			
			arr[i] = Integer.parseInt(st.nextToken());
			sum += arr[i];
		}
		br.close();
		
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(sum - arr[i] - arr[j] == 100) {
					spyA = arr[i];
					spyB = arr[j];
					break;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == spyA || arr[i] == spyB) {
				continue;
			}
			System.out.println(arr[i]);
		}
	}
}
