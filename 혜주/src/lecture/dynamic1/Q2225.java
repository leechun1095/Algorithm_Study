package lecture.dynamic1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2225 {
	// 점화식 세우기
	// D[N][K] = 0부터 N까지의 정수 K개를 더해서 그 합이 N이 되는 경우의 수
	// D[N][K] = SUM( D[K-1][N-L] )
	// 0 <= L <= N
	
	public static long mod = 1000000000L;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		long[][] d = new long[k+1][n+1];
		d[0][0] = 1;
		
		for(int i=1; i<=k; i++) {
			for(int j=0; j<=n; j++) {
				for(int l=0; l<=j; l++) {
					d[i][j] += d[i-1][j-l];
					d[i][j] %= mod;
				}
			}
		}
		
		System.out.println(d[k][n]);
	}
}
