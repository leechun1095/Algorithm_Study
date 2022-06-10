package lecture.dynamic1_pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1149 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
        int[][] a = new int[n+1][3];
        int[][] d = new int[n+1][3];
        StringTokenizer st;
        for (int i=1; i<=n; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
            for (int j=0; j<3; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i=1; i<=n; i++) {
            d[i][0] = Math.min(d[i-1][1], d[i-1][2]) + a[i][0];
            d[i][1] = Math.min(d[i-1][0], d[i-1][2]) + a[i][1];
            d[i][2] = Math.min(d[i-1][0], d[i-1][1]) + a[i][2];
        }
        System.out.println(Math.min(Math.min(d[n][0], d[n][1]),d[n][2]));
	}
}
