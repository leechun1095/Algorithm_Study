package lecture.dynamic1_pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q13398 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        
        int[] d = new int[n];
        int[] dr = new int[n];
        for (int i=0; i<n; i++) {
            d[i] = a[i];
            if (i > 0 && d[i] < d[i-1] + a[i]) {
                d[i] = d[i-1] + a[i];
            }
        }
        for (int i=n-1; i>=0; i--) {
            dr[i] = a[i];
            if (i < n-1 && dr[i] < dr[i+1] + a[i]) {
                dr[i] = dr[i+1] + a[i];
            }
        
        }
        int ans = d[0];
        for (int i=1; i<n; i++) {
            if (ans < d[i]) {
                ans = d[i];
            }
        }
        for (int i=1; i<n-1; i++) {
            if (ans < d[i-1] + dr[i+1]) {
                ans = d[i-1] + dr[i+1];
            }
        }
        System.out.println(ans);
	}
}
