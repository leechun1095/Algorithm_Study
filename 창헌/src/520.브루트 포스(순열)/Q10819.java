package 브루트포스_순열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10819 {

    static int N;
    static int[] arr;
    
	public static void main(String[] args) throws IOException {
		// 차이를 최대로
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		int result = 0;
		
		do {
			result = Math.max(result, calculate(arr));
		} while(next_permutation());
		
		System.out.println(result);
		
	}
	static int calculate(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length-1; i++) {
			sum = sum + Math.abs(arr[i] - arr[i+1]);
		}
		return sum;
	}
	static boolean next_permutation() {
		// 1. A[i-1] < A[i]를 만족하는 가장 큰 i를 찾는다.
		int i = arr.length-1; // 맨 마지막 인덱스부터 비교하기 위한 설정
		
		while(i>0 && arr[i-1] >= arr[i]) {
			i--;
		}
		if(i<=0) {
			return false;
		}
		
		// 2. A[j] > A[i-1] 를 만족하는 가장 작은 j를 찾는다.
		int j = arr.length-1; // 맨 마지막 인덱스부터 비교하기 위한 설정
		while(arr[j] <= arr[i-1]) {
			j--;
		}
		
		// 3. A[i-1]과 A[j]를 swap 한다.
		swap(i-1, j);
		
		// 4. A[i]부터 순열을 뒤집는다.
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