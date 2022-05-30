package lecture.dynamic1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2193 {
	// 점화식 세우기
	// D[N] = 길이가 N이고 마지막 숫자가 L인 이친수의 개수
	// D[N][L] = D[N-1][0] + D[N-1][1]
	public static long mod = 1000000000L;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] d = new int[n+1][2];
		
		d[1][0] = 0;
		d[1][1] = 1;
		
		for(int i=2; i<=n; i++) {
			for(int j=0; j<=1; j++) {
				d[i][j] = 0;
				if(j == 1) {
					d[i][j] =+ d[i-1][0];
				} else { // j == 0
					d[i][j] =+ d[i-1][0];
					d[i][j] =+ d[i-1][1];
				}
			}
		}
		
		System.out.println(d[n][0] + d[n][1]);
	}
}
