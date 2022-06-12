package lecture.dynamic1_pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1932 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[][] a = new int[n][n];
        int[][] d = new int[n][n];
        
        StringTokenizer st;
        for (int i=0; i<n; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
            for (int j=0; j<=i; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        d[0][0] = a[0][0];
        for (int i=1; i<n; i++) {
            for (int j=0; j<=i; j++) {
                d[i][j] = d[i-1][j] + a[i][j];
                if (j-1 >= 0 && d[i][j] < d[i-1][j-1] + a[i][j]) {
                    d[i][j] = d[i-1][j-1] + a[i][j];
                }
            }
        }
        int ans = d[n-1][0];
        for (int i=0; i<n; i++) {
            if (ans < d[n-1][i]) {
                ans = d[n-1][i];
            }
        }
        System.out.println(ans);
	}
}
