package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2798 {

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
		
		search(arr, N, M);
		
	}
	static int search(int[] arr, int N, int M) {
		int result = 0;
		
		for(int i=0; i<N-2; i++) {
//			System.out.println("i[" + i+ "]" +arr[i]);
			
			for(int j=i+1; j<N-1; j++) {
//				System.out.println("j[" + j+ "]" +arr[j]);
				
				for(int k=j+1; k<N; k++) {
//					System.out.println("k[" + k+ "]" +arr[k]);
					
					System.out.println("arr["+i+"]="+arr[i]);
					System.out.println("arr["+j+"]="+arr[j]);
					System.out.println("arr["+k+"]="+arr[k]);
					System.out.println();
				}
			}
		}
		
		return result;
	}
}
