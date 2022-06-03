package lecture.dynamic1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q9095 {
	// 점화식 세우기
	// D[n] = n을 1,2,3의 합으로 나타내는 방법의 수
	// D[n] = D[n-1] + D[n-2] + D[n-3]
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
			sb.append(getResult(Integer.parseInt(br.readLine()))).append("\n");
		}
		
		System.out.println(sb);
	}

	private static int getResult(int num) {
		int[] d = new int[11];
		
		d[0] = 1;
		d[1] = 1;
		d[2] = 2;
		for(int i=3; i<=num; i++) {
			d[i] = d[i-1] + d[i-2] + d[i-3];
		}
		return d[num];
	}
}
