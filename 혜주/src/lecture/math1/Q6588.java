package lecture.math1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q6588 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		int input;
		while((input = Integer.parseInt(br.readLine())) != 0) {
			for(int i=2; i<input;i++) {
				if(isPrime(i) && isPrime(input-i)) {
					sb.append(input + " = " + i + " + " + (input-i)).append("\n");
					break;
				}
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
