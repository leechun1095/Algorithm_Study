package lecture.dynamic1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11726 {
	// 점화식 세우기
	// D[n] = 2 X n 직사각형을 채우는 방법의 수
	// D[n] = D[n-1] + D[n-2]
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		int[] d = new int[1001];
		
		d[0] = 1;
		d[1] = 1;
		for(int i=2; i<=n; i++) {
			d[i] = d[i-1] + d[i-2];
			d[i] %= 10007;
		}
		
		System.out.println(d[n]);
	}
}
