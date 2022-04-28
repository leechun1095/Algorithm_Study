package step.G_기본수학1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
// 시간초과
public class Q2869 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken()); // 올라가는 높이
		int B = Integer.parseInt(st.nextToken()); // 미끄러지는 높이
		int V = Integer.parseInt(st.nextToken()); // 전체 높이
		
		int days = 0;
		
		while(true) {
			V -= A;
			days++;
			if(V <= 0) {
				break;
			} else {
				V += B;
			}
		}
		
		System.out.println(days);
		
		br.close();
	}

}
