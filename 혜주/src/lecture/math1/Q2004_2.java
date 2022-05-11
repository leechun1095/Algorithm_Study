package lecture.math1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2004_2{

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// 숫자의 범위(200억)가 int(~21억)보다 크므로 long 사용해야 함
		long N = Long.parseLong(st.nextToken());
		long M = Long.parseLong(st.nextToken());
		
		// 인수 중 (2 X 5)의 쌍이 몇개인지 찾는다.
		// 조합은 항상 2의 개수가 5의 개수보다 많다는 사실이 보장되지 않는다.
		// 2와 5의 개수를 둘 다 구하고 그중 적은값으로 10의 개수를 찾는다.
		
		// 5 * n -> n이 또 5의 배수이면 그만큼 5의 개수가 늘어난다.
		// 5^2 * n
		// 5^3 * n
		// ...
		
		// 이항계수
		// n C m = n! / ((n-m)!m!)
		// N!의 0개수 - ((N-M)!의 0의 개수 + M!의 0의 개수)
		long[] facN = getFactorialZeroCnt(N);
		long[] facN_M = getFactorialZeroCnt(N-M);
		long[] facM = getFactorialZeroCnt(M);
		
		long result = Math.min(facN[0] - (facN_M[0] + facM[0]), facN[1] - (facN_M[1] + facM[1]));
		
		System.out.println(result);
	}

	// 팩토리얼의 0 개수 반환
	private static long[] getFactorialZeroCnt(long num) {
		long[] cnt = new long[2];
		
		// 5의 개수 구하기
		long cnt5 = 0;
		long div = 5;
		while(num / div > 0) {
			cnt5 += num / div;
			div *= 5;
		}
		cnt[0] = cnt5;
		
		// 2의 개수 구하기
		long cnt2 = 0;
		div = 2;
		while(num / div > 0) {
			cnt2 += num / div;
			div *= 2;
		}
		cnt[1] = cnt2;
		
		// [5의 개수, 2의 개수]
		return cnt;
	}
}
