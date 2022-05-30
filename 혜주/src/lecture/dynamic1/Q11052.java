package lecture.dynamic1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11052 {
	// 점화식 세우기
	// D[n] = 카드 n개를 갖기 위해 지불해야 하는 금액의 최댓값
	// P[i] = i번째 카드팩의 금액
	// D[n] = Max(D[n-1] + P[i])
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		// 카드팩 금액 배열
		int[] p = new int[n+1];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=1; i<=n; i++) {
			p[i] = Integer.parseInt(st.nextToken());
		}
		
		// 점화식
		int[] d = new int[n+1];
		for(int i=1; i<=n; i++) {
			for(int k=1; k<=i; k++) {
				d[i] = Math.max(d[i], p[k] + d[i-k]);
			}
		}
		
		System.out.println(d[n]);
	}
}
