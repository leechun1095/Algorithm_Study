package 일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10818 {

	public static void main(String[] args) throws IOException {
		// 네번째 풀이(배열 사용 X, 입력받은 문자 즉시 비교) : 90,352KB	596ms
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int minVal = Integer.MIN_VALUE;
		int maxVal = Integer.MAX_VALUE;
		
		// N은 사용안하므로 입력만 받는다.
		Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		while(st.hasMoreTokens()) {
			int val = Integer.parseInt(st.nextToken());
			if(minVal > val) {
				minVal = val;
			}
			if(maxVal < val) {
				maxVal = val;
			}
		}
		br.close();
		System.out.println(minVal + " " + maxVal);
		
		
		/* 세번째 풀이(int 배열 사용 X, 입력받은 문자 즉시 비교) : 106,296KB	580ms 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int minVal = 1000001;
		int maxVal = -1000001;
		
		int N = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		
		
		for(int i=0; i<N; i++) {
			if(minVal > Integer.parseInt(str[i])) {
				minVal = Integer.parseInt(str[i]);
			}
			if(maxVal < Integer.parseInt(str[i])) {
				maxVal = Integer.parseInt(str[i]);
			}
		}
		br.close();
		System.out.println(minVal + " " + maxVal);
		*/
		
		/* 두번째 풀이(배열 정렬 사용) : 123,100KB	1,468ms
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		String[] str = br.readLine().split(" ");
		
		for(int i=0; i<N; i++) {	
			arr[i] = Integer.parseInt(str[i]);
		}
		br.close();
		
		// 배열 정렬 사용
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[N-1]);
		*/
		
		/* 첫번째 풀이(생각나는 대로) : 109,508KB	560ms
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		String[] str = br.readLine().split(" ");
		// 초기화 부분을 어떻게 처리할지 고민함.
		int minVal = Integer.parseInt(str[0]);
		int maxVal = Integer.parseInt(str[0]);
		
		for(int i=0; i<N; i++) {	
			arr[i] = Integer.parseInt(str[i]);
			
			if(minVal > arr[i]) {
				minVal = arr[i];
			}
			if(maxVal < arr[i]) {
				maxVal = arr[i];
			}
		}
		br.close();
		System.out.println(minVal + " " + maxVal);
		*/
	}

}
