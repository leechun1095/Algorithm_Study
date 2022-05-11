package lecture.math1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1934 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int k=0; k<n; k++) {
			st = new StringTokenizer(br.readLine(), " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			int min = Math.min(A, B);
			// 최대공약수 찾기
			int maxDivNum = 0;
			for(int i=min; i>=1; i--) {
				if(A % i == 0 && B % i == 0) {
					maxDivNum = i;
					break;
				}
			}
			
			sb.append(A*B / maxDivNum).append("\n");
		}
		System.out.println(sb);
	}
}
