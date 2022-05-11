package lecture.math1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1978 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int cnt = 0;
		for(int k=0; k<n; k++) {
			int num = Integer.parseInt(st.nextToken());
			
			if(isPrime(num)) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

	private static boolean isPrime(int num) {
		if(num == 1) {
			return false;
		}

		for(int i=2; i<=Math.sqrt(num); i++) {
			if(num % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
