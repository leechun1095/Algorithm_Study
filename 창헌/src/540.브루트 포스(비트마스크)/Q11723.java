package 브루트포스_비트마스크;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11723 {

	public static void main(String[] args) throws IOException {
		// 집합
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int M = Integer.parseInt(st.nextToken()); // 연산 수
		int S = 0;
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			String oper = st.nextToken();
			switch(oper) {
				case "add" : {
					// 추가할 때 기존에 값이 있어도 |(or) 연산이기 때문에 무시된다.
					int n = Integer.parseInt(st.nextToken());
					S = S | (1<<n);
					break;
				}
				case "remove" : {
					int n = Integer.parseInt(st.nextToken());
					S = S & ~(1<<n); 
					break;
				}
				case "check" : {
					int n = Integer.parseInt(st.nextToken());
					// 포함 여부 검사
					if((S&(1<<n)) > 0) {
						sb.append("1\n");
					} else {
						sb.append("0\n");
					} 
					break;
				}
				case "toggle" : {
					int n = Integer.parseInt(st.nextToken());
					S = S ^ (1<<n); 
					break;
				}
				case "all" : {
					S = (1<<21) -1; 
					break;
				}
				case "empty" : {
					S = 0; 
					break;
				}
			}
		}
		System.out.println(sb);
	}

}
