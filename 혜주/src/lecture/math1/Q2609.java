package lecture.math1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2609 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int min = Math.min(A, B);
		// 최대공약수 찾기
		int maxDivNum = 0;
		for(int i=min; i>=2; i--) {
			if(A % i == 0 && B % i == 0) {
				maxDivNum = i;
				break;
			}
		}
		
		// 최대공약수
		System.out.println(maxDivNum);
		// 최소공배수 = A * B / 최대공약수
		System.out.println(A*B / maxDivNum);
	}
}
