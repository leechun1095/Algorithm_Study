package lecture.dynamic1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1463_2 {
	
	public static int[] d;
	
	public static int go(int n) {
		
		if(n == 1) {
			return 0;
		}
		if(d[n] > 0) {
			return d[n]; // 메모이제이션
		}
		
		d[n] = go(n-1) + 1;
		
		if(n%2 == 0) {
			int temp = go(n/2) + 1;
			if(d[n] > temp) {
				d[n] = temp;
			}
		}
		
		if(n%3==0) {
			int temp = go(n/3)+1;
			if(d[n] > temp) {
				d[n] = temp;
			}
		}
		
		return d[n];
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
//		1. X가 3으로 나누어 떨어지면, 3으로 나눈다.
//		d[3] = 1 + d[n/3]
//		2. X가 2로 나누어 떨어지면, 2로 나눈다.
//		d[2] = 1 + d[n/2]
//		3. 1을 뺀다.
//		d[1] = 1 + d[n-1]
//		d[N] = min(d[n/3],d[n/2],d[n-1]) + 1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		d = new int[n+1];
		
		System.out.println(go(n));
	}
}
