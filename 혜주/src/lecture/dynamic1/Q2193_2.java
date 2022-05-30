package lecture.dynamic1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2193_2 {
	// 점화식 세우기
	// D[N] = 길이가 N인 이친수의 개수
	// D[N] = D[N-1] + D[N-2]
	public static long mod = 1000000000L;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		long[] d = new long[n+1];
		
		d[1] = 1;
		if(n >= 2) {
			d[2] = 1;
		}
		for(int i=3; i<=n; i++) {
			d[n] = d[n-1] + d[n-2];
		}
		
		System.out.println(d[n]);
	}
}
