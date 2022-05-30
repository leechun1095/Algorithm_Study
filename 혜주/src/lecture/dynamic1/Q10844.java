package lecture.dynamic1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10844 {
	// 점화식 세우기
	// D[N] = 길이가 N이고 마지막 숫자가 L인 계단수의 총 개수
	// D[N][L] = D[N-1][L-1] + D[N-1][L+1]
	public static long mod = 1000000000L;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		long[][] d = new long[n+1][10];
		
		for(int i=1; i<=9; i++) {
			d[1][i] = 1;
		}
		
		for(int i=2; i<=n; i++) {
			for(int j=0; j<=9; j++) {
				d[i][j] = 0;
				if(j-1 >= 0) {
					d[i][j] =+ d[i-1][j-1];
				}
				if(j+1 <= 9) {
					d[i][j] =+ d[i-1][j+1];
				}
				d[i][j] %= mod;
			}
		}
		
		long ans = 0;
		for(int i=0; i<=9; i++) {
			ans += d[n][i];
		}
		ans %= mod;
		System.out.println(ans);
	}
}
