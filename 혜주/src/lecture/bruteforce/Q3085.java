package lecture.bruteforce;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q3085 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		char[][] arr = new char[n][n];
		
		for(int i=0; i<n; i++) {
//			char[] lineArr =  br.readLine().toCharArray();
//			for(int k=0; k<n; k++) {
//				arr[i][k] = lineArr[k];
//			}
			arr[i] = br.readLine().toCharArray();
		}
		
		int ans = 0;
		
		for(int i=0; i<n; i++) {
			for(int k=0; k<n; k++) {
				// 행 swap
				if(k+1 < n) {
					// swap
					char t = arr[i][k];
					arr[i][k] = arr[i][k+1];
					arr[i][k+1] = t;
					
					int temp = getArrMaxCnt(arr);
					
					ans = Math.max(ans, temp);
					
					// 원상복구
					t = arr[i][k];
					arr[i][k] = arr[i][k+1];
					arr[i][k+1] = t;
				}
				
				// 열 swap
				if(i+1 < n) {
					// swap
					char t = arr[i][k];
					arr[i][k] = arr[i+1][k];
					arr[i+1][k] = t;
					
					int temp = getArrMaxCnt(arr);
					
					ans = Math.max(ans, temp);
					
					// 원상복구
					t = arr[i][k];
					arr[i][k] = arr[i+1][k];
					arr[i+1][k] = t;
				}
			}
			
		}
		
		System.out.println(ans);
	}

	// swap된 배열 중 연속되는 최대 행,열 갯수 구하기
	private static int getArrMaxCnt(char[][] arr) {
		
		int max = 0;
		
		for(int i=0; i<arr.length; i++) {
			int cnt = 1;
			for(int k=1; k<arr.length; k++) {
				if(arr[i][k-1] == arr[i][k]) {
					cnt++;
				} else {
					cnt = 1;
				}
				max = Math.max(cnt, max);
			}
			
			cnt = 1;
			for(int k=1; k<arr.length; k++) {
				if(arr[k-1][i] == arr[k][i]) {
					cnt++;
				} else {
					cnt = 1;
				}
				max = Math.max(cnt, max);
			}
		}
		
		return max;
	}
}
