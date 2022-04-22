package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1018 {

	public static void main(String[] args) throws IOException {
		// 틀림.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);
		
		String[] arr = new String[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = br.readLine();
		}

		int cnt = 0;
		char next = ' ';
		
		// 첫번째 색깔 확인
		if(arr[0].charAt(0) == 'W') {
			// W시작
			next = 'B';
			
		} else {
			// B시작
			next = 'W';		
		}
		
		if(M%2 == 0) {
			// 가로줄이 짝수인 경우
			for(int i=0; i<N; i++) {
				
				for(int j=1; j<M; j++) {
					
					if(arr[i].charAt(j) == next) {
						if(next == 'B') {
							next = 'W';
						} else {
							next = 'B';
						}
					} else {
						if(next == 'B') {
							next = 'W';
						} else {
							next = 'B';
						}
						cnt++;
					}		
				}
			}
			System.out.println(cnt);		
		} else {
			// 가로줄이 홀수인 경우
			for(int i=0; i<N; i++) {
				
				
				for(int j=1; j<M; j++) {
					
					if(arr[i].charAt(j) == next) {
						if(next == 'B') {
							next = 'W';
						} else {
							next = 'B';
						}
					} else {
						if(next == 'B') {
							next = 'W';
						} else {
							next = 'B';
						}
						cnt++;
					}		
					
					if(j == (M-1)) {
						if(next == 'B') {
							next = 'W';
						} else {
							next = 'B';
						}
					}
				}
			}
			System.out.println(cnt);	
		}
		
		
		// input 데이터 확인
//		for(String val : arr) {
//			System.out.println(val);
//		}
	}

}
