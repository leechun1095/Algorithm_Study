package lecture.dynamic1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1912 {
	// 점화식 세우기
	// D[N] = 길이가 N인 수열에서 연속된 몇 개의 수를 선택해서 구할 수 있는 가장 큰 합
	// D[N] = Max( D[N-1] + A[I] , A[I] )
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] a = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] d = new int[n];
		for(int i=0; i<n; i++) {
			d[i] = a[i];
			
			if(i == 0) {
				continue;
			}
			if(d[i] < d[i-1] + a[i]) {
				d[i] = d[i-1] + a[i];
			}
		}
		
		int ans = d[0];
		for(int i=0; i<n; i++) {
			if(ans < d[i]) {
				ans = d[i];
			}
		}
		
		System.out.println(ans);
	}
}
