package lecture.dynamic1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1699 {
	// 점화식 세우기
	// D[N] = 자연수 N을 이렇게 제곱수들의 합으로 표현할 때에 그 항의 최소개수
	// D[n] = Min(D[n-i^2]) + 1
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] d = new int[n];
		for(int i=1; i<n; i++) {
			d[i] = i;
			for(int k=1; k*k <= i; k++) {
				if(d[i] > d[n-k*k] + 1) {
					d[i] = d[n-k*k] + 1;
				}
			}
		}
		
		System.out.println(d[n]);
	}
}
