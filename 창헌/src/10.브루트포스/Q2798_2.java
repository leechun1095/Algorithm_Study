package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2798_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		int N = Integer.parseInt(str[0]);	// 카드의 개수
		int M = Integer.parseInt(str[1]);	// 최대값 
		
		// N=5, M=21
		int[] arr = new int[N]; // 카드의 숫자 배열
		
		str = br.readLine().split(" ");
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		int result = search(arr, N, M);
		System.out.println(result);
		
	}
	static int search(int[] arr, int N, int M) {
		int result = 0;
		
		// 첫번째 카드
		for(int i=0; i<N-2; i++) {
			
			// 두번째 카드
			for(int j=i+1; j<N-1; j++) {
				
				// 세번째 카드
				for(int k=j+1; k<N; k++) {
					
					// 3개의 카드 합
					int temp = arr[i] + arr[j] + arr[k];
					
					// M과 3개의 카드 합이 같다면 return temp 및 종료
					if(M == temp) {
						return temp;
					}
					
					// M과 가장 가까운 3개의 카드의 합을 구하기
					if(result < temp && temp < M) {
						result = temp;
					}
				}
			}
		}
		return result;
	}
}