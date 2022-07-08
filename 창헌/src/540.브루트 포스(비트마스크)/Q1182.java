package 브루트포스_비트마스크;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1182 {

	public static void main(String[] args) throws IOException {
		// 부분수열의 합
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    	
		int N = Integer.parseInt(st.nextToken());
    	int S = Integer.parseInt(st.nextToken());
    	int[] arr = new int[N];
    	int result = 0;
    	
    	// 배열 입력
    	st = new StringTokenizer(br.readLine());
    	for(int i=0; i<N; i++) {
    		arr[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	// 부분 집합 전부 구하기 (공집합 제외)
    	int sum = 0;
    	for(int i=1; i<(1<<N); i++) {
    		sum = 0;
    		for(int j=0; j<N; j++) {
    			//j가 포함됐는지 체크 (&연산으로 0이 아닌 경우 포함된 것이다.)
    			if( (i & (1 << j)) != 0) {
    				sum += arr[j];
    			}
    		}
    		//합이 S일 경우
    		if(sum == S) {
    			result++;
    		}
    	}
    	System.out.println(result);
	}
}
