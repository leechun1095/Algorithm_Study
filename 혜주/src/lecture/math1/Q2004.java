package lecture.math1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2004{

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		// 인수 중 (2 X 5)의 쌍이 몇개인지 찾는다.
		// 항상 2의 개수 > 5의 개수이므로 5의 개수를 찾으면 0의 갯수를 알 수 있다.
		
		// 5 * n -> n이 또 5의 배수이면 그만큼 5의 개수가 늘어난다.
		// 5^2 * n
		// 5^3 * n
		// ...
		
		// 이항계수
		// n C m = n! / ((n-m)!m!)
		// N!의 0개수 - ((N-M)!의 0의 개수 + M!의 0의 개수)
		int result = getFactorialZeroCnt(N) - (getFactorialZeroCnt(N-M) + getFactorialZeroCnt(M));
		
		System.out.println(result);
	}

	// 팩토리얼의 0 개수 반환
	private static int getFactorialZeroCnt(int num) {
		int cnt = 0;
		int div = 5;
		while(num / div > 0) {
			cnt += num / div;
			div *= 5;
		}
		return cnt;
	}
}
