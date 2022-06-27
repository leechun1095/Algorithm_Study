package 브루트포스_순열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10972 {
	
    static int N;
    static int[] arr;
    
	public static void main(String[] args) throws IOException {
		// 다음 순열
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		if(next_permutation()) {
			for(int i=0; i<N; i++) {
				System.out.print(arr[i] + " ");				
			}
		} else {
			System.out.println("-1");
		}
	}
	static boolean next_permutation() {
		// 1. A[i-1] < A[i]를 만족하는 가장 큰 i를 찾는다.
		// 723 6541 에서
		// i-1=3, i=6
		int i = arr.length-1; // 맨 마지막 인덱스부터 비교하기 위한 설정
		
		while(i>0 && arr[i-1] >= arr[i]) {
			i--;
		}
		if(i<=0) {
			return false;
		}
		
		// 2. A[j] > A[i-1] 를 만족하는 가장 작은 j를 찾는다.
		// 723 6541 에서
		// 다음 순열 : 724 6531 인데, i-1=3, j=4, 자리 변경, (i-1 < j && 뒤에 숫자들중 가장 작은 수) 
		// j=6   1 <= 3
		// j=5   4 <= 3		
		int j = arr.length-1; // 맨 마지막 인덱스부터 비교하기 위한 설정
		while(arr[j] <= arr[i-1]) {
			j--;
		}
		
		// 3. A[i-1]과 A[j]를 swap 한다.
		swap(i-1, j);
		
		// 4. A[i]부터 순열을 뒤집는다.
		// i=3, j=6  => 6 54 1 => 1 54 6
		// i=4, j=5  =? 1 54 6 => 1 45 6
		// i=5, j=4 break;
		j = arr.length-1;
		while(i<j) {
			swap(i, j);
			i++;
			j--;
		}
		return true;
	}
	
	private static void swap(int idx1, int idx2) {
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}
}
