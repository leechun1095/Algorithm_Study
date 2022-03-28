package 일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q8958 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 14,260KB		128ms
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); // 테스트 케이스 수
		String[] arr = new String[N];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = br.readLine();
		}
		
		
		for(int i=0; i<arr.length; i++) {
			int cnt = 0; // 연속횟수
			int sum = 0; // 합산 점수
			
			for(int k=0; k<arr[i].length(); k++) {
				if(arr[i].charAt(k) == 'O') {
					cnt++;
				} else {
					cnt = 0;
				}
				sum += cnt;
			}
			System.out.println(sum);
		}
	}
}
