package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1107 {
	static boolean[] arrM;
	
	public static void main(String[] args) throws IOException {
		// 리모컨
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		// N = 이동하려는 채널  0 ≤ N ≤ 500,000
		int N = Integer.parseInt(br.readLine());
		
		// M = 고장난 버튼의 수 	0 ≤ M ≤ 10
		int M = Integer.parseInt(br.readLine());

		// arrM[] true 초기화, 고장 시 false
		arrM = new boolean[10];
		
		for(int i=0; i<10; i++) {
			arrM[i] = true;
		}
		
		if(M > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			
			for(int i=0; i<M; i++) {
				int temp = Integer.parseInt(st.nextToken());
				// 고장 시 false
				arrM[temp] = false; 
			}
		}
		
		int min_cnt = Math.abs(N - 100);    // +,- 로만 누르는 경우
		
		for(int i = 0; i <= 999999; i++) {  // 0~999999까지 순서대로 채널을 이동한 뒤 + 또는 -를 눌러서 N 채널로 이동하기 위한 경우의 수를 모두 구하기 위함.
			int len = check(i);
			
			if(len > 0) {
				int press = i-N; // i 채널로 이동했을 때 N채널로 가기위해 +를 몇번 눌러야 하는지 구하기
				if(press < 0) { // 절대값 처리
					press = -press; // 
				}
				if(min_cnt > len + press) {
					min_cnt = len + press;
				}
			}
			
		}
		br.close();
		System.out.println(min_cnt);
	}
	static int check(int n) {
		if(n == 0) {
			if(arrM[0] == false) {
				return 0;
			} else {
				return 1;
			}
		}
		int len = 0;
		
		while(n > 0) {
			if(arrM[n % 10] == false) {
				return 0;
			}
			n /= 10;
			len+=1;
		}
		return len;
	}
}
