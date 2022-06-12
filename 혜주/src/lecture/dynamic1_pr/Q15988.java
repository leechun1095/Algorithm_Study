package lecture.dynamic1_pr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q15988 {
	// 점화식 세우기
	// D[n] = n을 1,2,3의 합으로 나타내는 방법의 수
	// D[n] = D[n-1] + D[n-2] + D[n-3]
	
	static final long mod = 1000000009L;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 1~10까지 방법의 수 모두 구하기
		int[] d = new int[1000001];
		d[0] = 1;
		for (int i=1; i<=1000000; i++) {
            for (int j=1; j<=3; j++) {
                if (i-j >= 0) {
                    d[i] += d[i-j];
                }
            }
            d[i] %= mod;
        }

		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(d[n]);
        }
	}
}
