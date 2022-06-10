package lecture.dynamic1_pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11054 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        int[] d = new int[n];
        for (int i=0; i<n; i++) {
            d[i] = 1;
            for (int j=0; j<i; j++) {
                if (a[j] < a[i] && d[i] < d[j]+1) {
                    d[i] = d[j]+1;
                }
            }
        }
        int[] d2 = new int[n];
        for (int i=n-1; i>=0; i--) {
            d2[i] = 1;
            for (int j=i+1; j<n; j++) {
                if (a[i] > a[j] && d2[j]+1 > d2[i]) {
                    d2[i] = d2[j]+1;
                }
            }
        }
        int ans = d[0]+d2[0]-1;
        for (int i=0; i<n; i++) {
            if (ans < d[i]+d2[i]-1) {
                ans = d[i]+d2[i]-1;
            }
        }
        System.out.println(ans);
	}
}
