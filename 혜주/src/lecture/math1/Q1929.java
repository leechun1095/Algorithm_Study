package lecture.math1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1929 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		for(int k=M; k<=N; k++) {
			
			if(isPrime(k)) {
				sb.append(k).append("\n");
			}
		}
		
		System.out.println(sb);
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
