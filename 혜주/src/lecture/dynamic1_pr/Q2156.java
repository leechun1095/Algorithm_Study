package lecture.dynamic1_pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2156 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n+1];
        for (int i=1; i<=n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        int[] d = new int[n+1];
        d[1] = a[1];
        if (n >= 2) {
            d[2] = a[1]+a[2];
        }
        for (int i=3; i<=n; i++) {
            d[i] = d[i-1];
            d[i] = Math.max(d[i], d[i-2]+a[i]);
            d[i] = Math.max(d[i], d[i-3]+a[i-1]+a[i]);
        }
        int ans = d[1];
        for (int i=2; i<=n; i++) {
            ans = Math.max(ans, d[i]);
        }
        System.out.println(ans);
	}
}
