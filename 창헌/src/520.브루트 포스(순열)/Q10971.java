package 브루트포스_순열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10971 {
	
    static int N;
    static int[][] map;
    
	public static void main(String[] args) throws IOException {
		// 외판원 순회 2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		int[] city = new int[N];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			city[i] = i;
			for(int j=0; j<N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());  
			}
		}
		
		int result = Integer.MAX_VALUE;
		do {
			int sum = 0;
			boolean flag = true;
			
			// 도시마다 거리 합계
			for(int i=0; i<N-1; i++) {
				if(map[city[i]][city[i+1]] == 0) {
					flag = false;
				} else {
					sum += map[city[i]][city[i+1]];
				}
			}
			
			// 마지막 도시 -> 처음 도시 이동 
			if(flag && map[city[N-1]][city[0]] != 0) {
				sum += map[city[N-1]][city[0]];
				if(result > sum) {
					result = sum;
				}
			}
		} while(next_permutation(city));
		System.out.println(result);
		
	}
	static boolean next_permutation(int[] arr) {
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
		swap(arr, i-1, j);
		
		// 4. A[i]부터 순열을 뒤집는다.
		j = arr.length-1;
		while(i<j) {
			swap(arr, i, j);
			i++;
			j--;
		}
		return true;
	}
	
	private static void swap(int[] arr, int idx1, int idx2) {
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}
}
