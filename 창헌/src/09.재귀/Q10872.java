package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10872 {

	public static void main(String[] args) throws IOException {
		// 반복문으로 풀기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		
		while(n != 0) {
			arr[n-1] = n;
			n--;
		}
		int result = 1;
		for(int val : arr) {
			result = result * val;
		}
		System.out.println(result);
		
	}
}
