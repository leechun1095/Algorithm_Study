package lecture.dynamic1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1463_3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		int[] d = new int[n+1];
		
		d[1] = 0;
		for(int i=2; i<=n; i++) {
			d[i] = d[i-1] + 1;
			if(i%2 == 0 && d[i] > d[i/2]+1) {
				d[i] = d[i/2]+i;
			}
			if(i%3==0 && d[i] > d[i/3]+1) {
				d[i] = d[i/3]+i;
			}
		}
		
		System.out.println(d[n]);
	}
}
